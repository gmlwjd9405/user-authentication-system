package com.hee.service;

import com.hee.model.Offer;
import com.hee.repository.OfferDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferService {

    @Autowired
    private OfferDAO offerDAO;

    public List<Offer> getCurrent() {
        return offerDAO.getOffers();
    }

    public void insert(Offer offer) {
        offerDAO.insert(offer);
    }
}
