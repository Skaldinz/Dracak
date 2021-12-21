package com.company;

public enum Item {
    hul("hůl z krabanova předkožky",50,50),
    luk("luk ze zubů zubaře Josefa",25,75),
    mec("meč z vlasů mistra třísky",30,100),
    sekera("sekera z uší mista oogwaye",50,50),
    armor("brnění z nikotinu",100,0,100);

    private double hp;
    private String name;
    private double dmg;
    private double price;


    public double getHp() {return hp;}

    public String getName() {
        return name;
    }

    public double getDmg() {
        return dmg;
    }

    public double getPrice() {
        return price;
    }

    Item(String name,double hp, double dmg, double price) {
        this.name = name;
        this.dmg = dmg;
        this.price = price;
        this.hp = hp;

    }

    Item(String name, double dmg, double price) {
        this.name = name;
        this.dmg = dmg;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setHp(double hp) {this.hp = hp;}

    @Override
    public String toString() {
        return  name  + ":\n"+
                "+hp=" + hp + "\n"+
                "+dmg=" + dmg + "\n"+
                "+price=" + price + "\n";

    }
}

