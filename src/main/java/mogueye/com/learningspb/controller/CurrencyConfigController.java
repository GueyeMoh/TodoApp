package mogueye.com.learningspb.controller;

import mogueye.com.learningspb.service.CurrencyServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigController {

    @Autowired
    private CurrencyServiceConfiguration currencyServiceConfiguration; //so currency*serviceConf is a bean
    @RequestMapping("/currency")
    public CurrencyServiceConfiguration retrieveAllCurrencies(){
        return currencyServiceConfiguration;
    }
}
