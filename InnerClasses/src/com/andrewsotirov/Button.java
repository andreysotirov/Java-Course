package com.andrewsotirov;

public class Button {
    private String title;
    private OnClickListner onClickListner;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListner(OnClickListner onClickListner) {
        this.onClickListner = onClickListner;
    }

    public void onClick() {
        onClickListner.onClick(title);
    }

    public interface OnClickListner {
        void onClick(String title);
    }
}
