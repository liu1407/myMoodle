package com.moodle.util;

import java.io.BufferedWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.output.FileWriterWithEncoding;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 通过读取excel表格生成实体类
 * 
 * @author liuhao
 *
 */
public class GetSQLByExcel {

	public final static String enterStr = "\n\r";
	public final static String tabStr = "\t";
	private final static Logger logger = LoggerFactory.getLogger(GetSQLByExcel.class);

	public static void main(String[] args) {
		File myFile = new File("E:/考试文档/表结构文档/表.xlsx");

		String outputPath = "";
		try {
			// 获取数据
			Map<String, List<String>> map = GetSQLByExcel.readExcel(myFile);

			// 遍历map
			for (String tableName : map.keySet()) {
				outputPath = "E:/考试文档/sql文档/javaSql/" + tableName + ".sql";
				List<String> columList = map.get(tableName);
				if (CommonUtils.isEmpty(columList)) {
					logger.info("columList为空，读取文件异常");
					return;
				}
				// 写入文件
				writeToFile(columList, outputPath);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 遍历所有sheet以及其包含的cell,并保存在list中
	 * 
	 * @param myFile
	 * @return
	 * @throws Exception
	 */
	public static Map<String, List<String>> readExcel(File myFile) throws Exception {
		/*
		 * 表名-getSheetName，中文描述-11列 1~5、7列
		 * 
		 */
		Map<String, List<String>> resultMap = new HashMap<String, List<String>>();

		XSSFWorkbook workBook = new XSSFWorkbook(myFile);
		for (int i = 0; i < workBook.getNumberOfSheets(); i++) {

			XSSFSheet sheet = workBook.getSheetAt(i);
			List<String> columLst = new ArrayList<String>();// 字符串列表
			String tableName = sheet.getSheetName();// 表名
			String tableNameDescr = getCellValue(sheet.getRow(0).getCell(10));// 中文描述

			columLst.add(tableName);// 表名
			columLst.add(tableNameDescr);// 表中文名
			int count = sheet.getPhysicalNumberOfRows();
			logger.info("共有：" + count + "行");
			for (int j = 1; j < count; j++) {

				String c1, c2, c3, c4, c5, c7, splitFlg = "*";
				StringBuffer sb = new StringBuffer();
				c1 = getCellValue(sheet.getRow(j).getCell(0));// 字段名
				c2 = getCellValue(sheet.getRow(j).getCell(1));// 字段描述
				c3 = getCellValue(sheet.getRow(j).getCell(2));// 字段类型
				c4 = getCellValue(sheet.getRow(j).getCell(3));// 字段长度
				c5 = getCellValue(sheet.getRow(j).getCell(4));// 是否为空
				c7 = getCellValue(sheet.getRow(j).getCell(6));// 是否主键
				sb.append(c1);
				sb.append(splitFlg);
				sb.append(c2);
				sb.append(splitFlg);
				sb.append(c3);
				sb.append(splitFlg);
				sb.append(c4);
				sb.append(splitFlg);
				sb.append(c5);
				sb.append(splitFlg);
				sb.append(c7);
				columLst.add(sb.toString());
			}
			resultMap.put(tableName, columLst);
		}

		workBook.close();
		return resultMap;
	}

	public static String getCellValue(XSSFCell cell) {

		String value = null;
		if (CommonUtils.isNotEmpty(cell)) {
			CellType cellType = cell.getCellType();
			if ("FORMULA".equals(cellType.name())) {
				value = String.valueOf(cell.getRichStringCellValue());
			}
			if ("NUMERIC".equals(cellType.name())) {
				value = String.valueOf(cell.getNumericCellValue());
			}
			if ("STRING".equals(cellType.name())) {
				value = String.valueOf(cell.getRichStringCellValue());
			}
		}

		return value;
	}

	public static void createFile(String filePath) {
		System.out.println("create file:" + filePath);
		File myFile = new File(filePath);
		myFile = new File(filePath);
		if (myFile.exists()) {

			myFile.delete();
		}
		try {
			myFile.createNewFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void writeToFile(List<String> inputList, String tofilePath) {
		File toFile = new File(tofilePath);
		StringBuffer strBuf = new StringBuffer();

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriterWithEncoding(toFile, "UTF-8", false));
			String tableName = inputList.get(0);
			String tableNameDescr = inputList.get(1);

			/*----------建表语句---start-------------------*/
			// String str1 = "DROP TABLE " + tableName + ";";
			String startStr = "CREATE TABLE " + tableName + "(";
			String endStr = ");" + enterStr;
			String[] stArr = inputList.get(2).split("\\*");
			String primarykeyStr = "primary key(" + stArr[0] + ")";
			strBuf.append(startStr);
			logger.info(tableName);
			for (int i = 2; i < inputList.size(); i++) {
				String[] strArr = inputList.get(i).split("\\*");
				String c1, c3, c4, c5, tmpStr, spaceStr = " ";
				c1 = strArr[0];// 字段名
				c3 = strArr[2];// 字段类型
				if(strArr[3].matches("[0-9]+\\.?[0-9]*") == true){
					c4 = String.valueOf(Double.valueOf(strArr[3]).intValue());
				}else{
					c4 = strArr[3];// 长度
				}
				
				if("是".equals(strArr[4]) == true){
					c5 = "NULL";// 空
				}else{
					c5 = "NOT NULL";// 不为空
				}  
				
				// 拼接字符串
				tmpStr = c1 + spaceStr + c3 + "(" + c4 + ")" + spaceStr + c5 + ", ";
				logger.info(tmpStr);
				strBuf.append(tmpStr);
			}
			strBuf.append(primarykeyStr);
			strBuf.append(endStr);
			/*----------建表语句---end-------------------*/
			/*----------备注语句---start-------------------*/
			String commentTableStr = "COMMENT ON TABLE ";
			String commentColStr = "COMMENT ON COLUMN ";
			String commentIs = " IS \'";
			String commentEndStr = "\';";
			
			String commenStr = commentTableStr + tableName + commentIs + tableNameDescr + commentEndStr + enterStr;
			logger.info(commenStr);
			strBuf.append(commenStr);
			
			for (int i = 2; i < inputList.size(); i++) {
				String[] strArr = inputList.get(i).split("\\*");
				String c1, c2, tmpStr;
				c1 = strArr[0];
				c2 = strArr[1];
				tmpStr = commentColStr + tableName + "." + c1 + commentIs + c2 +commentEndStr + enterStr;
				logger.info(tmpStr);
				strBuf.append(tmpStr);
			}
			
			/*----------备注语句---end-------------------*/
			bw.write(strBuf.toString());

			bw.flush();
			bw.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 下划线格式字符串转换为驼峰格式字符串2
	 * 
	 * @param param
	 * @return
	 */
	public static String underlineToCamel2(String param) {
		if (param == null || "".equals(param.trim())) {
			return "";
		}
		StringBuilder sb = new StringBuilder(param);
		Matcher mc = Pattern.compile("_").matcher(param);
		int i = 0;
		while (mc.find()) {
			int position = mc.end() - (i++);
			sb.replace(position - 1, position + 1, sb.substring(position, position + 1).toUpperCase());
		}
		return sb.toString();
	}
}
