package com.company;

import java.util.Scanner;

/**
 * Created by renat_000 on 2017-05-22.
 */
public class PirmaUzduotis {
    private String vardas;

    //1 paprasyti vartotojo ivesti varda
    public void pasisveikinimas() {
        System.out.println("Įveskite vartotojo vardą");
    }

    //2 nuskaityti vartotojo varda
    public void nuskaitymas() {
        Scanner skaneris = new Scanner(System.in);
        vardas = skaneris.nextLine();
    }

    //3 atspausdinti ji 5
    public void spausdinimas() {
        for (int i = 0; i < 5; i++) {
            System.out.println(vardas);
        }
    }

}

