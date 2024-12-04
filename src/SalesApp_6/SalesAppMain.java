package SalesApp_6;

import java.util.ArrayList;
import java.util.Collections;

public class SalesAppMain {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        Product product1 = new Product();
        product1.setProductName("Laptop");
        product1.setCategory("Electronics");
        product1.setPrice(1000.0);
        product1.setUnitsSold(120);
        product1.setDiscount(10.0);
        product1.setBrand("Dell");
        product1.setRating(4);
        product1.setStockQuantity(50);
        product1.setLaunchYear(2022);
        product1.setWarranty(24);

        Product product2 = new Product();
        product2.setProductName("Smartphone");
        product2.setCategory("Electronics");
        product2.setPrice(800.0);
        product2.setUnitsSold(300);
        product2.setDiscount(5.0);
        product2.setBrand("Samsung");
        product2.setRating(5);
        product2.setStockQuantity(200);
        product2.setLaunchYear(2023);
        product2.setWarranty(12);

        Product product3 = new Product();
        product3.setProductName("Headphones");
        product3.setCategory("Accessories");
        product3.setPrice(200.0);
        product3.setUnitsSold(150);
        product3.setDiscount(15.0);
        product3.setBrand("Sony");
        product3.setRating(4);
        product3.setStockQuantity(100);
        product3.setLaunchYear(2021);
        product3.setWarranty(18);

        Product product4 = new Product();
        product4.setProductName("Smartwatch");
        product4.setCategory("Wearables");
        product4.setPrice(300.0);
        product4.setUnitsSold(80);
        product4.setDiscount(20.0);
        product4.setBrand("Apple");
        product4.setRating(5);
        product4.setStockQuantity(75);
        product4.setLaunchYear(2023);
        product4.setWarranty(12);

        Product product5 = new Product();
        product5.setProductName("Refrigerator");
        product5.setCategory("Appliances");
        product5.setPrice(1500.0);
        product5.setUnitsSold(40);
        product5.setDiscount(10.0);
        product5.setBrand("LG");
        product5.setRating(5);
        product5.setStockQuantity(20);
        product5.setLaunchYear(2020);
        product5.setWarranty(36);

        Product product6 = new Product();
        product6.setProductName("Television");
        product6.setCategory("Electronics");
        product6.setPrice(1200.0);
        product6.setUnitsSold(90);
        product6.setDiscount(8.0);
        product6.setBrand("Samsung");
        product6.setRating(4);
        product6.setStockQuantity(30);
        product6.setLaunchYear(2021);
        product6.setWarranty(24);

        Product product7 = new Product();
        product7.setProductName("Microwave");
        product7.setCategory("Appliances");
        product7.setPrice(400.0);
        product7.setUnitsSold(60);
        product7.setDiscount(12.0);
        product7.setBrand("Panasonic");
        product7.setRating(4);
        product7.setStockQuantity(25);
        product7.setLaunchYear(2019);
        product7.setWarranty(18);

        Product product8 = new Product();
        product8.setProductName("Gaming Console");
        product8.setCategory("Gaming");
        product8.setPrice(500.0);
        product8.setUnitsSold(200);
        product8.setDiscount(5.0);
        product8.setBrand("Sony");
        product8.setRating(5);
        product8.setStockQuantity(60);
        product8.setLaunchYear(2022);
        product8.setWarranty(24);

        Product product9 = new Product();
        product9.setProductName("Blender");
        product9.setCategory("Appliances");
        product9.setPrice(100.0);
        product9.setUnitsSold(300);
        product9.setDiscount(15.0);
        product9.setBrand("Ninja");
        product9.setRating(4);
        product9.setStockQuantity(150);
        product9.setLaunchYear(2020);
        product9.setWarranty(12);

        Product product10 = new Product();
        product10.setProductName("Camera");
        product10.setCategory("Photography");
        product10.setPrice(2500.0);
        product10.setUnitsSold(70);
        product10.setDiscount(10.0);
        product10.setBrand("Canon");
        product10.setRating(5);
        product10.setStockQuantity(20);
        product10.setLaunchYear(2021);
        product10.setWarranty(36);

// Adding products to the list
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        products.add(product10);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        products.add(product10);


        // Display details of all products
        for (Product product : products) {
            product.displayDetails();
            System.out.println("---------------------------------");
        }

        // Sort products by revenue
        Collections.sort(products);
        System.out.println("Products sorted by revenue:");
        for (Product product : products) {
            System.out.println(product.getProductName() + ": $" + product.calculateRevenue());
        }
    }






    }

