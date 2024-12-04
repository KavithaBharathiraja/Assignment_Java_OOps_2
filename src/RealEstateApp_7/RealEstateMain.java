package RealEstateApp_7;

import java.util.ArrayList;

public class RealEstateMain {

    public static void main(String[] args) {

        ArrayList<RealEstateAppBase> properties = new ArrayList<>();

        // Residential Property 1
        ResidentialProperty house1 = new ResidentialProperty();
        house1.setPropertyName("Luxury Villa");
        house1.setLocation("California");
        house1.setArea(3500);
        house1.setPricePerSqFt(500);
        house1.setBedrooms(5);
        house1.setHasGarden(true);

        // Residential Property 2
        ResidentialProperty house2 = new ResidentialProperty();
        house2.setPropertyName("Beachside Bungalow");
        house2.setLocation("Florida");
        house2.setArea(2500);
        house2.setPricePerSqFt(400);
        house2.setBedrooms(3);
        house2.setHasGarden(false);
        properties.add(house2);

        // Residential Property 3
        ResidentialProperty house3 = new ResidentialProperty();
        house3.setPropertyName("Cozy Apartment");
        house3.setLocation("New York");
        house3.setArea(1200);
        house3.setPricePerSqFt(700);
        house3.setBedrooms(2);
        house3.setHasGarden(false);
        properties.add(house3);

        // Residential Property 4
        ResidentialProperty house4 = new ResidentialProperty();
        house4.setPropertyName("Mountain Retreat");
        house4.setLocation("Colorado");
        house4.setArea(3000);
        house4.setPricePerSqFt(450);
        house4.setBedrooms(4);
        house4.setHasGarden(true);
        properties.add(house4);

        // Residential Property 5
        ResidentialProperty house5 = new ResidentialProperty();
        house5.setPropertyName("Urban Loft");
        house5.setLocation("San Francisco");
        house5.setArea(1500);
        house5.setPricePerSqFt(900);
        house5.setBedrooms(2);
        house5.setHasGarden(false);
        properties.add(house5);

        // Commercial Property 1
        CommercialProperty office1 = new CommercialProperty();
        office1.setPropertyName("Corporate Office");
        office1.setLocation("New York");
        office1.setArea(10000);
        office1.setPricePerSqFt(800);
        office1.setHasParking(true);
        office1.setRentalIncome(20000);


        // Commercial Property 2
        CommercialProperty retailStore = new CommercialProperty();
        retailStore.setPropertyName("Retail Plaza");
        retailStore.setLocation("Texas");
        retailStore.setArea(5000);
        retailStore.setPricePerSqFt(700);
        retailStore.setHasParking(false);
        retailStore.setRentalIncome(15000);


        // Commercial Property 3
        CommercialProperty warehouse = new CommercialProperty();
        warehouse.setPropertyName("Logistics Warehouse");
        warehouse.setLocation("Nevada");
        warehouse.setArea(20000);
        warehouse.setPricePerSqFt(300);
        warehouse.setHasParking(true);
        warehouse.setRentalIncome(30000);


        // Commercial Property 4
        CommercialProperty techPark = new CommercialProperty();
        techPark.setPropertyName("Tech Innovation Park");
        techPark.setLocation("California");
        techPark.setArea(15000);
        techPark.setPricePerSqFt(1000);
        techPark.setHasParking(true);
        techPark.setRentalIncome(50000);


        // Commercial Property 5
        CommercialProperty restaurant = new CommercialProperty();
        restaurant.setPropertyName("Downtown Diner Space");
        restaurant.setLocation("Chicago");
        restaurant.setArea(3000);
        restaurant.setPricePerSqFt(600);
        restaurant.setHasParking(false);
        restaurant.setRentalIncome(12000);


        properties.add(house1);
        properties.add(house2);
        properties.add(house3);
        properties.add(house4);
        properties.add(house5);
        properties.add(office1);
        properties.add(retailStore);
        properties.add(warehouse);
        properties.add(techPark);
        properties.add(restaurant);



        // Display details of all properties
        for (RealEstateAppBase property : properties) {
            property.displayDetails();
            System.out.println("--------------------------------");
        }
    }


    }

