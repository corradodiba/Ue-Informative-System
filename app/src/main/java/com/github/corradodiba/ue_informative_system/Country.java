package com.github.corradodiba.ue_informative_system;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;

public class Country implements Serializable {
    private int logo;
    private int name;
    private int area;
    private int population;
    private UUID id;

    public Country(int logo, int name, int area, int population) {
        this.id = UUID.randomUUID();
        this.logo = logo;
        this.name = name;
        this.area = area;
        this.population = population;
    }

    public int getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    public int getArea() {
        return area;
    }

    public int getPopulation() {
        return population;
    }

    public int getLogo() {
        return logo;
    }
}

