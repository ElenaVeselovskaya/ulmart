package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Toy extends Product {

    private int age;

    public Toy(int id, String name, String category, int price, boolean isAvailable, int rating, int age) {
        super(id, name, category, price, isAvailable, rating);
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + "Toy{" +
                "age=" + age +
                '}';
    }
}
