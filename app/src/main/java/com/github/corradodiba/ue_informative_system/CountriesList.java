package com.github.corradodiba.ue_informative_system;

import android.util.Log;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CountriesList {

    private static final CountriesList ourInstance = new CountriesList();
    public List<Country> countryList;

    static CountriesList getInstance() {

        return ourInstance;
    }

    private CountriesList() {
        Country austria = new Country(R.drawable.austria,R.string.austria,R.string.austria_area,R.string.austria_population);
        Country estonia = new Country(R.drawable.estonia,R.string.estonia,R.string.estonia_area,R.string.estonia_population);
        Country greece = new Country(R.drawable.greece,R.string.greece,R.string.greece_area,R.string.greece_population);
        Country latvia = new Country(R.drawable.latvia,R.string.latvia,R.string.latvia_area,R.string.latvia_population);
        Country luxembourg = new Country(R.drawable.luxembourg,R.string.luxembourg,R.string.luxembourg_area,R.string.luxembourg_population);
        Country netherlands = new Country(R.drawable.netherlands,R.string.netherlands,R.string.netherlands_area,R.string.netherlands_population);
        Country poland = new Country(R.drawable.poland,R.string.poland,R.string.poland_area,R.string.poland_population);
        Country slovakia = new Country(R.drawable.slovakia,R.string.slovakia,R.string.slovakia_area,R.string.slovakia_population);
        Country slovenia = new Country(R.drawable.slovenia,R.string.slovenia, R.string.slovenia_area, R.string.slovenia_population);
        Country unitedKingdom = new Country(R.drawable.uk,R.string.unitedKingdom,R.string.unitedKingdom_area,R.string.unitedKingdom_population);

        countryList = Arrays.asList( slovakia, estonia, greece, latvia, poland, austria, slovenia, unitedKingdom, netherlands, luxembourg );
    }


    public List<Country> getCountriesList() {
        return countryList;
    }
}
