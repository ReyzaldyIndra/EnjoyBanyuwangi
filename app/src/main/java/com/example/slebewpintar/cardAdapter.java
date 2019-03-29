package com.example.slebewpintar;

public class cardAdapter {
    private String name;
    private String price;
    private String umur;

    public cardAdapter(String name, String price, String umur) {
        this.name = name;
        this.price = price;
        this.umur =  umur;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getUmur() {
        return umur;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }
}
