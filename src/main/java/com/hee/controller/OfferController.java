package com.hee.controller;

import com.hee.model.Offer;
import com.hee.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
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

    @GetMapping("/createOffer")
    public String createOffer(Model model) {
        model.addAttribute("offer", new Offer());

        return "createOffer";
    }

    @PostMapping("/createOffer")
    String doCreate(Model model, @Valid Offer offer, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println("===Form data does not validated");

            List<ObjectError> errors = result.getAllErrors();
            for (ObjectError error : errors) {
                System.out.println(error.getDefaultMessage());
            }
            return "createOffer";
        }
        offerService.insert(offer);
        return "offerCreated";
    }

}
