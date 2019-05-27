package com.andrewsotirov;

public class Furniture {

    private String sofa;
    private int table;
    private int chair;

    public Furniture(String sofa, int table, int chair) {
        this.sofa = sofa;
        this.table = table;
        this.chair = chair;
    }

    public String getSofa() {
        return sofa;
    }

    public int getTable() {
        return table;
    }

    public int getChair() {
        return chair;
    }

    public void numberOfChairs(){
        System.out.println("Number of chairs is = " + chair);
    }
}
