package com.paigunna.api.service;

import co.omise.Client;
import co.omise.models.Charge;
import co.omise.models.OmiseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class OmisePaymentServiceImpl implements OmisePaymentService {

    @Autowired
    private Client client;

    @Override
    public Charge charge(String token) throws Exception{

            return client.charges().create(new Charge.Create()
                    .amount(2000) // THB 20.00
                    .currency("THB")
                    .card(token));
    }
}
