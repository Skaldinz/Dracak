package com.company;
import com.company.game.utils.IOUtil;
public class Arena {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";

    private String name;
    private boolean isRunning = true;

    public Arena(String name) {
        this.name = name;
    }

    public void fight(Entity player, Entity enemy) {
        System.out.println( ANSI_CYAN+"You are in "+ ANSI_RESET  + name +  ANSI_CYAN+" You have to win a fight to continue."+ANSI_RESET);
        while(isRunning) {
            printEntities(player, enemy);
            round(player, enemy);
        }
    }

    private void printEntities(Entity player, Entity enemy) {
        IOUtil.printText(player.toString());
        IOUtil.printText(enemy.toString());
    }

    private void round(Entity player, Entity enemy) {
        System.out.println("1. Attack");
        System.out.println("2. Deffence");
        System.out.println("3. Dodge");
        System.out.print("Chose the action: ");
        int i;
        try {
            i = Integer.parseInt(IOUtil.getInput());
            switch (i) {
                case 1 -> {
                    IOUtil.printText(player.getName() + ANSI_RED+" Attacked"+ ANSI_RESET);
                    double d = Math.random();
                    if (d < 0.5) {
                        //Enemy utoci
                        IOUtil.printText(enemy.getName() + ANSI_RED+" Attacked" + ANSI_RESET);
                        enemy.setHp(Math.floor(enemy.getHp() - player.getDmg()));
                        if (isEnemyDead(player, enemy)) {
                            return;
                        }
                        player.setHp(Math.floor(player.getHp() - enemy.getDmg()));
                        if (isPlayerDead(player)) {
                            return;
                        }
                        return;
                    }
                    //Enemy se brani
                    IOUtil.printText(enemy.getName() + ANSI_GREEN+" Deffence"+ ANSI_RESET);
                    enemy.setHp(Math.floor(enemy.getHp() - (player.getDmg() / 3)));
                    isEnemyDead(player, enemy);
                }


                case 2 -> {
                    IOUtil.printText(player.getName() + ANSI_GREEN+" ¨Deffence"+ ANSI_RESET);
                    double d = Math.random();
                    if (d < 0.5) {
                        // Enemy utoci
                        IOUtil.printText(enemy.getName() + ANSI_RED+" Attacked"+ ANSI_RESET);
                        player.setHp(Math.floor(player.getHp() - (enemy.getDmg() / 3)));
                        if(isPlayerDead(player)) {
                            return;
                        }
                        return;
                    }
                    // Enemy se brani
                    IOUtil.printText(enemy.getName() + ANSI_GREEN+" Deffence"+ ANSI_RESET);
                    IOUtil.printText("Boooriiing");
                }
                case 3 -> {
                    IOUtil.printText(player.getName() + ANSI_CYAN +" Dodge"+ ANSI_RESET);
                    double d = Math.random();
                    if (d < 0.33) {
                        IOUtil.printText(enemy.getName() +ANSI_RED+ " Attacked"+ ANSI_RESET);
                        player.setHp(Math.floor(player.getHp() - (enemy.getDmg()*0)));
                        if (isPlayerDead(player)) {
                            return;
                        }
                        return;
                    }
                    // Enemy se brani
                    IOUtil.printText(enemy.getName() + ANSI_GREEN+" Deffence"+ ANSI_RESET);
                    IOUtil.printText("Boooooriiing");
                }

                default -> round(player, enemy);
            }
        } catch (Exception e) {
            round(player, enemy);
        }

    }

    private boolean isPlayerDead(Entity player) {
        if (player.getHp() <= 0) {
            isRunning = false;
            IOUtil.printText(ANSI_PURPLE+"You lost,try luck next time"+ ANSI_RESET);
            return true;
        }
        return false;
    }

    private boolean isEnemyDead(Entity player, Entity enemy) {
        if (enemy.getHp() <= 0) {
            isRunning = false;
            IOUtil.printText(player.getName() + ANSI_YELLOW +  " You won, okaaaay Lessss goooouuu" + ANSI_RESET);
            player.setMoney(player.getMoney()+ enemy.getMoney());
            player.setLv(player.getLv()+1);
            if (player.getLv() >= 2){
                player.setHp(Math.floor(player.getHp()*1.05));
                player.setDmg(player.getDmg()+3);
            }else if (player.getLv()>=5){
                player.setHp(Math.floor(player.getHp()*1.1));
                player.setDmg(player.getDmg()+5);
            }
            return true;
        }
        return false;
    }

}


