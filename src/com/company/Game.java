package com.company;

import com.company.game.utils.IOUtil;

import java.util.Scanner;

public class Game {
    Entity Wa = new Player(jk, "humman", "Warrior", 175, 1, 10, 0, 0);
    Entity Ar = new Player(jk, "elf", "Archer", 150, 1, 15, 0, 0);
    Entity Wi = new Player(jk, "humman", "Mag", 100, 1, 25, 0, 0);
    Entity S = new Player(jk, "humman", "Skeleton", 125, 1, 18, 0, 0);
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    private static Scanner sc = new Scanner(System.in);
    public static String jk = nick();
    public static String nick(){
        IOUtil.printText(ANSI_CYAN+"Welcome Welcome."+ ANSI_RESET);
        IOUtil.printText(ANSI_CYAN+"Nyní tě čeká nudná cesta."+ ANSI_RESET);
        IOUtil.printText(ANSI_CYAN+"Na cestě budeš potkávat divné stvůry"+ ANSI_RESET);
        IOUtil.printText(ANSI_CYAN+"Některé věci ti mohou pomoci vyhrati tuto hru."+ ANSI_RESET);
        System.out.println();
        System.out.println("Zadej svoje herní jméno:\n");
        String jk = sc.nextLine();
        System.out.println();
        return jk;
    }
    public Game() {
        Warrior();
        Archer();
        Wizzard();
        Skeleton();
        IOUtil.printText("Vyber si postavu, za kterou chceš hrát:\n");
        game();
    }

    public void Warrior() {
        System.out.println("|\\             //\n" +
                " \\\\           _!_\n" +
                "  \\\\         /___\\\n" +
                "   \\\\        [+++]\n" +
                "    \\\\    _ _\\^^^/_ _\n" +
                "     \\\\/ (    '-'  ( )\n" +
                "     /( \\/ |       /  \\\n" +
                "       \\  / \\     / _> )\n" +
                "        \"`   >:::;-'`\"\"'-.\n" +
                "            /:::/         \\\n" +
                "           /  /||   {&}   |\n" +
                "          (  / (\\         /\n" +
                "          / /   \\'-.___.-'\n" +
                "        _/ /     \\ \\\n" +
                "       /___|    /___|");
        System.out.printf("Role:%s %n", Wa.getRole() + "\n race:" + Wa.getRace() + "\n hp:" + Wa.getHp() + "\n lv:" + Wa.getLv()+ "\n dmg:"+ Wa.getDmg() + "\n money:" + Wa.getMoney());
    }

    public void Archer() {
        System.out.println("           /   :.                        \n" +
                "          /     \\\\                      \n" +
                "       ,;/,      ::              \n" +
                "   ___:c/.(      ||                    \n" +
                " ,'  _|:)>>>--,-'B)>                   \n" +
                "(  '---'\\--'` _,'||                    \n" +
                " `--.    \\ ,-'   ;;                   \n" +
                "     |    \\|    //                 \n" +
                "     |     \\   ;'                  \n" +
                "     |_____|\\,'                 \n" +
                "     :     :       \n" +
                "     |  ,  |\n" +
                "     | : \\ :                           \n" +
                "     | | : :                           \n" +
                "     | | | |                           \n" +
                "     | | |_`.                  \n" +
                "     '--`   \n");

        System.out.printf("Role:%s %n", Ar.getRole() + "\n race:" + Ar.getRace() + "\n hp:" + Ar.getHp() + "\n lv:" + Ar.getLv() +"\n dmg:"+ Ar.getDmg() + "\n money:" + Ar.getMoney());
    }
    public void Wizzard() {
        System.out.println("             _,._      \n" +
                "  .||,       /_ _\\\\     \n" +
                " \\.`',/      |'L'| |    \n" +
                " = ,. =      | -,| L    \n" +
                " / || \\    ,-'\\\"/,'`.   \n" +
                "   ||     ,'   `,,. `.  \n" +
                "   ,|____,' , ,;' \\| |  \n" +
                "  (3|\\    _/|/'   _| |  \n" +
                "   ||/,-''  | >-'' _,\\\\ \n" +
                "   ||'      ==\\ ,-'  ,' \n" +
                "   ||       |  V \\ ,|   \n" +
                "   ||       |    |` |   \n" +
                "   ||       |    |   \\  \n" +
                "   ||       |    \\    \\ \n" +
                "   ||       |     |    \\\n" +
                "   ||       |      \\_,-'\n" +
                "   ||       |___,,--\")_\\\n" +
                "   ||         |_|   ccc/\n" +
                "   ||        ccc/       \n" +
                "                   ");

        System.out.printf("Role:%s %n", Wi.getRole() + "\n race:" + Wi.getRace() + "\n hp:" + Wi.getHp() + "\n lv:" + Wi.getLv() +"\n dmg:"+ Wi.getDmg() + "\n money:" + Wi.getMoney());
    }

    public void Skeleton() {
        System.out.println("    \n" +
                "     (o.o)   __\n" +
                "      |M|  <|><|>\n" +
                "     __|__   ||\n" +
                "   //.=|=.\\\\ ||\n" +
                "  // .=|=. \\\\||\n" +
                "  \\\\ .=|=.  \\||\n" +
                "   \\\\(_=_)   ||\n" +
                "    (:| |:)  ||\n" +
                "     || ||    \n" +
                "     () ()\n" +
                "     || ||\n" +
                "     || ||\n" +
                "    ==' '==\n");
        System.out.printf("Role:%s %n", S.getRole() + "\n race:" + S.getRace() + "\n hp:" + S.getHp() + "\n lv:" + S.getLv() +"\n dmg:"+ S.getDmg() +  "\n money:" + S.getMoney()+"\n");
    }


    public void game() {
        System.out.println("(m) Mag");
        System.out.println("(a) Archer");
        System.out.println("(w) Warriors");
        System.out.println("(s) Skeleton");
        String character = sc.nextLine();
        Entity player = null;
        switch (character) {
            case "m" -> {
                player = Wi;
                IOUtil.printText("Vybral sis maga");
                break;
            }
            case "a" -> {
                player = Ar;
                IOUtil.printText("Vybral sis archera");

                break;
            }
            case "w" -> {
                player = Wa;
                IOUtil.printText("Vybral sis warrior");
                break;
            }
            case "s" -> {
                player = S;
                IOUtil.printText("Vybral sis skeletona");
                break;
            }
            default -> game();
        }
        new Room(player,character);
    }

}







