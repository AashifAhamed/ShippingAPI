package com.paf.shippingapi;


import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
@EnableJpaAuditing
public class ShippingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShippingApplication.class, args);
	
	}
	
	@Bean
	public DataSource dataSource(){
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/sellnbuy?useSSL=false");
	    dataSource.setUsername( "root" );
	    dataSource.setPassword( "root" );
	    return dataSource;
	}
}