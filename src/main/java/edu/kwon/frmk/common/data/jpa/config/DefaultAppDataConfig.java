package edu.kwon.frmk.common.data.jpa.config;

import javax.persistence.EntityManagerFactory;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.dialect.PostgresPlusDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Application Jpa Data Configuration
 * Declare beans of
 * - DataSource
 * - Entity Manager Factory: use
 * - Transaction Manager:
 * @author Bunlong Taing
 *
 * @since Jun 22, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
@Configuration
@EnableJpaRepositories("edu.kwon.frmk.common.data.jpa.repository")			// Package of annotated class is used, if not specify base package. repository-impl-postfix = (default) Impl
@EnableTransactionManagement	// = <tx:annotation-driven />
public class DefaultAppDataConfig {
	
	@Bean
	public EntityManagerFactory entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setDataSource(dataSource());
		factory.setJpaVendorAdapter(jpaVendorAdapter());
		factory.setPackagesToScan("edu.kwon.frmk.common.data.jpa.repository");
		factory.afterPropertiesSet();
		
		return factory.getObject();
	}
	
	@Bean
	public PlatformTransactionManager transactionManager() {
		JpaTransactionManager txManager = new JpaTransactionManager();
		txManager.setEntityManagerFactory(entityManagerFactory());
		return txManager;
	}
	
	@Bean
	public BasicDataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(org.postgresql.Driver.class.getName());
		dataSource.setUrl("jdbc:postgresql://localhost/travel-agent");
		dataSource.setInitialSize(5);		// Initial connection size
		dataSource.setMaxActive(10);			// Maximum active connection
		dataSource.setUsername("postgres");
		dataSource.setPassword("123");
		return dataSource;
	}
	
	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		vendorAdapter.setShowSql(true);
		vendorAdapter.setGenerateDdl(true);
		vendorAdapter.setDatabasePlatform(PostgresPlusDialect.class.getName());
		
		return vendorAdapter;
	}

}
