package com.andrewsotirov;

public class Technology {

    private boolean TV;
    private boolean hiFy;

    public Technology(boolean TV, boolean hiFy) {
        this.TV = TV;
        this.hiFy = hiFy;
    }

    public boolean isThereTV() {
        if (TV) {
            return true;
        }
        return false;
    }
}
