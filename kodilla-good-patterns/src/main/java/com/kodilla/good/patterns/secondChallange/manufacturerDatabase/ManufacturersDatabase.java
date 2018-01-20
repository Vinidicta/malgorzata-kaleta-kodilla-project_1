package com.kodilla.good.patterns.secondChallange;

public class ManufacturersDatabase {

    private NewManufacturer newManufacturer;

    public ManufacturersDatabase() {
        newManufacturer.addNewManufacturer(new Manufacturer("ExtraFoodShop", "ul. Chmielna 6", "Nowa Wieś",
                "45-987ś", "sales-department@extra.food.shop", "+48 503-251-487",
                "5812361487123645981436"));
        newManufacturer.addNewManufacturer(new Manufacturer("HealthyShop", "ul.Krakowska 3", "Karków",
                "45-639", "info@haelthyshop.com", "+48 780-587-452",
                "4578957841652412345413"));
        newManufacturer.addNewManufacturer(new Manufacturer("GlutenFreeShop", "ul. Pszeniczna 7", "Młynowo",
                "39-741", "info@gluten.free.shop.pl", "+48 501-469-854",
                "4578957841652411487413"));
    }
}
