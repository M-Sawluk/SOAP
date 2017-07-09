package io.spring.guides.gs_producing_web_service;

/**
 * Created by Mike on 2017-07-09.
 */
public class Main {

    public static void main(String[] args) {
        CountriesPortService countriesPortSer = new CountriesPortService();
        CountriesPort countriesPort = countriesPortSer.getCountriesPortSoap11();
        GetCountryRequest getCountryRequest = new GetCountryRequest();
        getCountryRequest.setName("Poland");
        GetCountryResponse getCountryResponse = countriesPort.getCountry(getCountryRequest);
        Country country = getCountryResponse.getCountry();
        System.out.println(country.getCapital());
        System.out.println(country.getCurrency());
        System.out.println(country.getName());
    }

}
