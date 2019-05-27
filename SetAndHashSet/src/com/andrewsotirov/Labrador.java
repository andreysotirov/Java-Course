package com.andrewsotirov;

import java.util.Objects;

public class Labrador extends Dog {

    public Labrador(String name) {
        super(name);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Labrador)) return false;
//        Dog dog = (Dog) o;
//        return Objects.equals(getName(), dog.getName());
//    }
}
