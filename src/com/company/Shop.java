package com.company;

import com.company.game.utils.IOUtil;

import java.util.Objects;
import java.util.Scanner;

public class Shop {
    Scanner sc = new Scanner(System.in);

    public Shop(Entity player, String character) {
        select(player, character);
    }

    public void select(Entity player, String character) {
        System.out.println();
        System.out.println("Máš "+player.getMoney()+" goldů");
        System.out.println();
        if (Objects.equals(character, "m")){
            IOUtil.printText("(1) "+Item.hul.toString());
            IOUtil.printText("(2)" +Item.armor.toString());
            int g = sc.nextInt();
            switch (g) {
                case 1 -> {
                    if (player.getMoney() >= Item.hul.getPrice()){
                        player.setMoney(player.getMoney()-Item.hul.getPrice());
                        player.setDmg(player.getDmg() + Item.hul.getDmg());
                        System.out.println(player.toString());
                    }else {
                        System.out.println("Nemáš peníze");
                    }
                }
                case 2 -> { if (player.getMoney() >= Item.armor.getHp()){
                    player.setMoney(player.getMoney()-Item.armor.getPrice());
                    player.setHp(player.getHp() + Item.armor.getHp());
                    System.out.println(player.toString());
                }else {
                    System.out.println("Nemáš peníze");
                }
                }
                default -> select(player,character);

            }
        }else if (Objects.equals(character, "a")){
            IOUtil.printText("(1)" + Item.luk.toString());
            IOUtil.printText("(2)" +Item.armor.toString());
            int g = sc.nextInt();  switch (g) {
                case 1 -> {
                    if (player.getMoney() >= Item.luk.getPrice()){
                        player.setMoney(player.getMoney()-Item.luk.getPrice());
                        player.setDmg(player.getDmg() + Item.luk.getDmg());
                        System.out.println(player.toString());
                    }else {
                        System.out.println("Nemáš peníze");
                    }
                }
                case 2 -> { if (player.getMoney() >= Item.armor.getHp()){
                    player.setMoney(player.getMoney()-Item.armor.getPrice());
                    player.setHp(player.getHp() + Item.armor.getHp());
                    System.out.println(player.toString());
                }else {
                    System.out.println("Nemáš peníze");
                }
                }
            }

        }
        else if (Objects.equals(character, "s")){
            IOUtil.printText("(1)" +Item.sekera.toString());
            IOUtil.printText("(2)" +Item.armor.toString());
            int g = sc.nextInt();  switch (g) {
                case 1 -> {
                    if (player.getMoney() >= Item.sekera.getPrice()){
                        player.setMoney(player.getMoney()-Item.sekera.getPrice());
                        player.setDmg(player.getDmg() + Item.sekera.getDmg());
                        System.out.println(player.toString());
                    }else {
                        System.out.println("Nemáš peníze");
                    }
                }
                case 2 -> { if (player.getMoney() >= Item.armor.getHp()){
                    player.setMoney(player.getMoney()-Item.armor.getPrice());
                    player.setHp(player.getHp() + Item.armor.getHp());
                    System.out.println(player.toString());
                }else {
                    System.out.println("Nemáš peníze");
                }
                }
            }

        }else{
            IOUtil.printText("(1)" +Item.mec.toString());
            IOUtil.printText("(2)" +Item.armor.toString());
            int g = sc.nextInt();
            switch (g) {
                case 1 -> {
                    if (player.getMoney() >= Item.mec.getPrice()){
                        player.setMoney(player.getMoney()-Item.mec.getPrice());
                        player.setDmg(player.getDmg() + Item.mec.getDmg());
                        System.out.println(player.toString());
                    }else {
                        System.out.println("Nemáš peníze");
                    }
                }

                case 2 -> { if (player.getMoney() >= Item.armor.getHp()){
                    player.setMoney(player.getMoney()-Item.armor.getPrice());
                    player.setHp(player.getHp() + Item.armor.getHp());
                    System.out.println(player.toString());
                }else {
                    System.out.println("Nemáš peníze");
                }
                }
            }

        }
    }
}
