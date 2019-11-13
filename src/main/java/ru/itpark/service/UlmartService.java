package ru.itpark.service;

import ru.itpark.comparator.ProductByNameComparator;
import ru.itpark.comparator.ProductByPriceComparator;
import ru.itpark.comparator.ProductByRatingComparator;
import ru.itpark.model.Product;

import java.util.*;

public class UlmartService {

    private Collection<Product> products = new LinkedList<>();

    public void addAll(Product... products) {
        Collections.addAll(this.products, products);
    }

    public List<Product> searchByName(String name) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().toUpperCase().contains(name.toUpperCase())) {
                result.add(product);
            }
        }
        Collections.sort(result, new ProductByPriceComparator());
        return result;
    }

    public List<Product> searchByCategory(String category) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().toUpperCase().contains(category.toUpperCase())) {
                result.add(product);
            }
        }
        Collections.sort(result, new ProductByNameComparator());
        return result;
    }

    public List<Product> sortByName() {
        List<Product> productsList = new ArrayList<>();
        productsList.addAll(products);
        Collections.sort(productsList, new ProductByNameComparator());
        return productsList;
    }

    public List<Product> sortByRating() {
        List<Product> productsList = new ArrayList<>(products);
        Collections.sort(productsList, new ProductByRatingComparator());
        return productsList;
    }

    public List<Product> sortByPrice() {
        List<Product> productsList = new ArrayList<>(products);
        Collections.sort(productsList, new ProductByPriceComparator());
        return productsList;
    }

    public List<Product> productsPerPage(int fromIndex, int toIndex) {
        List<Product> productsList = new ArrayList<>(products);
        if (productsList.size() > toIndex) {
            return productsList.subList(fromIndex, toIndex);
        }
        return productsList;
    }


}
