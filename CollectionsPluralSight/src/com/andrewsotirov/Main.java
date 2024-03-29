package com.andrewsotirov;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection<Product> products = new ArrayList<>();

        products.add(door);
        products.add(floorPanel);
        products.add(window);

//        System.out.println(products);

        final Iterator<Product> productIterator = products.iterator();
        while (productIterator.hasNext()) {
            Product product = productIterator.next();
            if (product.getWeight() > 20){
                System.out.println(product);
            }else {
                productIterator.remove();
            }
        }
        System.out.println(products);

//        for (Product product : products){
//            System.out.println(product);
//        }
    }
}
