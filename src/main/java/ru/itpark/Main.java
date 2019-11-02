package ru.itpark;

import ru.itpark.model.Gadget;
import ru.itpark.model.Product;
import ru.itpark.model.Toy;
import ru.itpark.service.UlmartService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        UlmartService ulmartService = new UlmartService ();

        ulmartService.addAll(
                new Gadget(1, "Iphone S6", "Phone", 30_000, true, 5, "Smartphone", "Apple"),
                new Gadget(2, "Iphone 10", "Phone", 50_000, true, 5, "Smartphone", "Apple"),
                new Gadget(3, "Apple watch", "Watch", 20_000, true, 4, "Smartwatch", "Apple"),
                new Gadget(4, "Xiaomi Mi Band 4", "Watch", 2_000, true, 4, "Smartwatch", "Xiomi"),
                new Gadget(5, "Samsung Galaxy A10", "Phone", 40_000, true, 5, "Smartphone", "Samsung"),
                new Gadget(6, "Galaxy S8", "Phone", 30_000, true, 4, "Smartphone", "Samsung"),
                new Gadget(7, "Galaxy Watch", "Watch", 20_000, true, 3, "SmartWatch", "Samsung"),
                new Gadget(8, "Samsung EP-N5100", "Charger", 2_000, true, 2, "Charger", "Samsung"),
                new Toy(9, "Police Car ", "Toy", 1_000, true, 5, 5),
                new Toy(10, "Sport Car ", "Toy", 500, true, 1, 7),
                new Toy(11, "Barbie Doll ", "Toy", 2_000, true, 4, 5),
                new Toy(12, "Baby Doll ", "Toy", 1_500, true, 3, 3),
                new Toy(13, "Wood Constructor", "Toy", 900, false, 2, 8),
                new Toy(14, "Lego Constructor", "Toy", 1_200, true, 4, 10),
                new Toy(15, "Lego Robot", "Toy", 1_200, true, 5, 10));

        List<Product> listOfProductsByName = ulmartService.searchByName("galaxy");
        System.out.println("Product list filtered by name: ");
        listOfProductsByName.forEach(o -> System.out.println(o));

        System.out.println("Product list filtered by name sorted by rating: ");
        ulmartService.sortByRating(listOfProductsByName).forEach(o -> System.out.println(o));

        System.out.println("Product list filtered by name per page: ");
        ulmartService.productsPerPage(listOfProductsByName, 0, 4).forEach(o -> System.out.println(o));

        List<Product> listOfProductsByCategory = ulmartService.searchByCategory("toy");
        System.out.println("Product list filtered by category: ");
        listOfProductsByCategory.forEach(o -> System.out.println(o));

        System.out.println("Product list filtered by category sorted by price: ");
        ulmartService.sortByPrice(listOfProductsByCategory).forEach(o -> System.out.println(o));

        System.out.println("Product list filtered by category per page: ");
        ulmartService.productsPerPage(listOfProductsByCategory, 0, 4).forEach(o -> System.out.println(o));

        List<Product> listOfProductSortedByName = ulmartService.sortByName();
        System.out.println("Product list sorted by name: ");
        listOfProductSortedByName.forEach(o -> System.out.println(o));

    }
}
