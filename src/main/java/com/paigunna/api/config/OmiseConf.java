package com.paigunna.api.config;

import co.omise.Client;
import co.omise.ClientException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OmiseConf {

    @Bean
    public Client newClient() throws ClientException{
        return new Client("pkey_test_5afuh3yxu16m5ih76xb", "skey_test_5afuh3yyeml1f95sx8y");
    }
    
}
