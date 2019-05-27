package com.andrewsotirov;

import java.util.Objects;

public class StockItem implements Comparable<StockItem> {

    private final String name;
    private double price;
    private int quantityStock;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quantityInStock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public void addStock(int quantity) {
        int newQuantity = quantityStock + quantity;
        if (newQuantity > 0) {
            quantityStock = newQuantity;
        }
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("StockItem.equals");
        if (this == o) return true;
        if (!(o instanceof StockItem)) return false;
        StockItem stockItem = (StockItem) o;
        return Objects.equals(getName(), stockItem.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public int compareTo(StockItem o) {
        System.out.println("StockItem.compareTo");
        if (this==o){
            return 0;
        }
        if (o != null){
            return name.compareTo(o.getName());
        }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return name + " : price " + price;
    }
}
