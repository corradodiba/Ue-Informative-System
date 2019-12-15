package com.github.corradodiba.ue_informative_system;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.List;

public class CountriesFragment extends Fragment {

    private RecyclerView CountryRecyclerView;
    private CountryAdapter countryAdapter;
    private static final int REQUEST_CODE = 0;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment, container, false);
        CountryRecyclerView = view.findViewById(R.id.countries_list);
        CountryRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        updateUI();
        return view;
    }

    private void updateUI() {
        CountriesList countriesList = CountriesList.getInstance();
        List<Country> countries = countriesList.getCountriesList();
        countryAdapter = new CountryAdapter(countries);

        CountryRecyclerView.setAdapter(countryAdapter);
    }


    private class CountryHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private Country country;
        private TextView name;
        private ImageView image;

        public CountryHolder(@NonNull View itemView) {
            super(itemView);
            this.name = this.itemView.findViewById(R.id.country_name);
            this.image = this.itemView.findViewById(R.id.country_image);

            this.itemView.setOnClickListener(this);
        }

        public void bind(Country c) {
            this.country = c;
            this.name.setText(c.getName());
            this.image.setImageResource(c.getLogo());
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getActivity(), CountriesDetails.class);
            intent.putExtra("CountryObject", this.country);
            startActivityForResult(intent, REQUEST_CODE);
        }

    }

    private class CountryAdapter extends RecyclerView.Adapter<CountryHolder> {
        private List<Country> countries;

        public CountryAdapter(List<Country> countries) {
            this.countries = countries;
        }

        @NonNull
        @Override
        public CountryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(R.layout.country_row, parent, false);
            return new CountryHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull CountryHolder holder, int position) {
            Country country = countries.get(position);
            holder.bind(country);
        }

        @Override
        public int getItemCount() {
            return countries.size();
        }
    }
}
