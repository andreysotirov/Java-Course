package com.andrewsotirov;

public class DeksPhone implements ITelephone {

    private int myNumber;

    public DeksPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {

    }

    @Override
    public void dial(int phoneNumber) {

    }

    @Override
    public void answer() {

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            System.out.println("Calling " + myNumber);
        } else {
            System.out.println("Wrong number");
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
