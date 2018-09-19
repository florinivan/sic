package com.phimes.sic.business.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.assertj.core.util.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource("application.properties")
@ComponentScan(basePackages = { "com.phimes.sic" })
@EnableJpaRepositories(basePackages = { "com.phimes.sic.business.dao" })
@EnableTransactionManagement
public class AppConfig {

	@Autowired
	private Environment env;

	public AppConfig() {
		super();
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource());
		em.setPackagesToScan(new String[] { "com.phimes.sic.business.model" });

		final HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		// vendorAdapter.set
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(additionalProperties());

		return em;
	}

	@Bean
	public DataSource dataSource() {
		final DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(Preconditions.checkNotNull(env.getProperty("hibernate.connection.driver_class")));
		dataSource.setUrl(Preconditions.checkNotNull(env.getProperty("spring.datasource.url")));
		dataSource.setUsername(Preconditions.checkNotNull(env.getProperty("spring.datasource.username")));
		dataSource.setPassword(Preconditions.checkNotNull(env.getProperty("spring.datasource.password")));

		return dataSource;
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		final JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());

		return transactionManager;
	}

	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}

	final Properties additionalProperties() {
		final Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.connection.driver_class",
				env.getProperty("hibernate.connection.driver_class"));
		hibernateProperties.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
		hibernateProperties.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
		hibernateProperties.setProperty("hibernate.format_sql", env.getProperty("hibernate.format_sql"));
		hibernateProperties.setProperty("hibernate.generate_statistics",
				env.getProperty("hibernate.generate_statistics"));
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
		return hibernateProperties;
	}

}
