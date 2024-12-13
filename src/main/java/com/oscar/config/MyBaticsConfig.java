package com.oscar.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
public class MyBaticsConfig {
    @Value("${spring.datasource.master.type}")
    private String driverClassName;

    @Value("${spring.datasource.master.url}")
    private String url;


    @Value("${spring.datasource.master.username}")
    private String userName;

    @Value("${spring.datasource.master.password}")
    private String password;


    public static final String SESSION_FACTORY = "ysbSessionFactory";


    @Bean(name = SESSION_FACTORY)
    public SqlSessionFactory sessionFactory() throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        // 给MyBatis-Plus注入数据源
        bean.setDataSource(ysbDataSource());
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
        return bean.getObject();
    }

    @Bean
    @Primary
    public PlatformTransactionManager ysbTransactionManager() {
        return new DataSourceTransactionManager(ysbDataSource());
    }

    @Bean
    public DataSource ysbDataSource() {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName(driverClassName);
        config.setJdbcUrl(url);
        config.setUsername(userName);
        config.setPassword(password);
        HikariDataSource dataSource = new HikariDataSource(config);

        return dataSource;
    }

//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource.master")
//    public HikariConfig ysbHikariConfig() {
//        return new HikariConfig();
//    }

}
