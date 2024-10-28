package it.mauiroma.springsoap;

import it.mauiroma.springsoap.gen.Country;
import it.mauiroma.springsoap.gen.Currency;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CountryRepository {



    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        // initialize countries map
        Country country = new Country();
        country.setCapital("Madrid");
        country.setName("Spain");
        country.setCurrency(Currency.fromValue("EUR"));
        country.setPopulation(3);
        countries.put("Spain", country);
        System.out.println("InitData");
    }

    public Country findCountry(String name) {
        System.out.printf("FindCountry %s!", name);
        return countries.get(name);
    }
}