package com.hee.controller;

import com.hee.model.Offer;
import com.hee.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class OfferController {

    @Autowired
    private OfferService offerService;

    @RequestMapping("/offers")
    public String showOffers(Model model) {
        List<Offer> offers = offerService.getCurrent();
        model.addAttribute("offers", offers);

        return "offers";
    }

}
