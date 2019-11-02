package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Gadget extends Product {
    private String typeOfGadget;
    private String brand;

    public Gadget(int id, String name, String category, int price, boolean isAvailable, int rating, String typeOfGadget, String brand) {
        super(id, name, category, price, isAvailable, rating);
        this.typeOfGadget = typeOfGadget;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return super.toString() + "Gadget{" +
                "typeOfGadget='" + typeOfGadget + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
