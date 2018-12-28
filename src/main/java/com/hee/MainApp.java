package com.hee;

import com.hee.model.Offer;
import com.hee.repository.OfferDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        // test getRowCount
        OfferDAO offerDAO = (OfferDAO) context.getBean("offerDAO");
        System.out.println("The record count is " + offerDAO.getRowCount());

        // test getOffers
        List<Offer> offerList = offerDAO.getOffers();
        for (Offer offer: offerList)
            System.out.println(offer);


        Offer offer = new Offer();

        // test insert
        offer.setName("hee");
        offer.setEmail("hee@email.com");
        offer.setText("test text");
        if (offerDAO.insert(offer))
            System.out.println("insert success");
        else
            System.out.println("insert fail");

        // test update
        offer = offerDAO.getOffer("hee1");
        offer.setName("heee1");
        if (offerDAO.update(offer))
            System.out.println("update success");
        else
            System.out.println("update fail");
        // test updated data
        offer = offerDAO.getOffer("heee1");
        System.out.println(offer);

        // test delete
        if (offerDAO.delete(offer.getId()))
            System.out.println("delete success");
        else
            System.out.println("delete fail");

        ((ClassPathXmlApplicationContext) context).close();
    }
}
