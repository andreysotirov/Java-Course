package com.andrewsotirov;

public class AddAdditions {

    private double tomatoPrice;
    private double lettucePrice;
    private double picklesPrice;
    private double friesPrice;
    private double kinoaPrice;
    private double avocadoPrice;


    public AddAdditions() {

        this.tomatoPrice = 0.8;
        this.lettucePrice = 0.5;
        this.picklesPrice = 0.2;
        this.friesPrice = 1.2;
        this.avocadoPrice = 1.4;
        this.kinoaPrice = 0.4;
    }

    public void addAdditionsBaseBurger(int tomato, int lettuce, int fries, int pickles) {
        if ((tomato + lettuce + fries + pickles) > 4) {
            System.out.println("You can't add more than 4 additions");
        } else {
            addTomato(tomato);
            addLettuce(lettuce);
            addFries(fries);
            addPickles(pickles);
        }
    }

    public void addAdditionsHealthyBurger(int tomato, int lettuce, int fries, int pickles, int kinoa, int avocado) {
        if ((tomato + lettuce + fries + pickles + kinoa + avocado) > 6) {
            System.out.println("You can't add more than 6 additions");
        } else {
            addKinoa(kinoa);
            addAvocado(avocado);
            addTomato(tomato);
            addLettuce(lettuce);
            addFries(fries);
            addPickles(pickles);
        }
    }
    private int addAvocado(int avocado) {
        if (avocado != 0) {
            avocadoPrice *= avocado;
            System.out.println("Avocado -> " + avocadoPrice);
            return avocado;
        }
        return 0;
    }
    private int addKinoa(int kinoa) {
        if (kinoa != 0) {
            kinoaPrice *= kinoa;
            System.out.println("Kinoa -> " + kinoaPrice);
            return kinoa;
        }
        return 0;
    }

    private int addTomato(int tomato) {
        if (tomato != 0) {
            tomatoPrice *= tomato;
            System.out.println("Tomato -> " + tomatoPrice);
            return tomato;
        }
        return 0;
    }

    private int addLettuce(int lettuce) {
        if (lettuce != 0) {
            lettucePrice *= lettuce;
            System.out.println("Lettuce -> " + lettucePrice);
            return lettuce;
        }
        return 0;
    }

    private int addPickles(int pickles) {
        if (pickles != 0) {
            picklesPrice *= pickles;
            System.out.println("Pickles -> " + picklesPrice);
            return pickles;
        }
        return 0;
    }

    private int addFries(int fries) {
        if (fries != 0) {
            friesPrice *= fries;
            System.out.println("Fries -> " + friesPrice);
            return fries;
        }
        return 0;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public double getLettucePrice() {
        return lettucePrice;
    }

    public double getPicklesPrice() {
        return picklesPrice;
    }

    public double getFriesPrice() {
        return friesPrice;
    }

    public double getKinoaPrice() {
        return kinoaPrice;
    }

    public double getAvocadoPrice() {
        return avocadoPrice;
    }
}
