package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Comparable <Product> {
    private int id;
    private String name;
    private String category;
    private int price;
    private boolean isAvailable;
    private int rating;

    @Override
    public int compareTo(Product o) {
        return price - o.getPrice();
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                ", rating=" + rating +
                '}';
    }
}
