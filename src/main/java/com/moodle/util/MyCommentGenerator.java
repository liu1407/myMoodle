package com.moodle.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import javax.persistence.Column;
import javax.xml.bind.DatatypeConverter;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.InnerEnum;
import org.mybatis.generator.api.dom.java.JavaElement;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.MergeConstants;
import org.mybatis.generator.config.PropertyRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 自定义实现 注释生成器 CommentGenerator 接口
 * @author liuhao
 * @date 2018年1月17日上午10:22:11
 */
public class MyCommentGenerator implements CommentGenerator {

//	private final static Logger logger = LoggerFactory.getLogger(MyCommentGenerator.class);
	private Properties properties;
    private Properties systemPro;
    private boolean suppressDate;
    private boolean suppressAllComments;
    private boolean addRemarkComments;
    private String nowTime;

    /**
     * 无参构造
     */
    public MyCommentGenerator() {
        super();
        properties = new Properties();
        systemPro = System.getProperties();
        suppressDate = false;
        suppressAllComments = false;
        addRemarkComments = true;
        nowTime = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date());
    }

    /**
     * 添加Java文件注释
     */
    public void addJavaFileComment(CompilationUnit compilationUnit) {
//    	logger.info("addJavaFileComment");
    	if (suppressAllComments) {
            return;
        }
        return;
    }

    /**
     * Adds a suitable comment to warn users that the element was generated, and
     * when it was generated.
     */
    public void addComment(XmlElement xmlElement) {
//    	logger.info("addComment");
    	return;
    }

    /**
     * 给根节点添加注释
     */
    public void addRootComment(XmlElement rootElement) {
        // add no document level comments by default
//    	logger.info("addRootComment");
    	return;
    }

    /**
     * 获取配置文件中的属性Property的值
     */
    public void addConfigurationProperties(Properties properties) {
//    	logger.info("addConfigurationProperties");
    	this.properties.putAll(properties);
        suppressDate = isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_DATE));
        suppressAllComments = isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_ALL_COMMENTS));
        addRemarkComments = isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_ADD_REMARK_COMMENTS));
    }
    
    /**
     * 判断传入参数是否为true
     * @author 北北
     * @date 2018年2月2日下午3:55:06
     * @param property
     * @return
     */
    private boolean isTrue(String property) {
        if("true".equals(property)){
            return true;
        }
        return false;
    }

    /**
     * This method adds the custom javadoc tag for. You may do nothing if you do
     * not wish to include the Javadoc tag - however, if you do not include the
     * Javadoc tag then the Java merge capability of the eclipse plugin will
     * break.<br>
     * 添加javadoc自定义标签
     * 
     * @param javaElement
     *            the java element
     */
    protected void addJavadocTag(JavaElement javaElement, boolean markAsDoNotDelete) {
//       logger.info("addJavadocTag");
    	javaElement.addJavaDocLine(" *");
        StringBuilder sb = new StringBuilder();
        sb.append(" * ");
        sb.append(MergeConstants.NEW_ELEMENT_TAG);
        if (markAsDoNotDelete) {
            sb.append(" do_not_delete_during_merge");
        }
        String s = getDateString();
        if (s != null) {
            sb.append(' ');
            sb.append(s);
        }
        javaElement.addJavaDocLine(sb.toString());
    }

    /**
     * This method returns a formated date string to include in the Javadoc tag
     * and XML comments. You may return null if you do not want the date in
     * these documentation elements.
     * 
     * @return a string representing the current timestamp, or null
     */
    protected String getDateString() {
        String result = null;
        if (!suppressDate) {
            result = nowTime;
        }
        return result;
    }

    /**
     * 添加类注释
     */
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
//    	logger.info("addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable)");
    	if (suppressAllComments) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        innerClass.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedTable.getFullyQualifiedTable());
        sb.append(" ");
        sb.append(getDateString());
        innerClass.addJavaDocLine(sb.toString().replace("\n", " "));
        innerClass.addJavaDocLine(" */");
    }

    /**
     * 添加枚举注释
     */
    public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {
//    	logger.info("addEnumComment");
    	if (suppressAllComments) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        innerEnum.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedTable.getFullyQualifiedTable());
        innerEnum.addJavaDocLine(sb.toString().replace("\n", " "));
        innerEnum.addJavaDocLine(" */");
    }
    
    /**
     * 设置字段注释
     */
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
//    	logger.info("addFieldComment");

    	if (suppressAllComments) {
            return;
        }
        
        StringBuilder sb = new StringBuilder();
        field.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedColumn.getRemarks() + " " + introspectedColumn.getActualColumnName());
        field.addJavaDocLine(sb.toString().replace("\n", " "));
        field.addJavaDocLine(" */");
        Set<FullyQualifiedJavaType> imports = new HashSet<>();
	    imports.add(new FullyQualifiedJavaType("Column"));
        addFieldAnnotation(field, introspectedTable, introspectedColumn, imports);
    }

    /**
     * 添加字段注释
     */
    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
//    	logger.info("addFieldComment");
    	if (suppressAllComments) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        field.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedTable.getFullyQualifiedTable());
        field.addJavaDocLine(sb.toString().replace("\n", " "));
        field.addJavaDocLine(" */");
    }

    /**
     * 添加偏头痛方法的注释
     */
    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
//    	logger.info("addGeneralMethodComment");
    	if (suppressAllComments) {
            return;
        }
      method.addJavaDocLine("/**");
      addJavadocTag(method, false);
      method.addJavaDocLine(" */");
    }
    
    /**
     * 设置getter方法注释
     */
    public void addGetterComment(Method method, IntrospectedTable introspectedTable,
            IntrospectedColumn introspectedColumn) {
//    	logger.info("addGetterComment");
    	if (suppressAllComments) {
            return;
        }
        method.addJavaDocLine("/**");
        StringBuilder sb = new StringBuilder();
        sb.append(" * ");
        sb.append("获取" + introspectedColumn.getRemarks());
        method.addJavaDocLine(sb.toString().replace("\n", " "));
        sb.setLength(0);
        
        //加入系统用户
        sb.append(" * @author ");
        sb.append(systemPro.getProperty("user.name"));
        method.addJavaDocLine(sb.toString().replace("\n", " "));
        sb.setLength(0);
        
        //是否加入时间戳
        if(suppressDate){
            sb.append(" * @date " + nowTime);
            method.addJavaDocLine(sb.toString().replace("\n", " "));
            sb.setLength(0);
        }
        
        sb.append(" * @return ");
        sb.append(introspectedColumn.getActualColumnName());
        sb.append(" ");
        sb.append(introspectedColumn.getRemarks());
        method.addJavaDocLine(sb.toString().replace("\n", " "));
        method.addJavaDocLine(" */");
    }
    
    /**
     * 设置setter方法注释
     */
    public void addSetterComment(Method method, IntrospectedTable introspectedTable,
            IntrospectedColumn introspectedColumn) {
//    	logger.info("addSetterComment");
    	if (suppressAllComments) {
            return;
        }
        method.addJavaDocLine("/**");
        StringBuilder sb = new StringBuilder();
        sb.append(" * ");
        sb.append("设置"+introspectedColumn.getRemarks());
        method.addJavaDocLine(sb.toString().replace("\n", " "));
        sb.setLength(0);
        
        //加入系统用户
        sb.append(" * @author ");
        sb.append(systemPro.getProperty("user.name"));
        method.addJavaDocLine(sb.toString().replace("\n", " "));
        sb.setLength(0);
        
        //是否加入时间戳
        if(suppressDate){
            sb.append(" * @date " + nowTime);
            method.addJavaDocLine(sb.toString().replace("\n", " "));
            sb.setLength(0);
        }
        
        Parameter parm = method.getParameters().get(0);
        sb.append(" * @param ");
        sb.append(parm.getName());
        sb.append(" ");
        sb.append(introspectedColumn.getRemarks());
        method.addJavaDocLine(sb.toString().replace("\n", " "));
        method.addJavaDocLine(" */");
    }

    /**
     * 添加类注释
     */
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
//    	logger.info("addClassComment");

    	if (suppressAllComments) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        innerClass.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedTable.getFullyQualifiedTable());
        innerClass.addJavaDocLine(sb.toString().replace("\n", " "));
        sb.setLength(0);
        sb.append(" * @author ");
        sb.append(systemPro.getProperty("user.name"));
        sb.append(" ");
        sb.append(nowTime);
        innerClass.addJavaDocLine(" */");
    }

    /**
     * 添加类注解
     */
	@Override
	public void addClassAnnotation(InnerClass innerClass, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> imports) {
		// TODO Auto-generated method stub
//    	logger.info("addClassAnnotation");
 
//		imports.add(new FullyQualifiedJavaType("javax.persistence.*"));
		StringBuilder comment = new StringBuilder();
		comment.append("@Table(").append("name = \"").append(introspectedTable.getFullyQualifiedTable().toString()).append("\")");
//		    String comment = new StringBuilder().append("name: ").append(introspectedTable.getFullyQualifiedTable().toString()).toString();
		    innerClass.addAnnotation(comment.toString());
	}
	/**
	 * 添加普通注解
	 * @param comment
	 * @return
	 */
	private String getGeneratedAnnotation(String comment) {
//    	logger.info("getGeneratedAnnotation");

		StringBuilder buffer = new StringBuilder();
//	    buffer.append("@Generated(");
//	    if (this.suppressAllComments)
//	      buffer.append('"');
//	    else {
//	      buffer.append("value=\"");
//	    }
//
//	    buffer.append(MyBatisGenerator.class.getName());
//	    buffer.append('"');
//
//	    if ((!this.suppressDate) && (!this.suppressAllComments)) {
//	      buffer.append(", date=\"");
//	      buffer.append(DatatypeConverter.printDateTime(Calendar.getInstance()));
//	      buffer.append('"');
//	    }

	    if (!this.suppressAllComments) {
	      buffer.append(", comments=\"");
	      buffer.append(comment);
	      buffer.append('"');
	    }

	    buffer.append(')');
	    return buffer.toString();
	  }

	/**
	 * 添加字段注解
	 */
	@Override
	public void addFieldAnnotation(Field field, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> imports) {
		// TODO Auto-generated method stub
//    	logger.info("addFieldAnnotation");
 
		imports.add(new FullyQualifiedJavaType("javax.annotation.Generated"));
		    String comment = new StringBuilder().append("Source Table: ").append(introspectedTable.getFullyQualifiedTable().toString()).toString();
		    field.addAnnotation(getGeneratedAnnotation(comment));
	}

	/**
	 * 添加字段注解
	 */
	@Override
	public void addFieldAnnotation(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn,
			Set<FullyQualifiedJavaType> imports) {
		// TODO Auto-generated method stub
//    	logger.info("addFieldAnnotation");

		imports.add(new FullyQualifiedJavaType("javax.annotation.Generated"));
//
//		    String comment = new StringBuilder().append("Source field: ")
//		      .append(introspectedTable
//		      .getFullyQualifiedTable().toString()).append(".")
//		      .append(introspectedColumn
//		      .getActualColumnName()).toString();
//		    field.addAnnotation(getGeneratedAnnotation(comment));
		    StringBuilder comment = new StringBuilder();
			comment.append("@Column(").append("name = \"").append(introspectedColumn.getActualColumnName()).append("\",");
			comment.append("nullable = ").append(introspectedColumn.isNullable()).append(")");
//			comment.append("unique = ").append(introspectedColumn.isSequenceColumn()).append(")");
			field.addAnnotation(comment.toString());
	}

	/**
	 * 添加普通方法注解
	 */
	@Override
	public void addGeneralMethodAnnotation(Method method, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> imports) {
		// TODO Auto-generated method stub
//    	logger.info("addGeneralMethodAnnotation");

		imports.add(new FullyQualifiedJavaType("javax.annotation.Generated"));
	    String comment = new StringBuilder().append("Source Table: ").append(introspectedTable.getFullyQualifiedTable().toString()).toString();
	    method.addAnnotation(getGeneratedAnnotation(comment));
	}

	/**
	 * 添加普通方法注解
	 */
	@Override
	public void addGeneralMethodAnnotation(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn,
			Set<FullyQualifiedJavaType> imports) {
		// TODO Auto-generated method stub
//    	logger.info("addGeneralMethodAnnotation");

		imports.add(new FullyQualifiedJavaType("javax.annotation.Generated"));

	    String comment = new StringBuilder().append("Source field: ")
	      .append(introspectedTable
	      .getFullyQualifiedTable().toString()).append(".")
	      .append(introspectedColumn
	      .getActualColumnName()).toString();
	    method.addAnnotation(getGeneratedAnnotation(comment));
	}

	/**
	 * 添加模型类注解
	 */
	@Override
	public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		// TODO Auto-generated method stub
//    	logger.info("addModelClassComment");
    	topLevelClass.addImportedType("javax.persistence.*");
		if ((this.suppressAllComments) || (!this.addRemarkComments)) {
		      return;
		    }

		    topLevelClass.addJavaDocLine("/**");

		    String remarks = introspectedTable.getRemarks();
		    if ((this.addRemarkComments) && ((remarks != null) && (remarks.length() > 0))) {
//		      topLevelClass.addJavaDocLine(" * Database Table Remarks:");
		      String[] remarkLines = remarks.split(System.getProperty("line.separator"));
		      for (String remarkLine : remarkLines) {
		        topLevelClass.addJavaDocLine(new StringBuilder().append(" *   ").append(remarkLine).toString());
		      }
		    }
		    topLevelClass.addJavaDocLine(" *");

		    topLevelClass
		      .addJavaDocLine(" * 该类是通过 MyBatis Generator自动生成.");

		    StringBuilder sb = new StringBuilder();
		    sb.append(" * 数据库表名为： ");
		    sb.append(introspectedTable.getFullyQualifiedTable());
		    topLevelClass.addJavaDocLine(sb.toString());

		    addJavadocTag(topLevelClass, true);

		    topLevelClass.addJavaDocLine(" */");
		    Set<FullyQualifiedJavaType> imports = new HashSet<>();
		    imports.add(new FullyQualifiedJavaType("Table"));
		    //javax.persistence.*
		    addClassAnnotation(topLevelClass, introspectedTable, imports);
	}

   
    
}
