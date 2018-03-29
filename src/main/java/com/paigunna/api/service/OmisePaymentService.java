package com.paigunna.api.service;

import co.omise.Client;
import co.omise.models.Charge;

public interface OmisePaymentService {

    Charge charge(String token) throws Exception;
}
