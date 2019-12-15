package com.github.corradodiba.ue_informative_system;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CountriesDetails extends AppCompatActivity {
    private TextView name;
    private TextView area;
    private TextView population;
    private ImageView imageCountry;
    private Country country;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.countries_details);

        Intent intent = getIntent();
        this.country = (Country) intent.getSerializableExtra("CountryObject");

        this.name = findViewById(R.id.name);
        this.name.setText(country.getName());
        this.area = findViewById(R.id.area_country);
        this.area.setText(country.getArea());
        this.population = findViewById(R.id.population_country);
        this.population.setText(country.getPopulation());
        this.imageCountry = findViewById(R.id.image);
        this.imageCountry.setImageResource(country.getLogo());

    }
}
