package com.engine;

import javafx.scene.canvas.GraphicsContext;

public class Weapon {
    private String name;
    private int dano;
    
    public Weapon(String name, int dano) {
        this.name = name;
        this.dano = dano;
    }

    public String getName() { 
        return name; 
    }

    public void setName(String name) { 
        this.name = name; 
    }
    
    public int getDano() { 
        return dano; 
    }

    public void setDano(int dano) { 
        this.dano = dano; 
    }
    
    public void draw(GraphicsContext gc, double x, double y) {
        gc.drawImage(null, x, y, 30, 30);
    }
}
