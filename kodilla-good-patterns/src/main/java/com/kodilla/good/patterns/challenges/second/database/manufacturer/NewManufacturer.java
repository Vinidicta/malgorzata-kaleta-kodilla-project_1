package com.kodilla.good.patterns.challenges.second.database.manufacturer;


import com.kodilla.good.patterns.challenges.second.database.manufacturer.Manufacturer;

import java.util.ArrayList;
import java.util.List;

public class NewManufacturer {

    private List<Manufacturer> manufacturerDataBase = new ArrayList<>();
    private Manufacturer manufacturer;

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void addNewManufacturer(Manufacturer manufacturer) {
        manufacturerDataBase.add(manufacturer);
    }

    public boolean removeManufacturer(Manufacturer manufacturer) {
        return manufacturerDataBase.remove(manufacturer);
    }

    public Manufacturer getManufacturerDetails(int i) {
        return manufacturerDataBase.get(i);
    }

}
