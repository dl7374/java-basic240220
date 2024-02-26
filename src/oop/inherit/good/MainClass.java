package oop.inherit.good;

public class MainClass {

    public static void main(String[] args) {

        Warrior w1 = new Warrior();
        w1.name = "전사1";
        w1.level = 1;
        w1.atk = 8;
        w1.hp = 150;
        w1.rage = 30;
        w1.characterInfo();

        System.out.println("-----------------------------------");
        Mage m1 = new Mage();
        m1.name = "마법사";
        m1.level = 1;
        m1.atk = 5;
        m1.hp = 130;
        m1.mana = 250;
        m1.characterInfo();

        System.out.println("-----------------------------------");
        Hunter h1 = new Hunter();
        h1.name = "헌터";
        h1.level = 1;
        h1.atk = 7;
        h1.hp = 140;
        h1.pet = "멍멍이";
        h1.characterInfo();






    }

}
