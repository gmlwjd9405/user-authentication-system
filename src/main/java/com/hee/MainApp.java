package com.hee;

import com.hee.repository.OfferDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        OfferDAO offerDAO = (OfferDAO) context.getBean("offerDAO");
        System.out.println("The record count is " + offerDAO.getRowCount());

    }
}
