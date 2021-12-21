package com.company;

import java.util.Scanner;

public class Room {
    private static final Scanner sc = new Scanner(System.in);
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    public Room(Entity player, String character) {

        room(player, character);
        room1(player, character);

    }

    public void room(Entity player, String character) {
        Arena arena = new Arena("WC");
        Entity enemy = new Enemy("Cleaner-StepSis", "Human", "Step-Sis", 20, 1, 10, 10, 10);
        arena.fight(player, enemy);
    }

    public void room1(Entity player, String character) {
        System.out.println("(1)Ghost town (2)bathroom");

        int f = sc.nextInt();
        switch (f) {
            case 1 -> {
                Arena arena = new Arena("Ghost town");
                Entity enemy = new Enemy("Ghost", "ghost", "ghost", 30, 2, 20, 10, 30);
                arena.fight(player, enemy);
            }
            case 2 -> {
                Arena arena = new Arena("Bathroom");
                Entity enemy = new Enemy("Mad Granny", "Human", "Granny", 40, 2, 12, 10, 30);
                arena.fight(player, enemy);
            }
        }
        System.out.println("You have found a naštvané dítě , it will add you a 30 hp");
        player.setHp(player.getHp() + 30);
        System.out.println(player.toString());
        System.out.println("(1)Next Level (2)Previous Level");
        int g = sc.nextInt();
        switch (g) {
            case 1 -> room2(player, character);
            case 2 -> room(player, character);
        }
    }

    public void room2(Entity player, String character) {
        Arena arena = new Arena("ICY Karbolansko");
        Entity enemy = new Enemy("Ice Frog", "Anomalie", "Frog", 100, 4, 6, 10, 30);
        arena.fight(player, enemy);
        System.out.println("Next Level(1), shop (2), Previous Level (3)");
        int g = sc.nextInt();
        switch (g) {
            case 1 -> room1(player, character);
            case 2 -> roomshop(player, character);
            case 3 -> room3(player, character);
        }
    }

    public void roomshop(Entity player, String character) {
        new Shop(player, character);
        System.out.println("(1)Boss Fight (2)Zůstat v obchodě  (3)Se vratit na předchozí level");
        int g = sc.nextInt();
        switch (g) {
            case 1 -> room3(player, character);
            case 2 -> roomshop(player, character);
            case 3 -> room2(player, character);

        }
    }

    public void room3(Entity player, String character) {
        Arena arena = new Arena("Lava");
        Entity enemy = new Enemy("Lava hound", "Hound", "Hound", 200, 2, 11, 10, 100);
        arena.fight(player, enemy);
        System.out.println("(1)Next Level (2)Shop");
        int g = sc.nextInt();
        switch (g) {
            case 1 -> room4(player, character);
            case 2 -> roomshop(player, character);
        }
    }

    public void room4(Entity player, String character) {
        Arena arena = new Arena("Karbanov");
        Entity enemy = new Enemy("Karbolan", "Harman", "Dentist", 10, 5, 100, 10, 50);
        arena.fight(player, enemy);
        System.out.println("(1)Next Level (2)Shop (3)Previous Level");
        int g = sc.nextInt();
        switch (g) {
            case 1 -> room5(player, character);
            case 2 -> roomshop(player, character);
            case 3 -> room3(player, character);
        }
    }

    public void room5(Entity player, String character) {
        Arena arena = new Arena("Poušť");
        Entity enemy = new Enemy("Písečný červ", "červ", "červ", 250, 5, 35, 10, 75);
        arena.fight(player, enemy);
        System.out.println("(1)Další level (2)Jít do obchodu (3)jít na předchozí level");
        int g = sc.nextInt();
        switch (g) {
            case 1 -> room6(player, character);
            case 2 -> roomshop2(player, character);
            case 3 -> room5(player, character);
        }
    }
    public void roomshop2(Entity player, String character) {
        new Shop(player, character);
        System.out.println("(1)Další level (2)Zůstat v obchodě  (3)Se vratit na předchozí level");
        int g = sc.nextInt();
        switch (g) {
            case 1 -> room6(player, character);
            case 2 -> roomshop2(player, character);
            case 3 -> room5(player, character);

        }
    }

    public void room6(Entity player, String character) {
        Arena arena = new Arena("Učebna 45");
        Entity enemy = new Enemy("Marty", "Teacher", "Magistr", 350, 5, 25, 10, 80);
        arena.fight(player, enemy);
        System.out.println("\nNašel jsi naštvané dítě, který ti přidalo 100 hp \n");
        player.setHp(player.getHp() + 100);
        System.out.println(player.toString());
        System.out.println("(1)Další level (2)Jít do obchodu (3)jít na předchozí level");
        int g = sc.nextInt();
        switch (g) {
            case 1 -> room7(player, character);
            case 2 -> roomshop2(player, character);
            case 3 -> room5(player,character);
        }
    }
        public void room7 (Entity player, String character){
            Arena arena = new Arena("Sborovna");
            Entity enemy = new Enemy("Venda", "Human", "Principal", 1000, 5, 9, 10, 1000);
            arena.fight(player, enemy);
            System.out.println(ANSI_CYAN+"Vyhrál jsi, jsi nejlepší vlastník hry dostal maximalní počet bodů do tabulky"+ANSI_RESET);
            System.out.println(ANSI_CYAN+"GG EZ"+ANSI_RESET);
        }
    }



