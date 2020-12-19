package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Human me = new Human("Kacper", "Warda");
        me.setSalary(5000.0);

        Phone nokia = new Phone(1999, "Nokia", "3310", 1.0);
//        Car opel = new Car(1999, "Opel", "Corsa", "blue", 2000.0);
//
//        me.phone = nokia;
//        me.setCar(opel);
//
//
//        Human brotherInLow = new Human("Piotr", "Grygo");
//        brotherInLow.setCash(3000.0);
//
//        try {
//            nokia.sell(me, brotherInLow, 50.0);
//        } catch (Exception e) {
//            System.out.println("sorry, nie udało się sprzedać");
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            opel.sell(me, brotherInLow, 2000.0);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        System.out.println("dalsza logika");

        FarmAnimal pig = new FarmAnimal("pig");
        me.pet = pig;
        me.pet = new Pet("cat");

        System.out.println(pig.getWeight());
        pig.feed();
        System.out.println(pig.getWeight());
//        System.out.println(FarmAnimal.getWeight());
//        FarmAnimal.feed();

        //wypisywanie installApp
        nokia.installAnApp("messanger");
        nokia.installAnApp("massanger", "2.3.1");
        nokia.installAnApp("messanger", "4.2.1" , "noveApki.com");

        List<String> appNames = new ArrayList<>();
        appNames.add("messenger");
        appNames.add("facebook");
        appNames.add("cyberbug 2077");

        nokia.installAnApp(appNames);


        Car tesla = new Electric(2020,"toyota", "avensis", "red", 2000.0);
        Car alfa = new Disel(2003,"alfa", "gulia", "gereen", 22000.0);
        Car bmw = new LPG(2002,"bmw", "newBMW", "orange", 32000.0);

        tesla.refuel();
        alfa.refuel();
        bmw.refuel();
    }
}
