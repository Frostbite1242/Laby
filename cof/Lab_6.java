package cof;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab_6 {
    public static void main(String[] args) {



        Coffee Arabica = new Arabica(15.0, 150, 30, "beans", 20.0);
        Coffee Robusta = new Robusta(45.0, 169.0, 10,"powder", 35.0);
        Coffee Liberica = new Liberica(35.0, 250.0, 20 ,"can", 12.0);
        System.out.println("After reset:");
        System.out.println(Liberica+"\n");

        Coffee[] coffeeList = new Coffee[]{Arabica, Robusta, Liberica};

        CoffeeTruk firstTruk = new CoffeeTruk(15000);
        firstTruk.fillByPriceFromCoffeeMenu(675, coffeeList);
        ArrayList<Coffee> findList = firstTruk.findByQuality(28, 48);
        for (Coffee findCoffee: findList){
            System.out.println(findCoffee);
        }


        System.out.println(firstTruk);
        System.out.println();
        firstTruk.sortByPricePerWeight();
        System.out.println(firstTruk);
    }
}
