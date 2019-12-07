package moodle;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
@Transactional(transactionManager="txMgr")
@Rollback(value=true)

public class Test1 {

	
	@Test
	public void test1(){
		 // 执行中的异常信息会保存在warnings中 
		  List<String> warnings = new ArrayList<String>();
		     try {
		         // true:生成的文件覆盖之前的
		         boolean overwrite = true;
		         // 读取配置,构造 Configuration 对象.  
		         // 如果不想使用配置文件的话,也可以直接来 new Configuration(),然后给相应属性赋值.
//		         String fileName = dataPreProcess.class.getClassLoader().getResource("generatorConfig.xml").getPath();
		         File configFile = new File("src/main/resources/generatorConfig.xml");
		         ConfigurationParser cp = new ConfigurationParser(warnings);
		         Configuration config = cp.parseConfiguration(configFile);
		         DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		         MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		         myBatisGenerator.generate(null);
		     } catch (SQLException e) {
		         e.printStackTrace();
		     } catch (IOException e) {
		         e.printStackTrace();
		     } catch (InterruptedException e) {
		         e.printStackTrace();
		     } catch (InvalidConfigurationException e) {
		         e.printStackTrace();
		     } catch (XMLParserException e) {
		         e.printStackTrace();
		     }
		     
		     for (String warning : warnings){
		         System.out.println(warning);
		     }
	}
}
