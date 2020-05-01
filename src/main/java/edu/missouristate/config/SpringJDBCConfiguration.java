package edu.missouristate.config;

import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

//import org.hibernate.FlushMode;
//import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
//@EnableJpaRepositories(basePackages = "edu.missouristate.dao", entityManagerFactoryRef = "embeddedEntityManagerFactory",
//        transactionManagerRef = "embeddedTransactionManager")
public class SpringJDBCConfiguration {

    @Bean(name = "embedded", destroyMethod = "shutdown")
    public DataSource dataSource() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.DERBY).addScript("devices.sql")
//				.addScript("someOtherFile.sql")
				.build();
        return db;
    }

/*    @Bean(name = "embeddedEntityManagerFactory")
    protected LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource());
        em.setPersistenceProviderClass(HibernatePersistenceProvider.class);
        em.setPersistenceUnitName(dataSourceName());
        em.setPackagesToScan(packagesToScan());
        em.setJpaProperties(hibernateProperties());
        return em;
    }*/


/*    @Bean(name = "embeddedTransactionManager")
    protected JpaTransactionManager transactionManager() {
        JpaTransactionManager props = new JpaTransactionManager();
        props.setEntityManagerFactory(entityManagerFactory().getObject());
        return props;
    }*/

/*    protected Properties hibernateProperties() {
        Properties props = new Properties();
        props.setProperty("hibernate.dialect", "org.hibernate.dialect.DB2400Dialect");
        props.setProperty("hibernate.show_sql", "false");
        props.setProperty("hibernate.format_sql", "false");
        props.setProperty("hibernate.use_sql_comments", "false");
        props.setProperty("hibernate.jdbc.batch_size", "30");
        props.setProperty("hibernate.max_fetch_depth", "30");
       
        props.setProperty("org.hibernate.flushMode", FlushMode.AUTO.name());
        
        props.setProperty("net.sf.ehcache.configurationResourceName", "ehcacheHibernate.xml");
        props.setProperty("hibernate.cache.use_second_level_cache", "true");
        props.setProperty("hibernate.cache.use_query_cache", "true");
        props.setProperty("hibernate.cache.region.factory_class", "org.hibernate.cache.ehcache.SingletonEhCacheRegionFactory");
        return props;
    }*/

    public String dataSourceName() {
        return "";
    }

    /**
     * Method returns String[] of packages for spring to scan for Entity Classes. 
     * Defined package strings should only be for entity packages that use this 
     * datasource
     * 
     * @return String[]
     */
    protected String[] packagesToScan() {
        List<String> packages = Arrays.asList("edu.missouristate");
        return packages.toArray(new String[packages.size()]);
    }

}