package com.lls.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.lls.dao")
public class MybatisConfig {
    @Value("${spring.datasource.url}")
    private String jdbcUrl;

    @Value("${spring.datasource.driver-class-name}")
    private String driverName;

    @Value("${spring.datasource.username}")
    private String userName;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.max-wait}")
    private Integer maxWait;
    @Value("${spring.datasource.mid-idle}")
    private Integer midIdel;

    @Value("${spring.datasource.initial-size}")
    private Integer initialSize;

    @Bean(name = "druidDataSource",destroyMethod = "close")
    public DruidDataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(jdbcUrl);
        druidDataSource.setDriverClassName(driverName);
        druidDataSource.setUsername(userName);
        druidDataSource.setPassword(password);
        druidDataSource.setMaxWait(maxWait);
        druidDataSource.setMinIdle(midIdel);
        druidDataSource.setInitialSize(initialSize);
        return druidDataSource;
    }


}
