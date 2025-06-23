package com.engine;
public class Item {
    private String name;
    private String descricao;

    public Item(String name, String descricao) {
        this.name = name;
        this.descricao = descricao;
    }

    public String getName() { 
        return name; 
    }

    public void setName(String name) { 
        this.name = name; 
    }
    
    public String getDescricao() { 
        return descricao; 
    }

    public void setDescricao(String descricao) { 
        this.descricao = descricao; 
    }
}
