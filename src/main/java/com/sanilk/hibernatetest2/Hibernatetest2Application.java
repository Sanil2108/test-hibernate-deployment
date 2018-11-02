package com.sanilk.hibernatetest2;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

import  org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;


@SpringBootApplication
public class Hibernatetest2Application {

    public static void main(String[] args) {
        SpringApplication.run(Hibernatetest2Application.class, args);
    }

}
