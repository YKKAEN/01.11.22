package my.first.project.services;

import my.first.project.entities.Country;

import java.util.List;

public interface CountryService {

    List<Country> getAllCountries();

    void saveCountry(Country country);

    Country getCountryById(Long id);

    void deleteCountryById(Long id);

    Country createCountry(Country country);
}
