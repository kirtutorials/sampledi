package com.example.simpledi;

import com.example.test.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SimpleDiApplication {

    public static void main(String[] args) {
//        Test test = new Test(\); // tightly coupling
        /**
         * Spring Container - DI, IoC, ComponentScanning
         *      - BeanFactory
         *      - ApplicationContext
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Test test = new Test();
        test.start();

    }

}

/**
 * - creation , injecttion
 */
