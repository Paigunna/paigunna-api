package com.paigunna.api.rest;


import co.omise.Client;
import co.omise.models.Charge;
import com.paigunna.api.service.OmisePaymentService;
import com.paigunna.api.service.OmisePaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/omise")
public class OmiseCharge {

    @Autowired
    private OmisePaymentService omisePaymentService;

    @ResponseBody
    @PostMapping
    public Charge doCharge(@RequestParam("omiseToken") String token) throws Exception {

        return omisePaymentService.charge(token);
    }

}
