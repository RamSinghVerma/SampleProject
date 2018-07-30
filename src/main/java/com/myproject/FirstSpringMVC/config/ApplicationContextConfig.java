package com.myproject.FirstSpringMVC.config;

import java.util.Properties;

import javax.sql.DataSource;
import javax.validation.Validator;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@ComponentScan(basePackages="com.myproject.FirstSpringMVC")
@PropertySource("classpath:database.properties")
@EnableTransactionManagement

public class ApplicationContextConfig {
@Autowired
private	Environment env;
	
@Bean(name="viewResolver")
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
@Bean(name="dataSource")
public DataSource getDataSource() {
    BasicDataSource dataSource = new BasicDataSource();
    dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
    dataSource.setUrl(env.getProperty("jdbc.url"));
    dataSource.setUsername(env.getProperty("jdbc.username"));
    dataSource.setPassword(env.getProperty("jdbc.password"));
 
    return dataSource;
}

/*@Autowired
@Bean(name = "sessionFactory")
public SessionFactory getSessionFactory() {
	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(getDataSource());
	sessionBuilder.addProperties(getHibernateProperties());
	sessionBuilder.scanPackages("com.myproject.FirstSpringMVC.model");
	return sessionBuilder.buildSessionFactory();
}*/

@Bean(name="sessionFactory")
public LocalSessionFactoryBean getSessionFactory(){
    LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
    factoryBean.setDataSource(getDataSource());
    factoryBean.setHibernateProperties(getHibernateProperties());
    factoryBean.setPackagesToScan("com.myproject.FirstSpringMVC.model");
    return factoryBean;
}

private Properties getHibernateProperties() {
	Properties properties = new Properties();
	properties.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
	properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
	properties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
	return properties;
}

@Autowired
@Bean(name="transactionManager")
public HibernateTransactionManager getTransactionManager() {
    HibernateTransactionManager transactionManager = new HibernateTransactionManager(
            getSessionFactory().getObject());
 
    return transactionManager;
}

@Bean
public MessageSource messageSource() {
   ResourceBundleMessageSource source = new ResourceBundleMessageSource();
   source.setBasename("messages");
   return source;
}
@Bean
public Validator getValidator() {
    LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
    validator.setValidationMessageSource(messageSource());
    return validator;
}

}
