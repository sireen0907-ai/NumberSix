package com.example.numbersix;

import java.io.Serializable;

public class Outfit implements Serializable {
    private String type;
    private int size;
    private String color;

    public void setCountry(String country) {
        this.country = country;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    private String country;

    public String getStyle() {
        return style;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    private String style;
    public Outfit(){}
        public Outfit(String type, int size, String color, String country, String style){
            this.type=type;
            this.size=size;
            this.color=color;
            this.country=country;
            this.style=style;
        }


}
