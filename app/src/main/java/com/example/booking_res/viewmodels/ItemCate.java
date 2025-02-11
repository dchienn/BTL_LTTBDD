package com.example.booking_res.viewmodels;

public class ItemCate {
    private String id;
    private String name;

    public ItemCate(String id, String name){
        this.setId(id);
        this.setName(name);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
