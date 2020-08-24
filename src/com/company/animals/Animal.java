package com.company.animals;

public class Animal {
    private String name;
    public Integer weight;

    public Animal(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public Animal() {
    }

    public void voice(){
        System.out.println("Voice!");
    }
}
