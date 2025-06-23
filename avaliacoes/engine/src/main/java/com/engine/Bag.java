package com.engine;

import java.util.ArrayList;
import java.util.List;

public class Bag extends Item {
    private List<Item> items;

    public Bag(String name, String descricao) {
        super(name, descricao);
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }  
}