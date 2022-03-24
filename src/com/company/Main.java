package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        SuperligaKlub fck = new SuperligaKlub("FC København", "Per Henrik Lings Allé 2", "2100 København", 14, 6, 22, 43, 1, 50);
        SuperligaKlub fcm = new SuperligaKlub("FC Midtjylland", "Kaj Zartows Vej 5", "7400 Herning", 13, 3, 22, 37, 2, 34);
        SuperligaKlub bif = new SuperligaKlub("Brøndby IF", "Brøndby Stadion 30", "2605 Brøndby", 11, 7, 22, 30, 1, 41);
        SuperligaKlub aab = new SuperligaKlub("Aab Fodbold", "Harald Jensens Vej 7-9", "9000 Aalborg", 11, 5, 22, 36, 1, 48);
        SuperligaKlub rfc = new SuperligaKlub("Randers FC", "Viborgvej 92", "8920 Randers", 9, 6, 22, 26, 0, 42);


        SuperligaKlub[] tabel1 = new SuperligaKlub[5];
        tabel1[0] = (fck);
        tabel1[1] = (fcm);
        tabel1[2] = (bif);
        tabel1[3] = (aab);
        tabel1[4] = (rfc);
        ArrayList<SuperligaKlub> tabel2 = new ArrayList<>();
        tabel2.add(fck);
        tabel2.add(fcm);
        tabel2.add(bif);
        tabel2.add(aab);
        tabel2.add(rfc);

    /*BubbleSort1 bubble = new BubbleSort1();
    bubble.bubbleSort(tabel1);
        for (int i = 0; i < tabel1.length; i++){
            System.out.print(tabel1[i] + " ");
        System.out.println();
        }

    }
     */



        VundnekampeComparator vc1 = new VundnekampeComparator();
        Collections.sort(tabel2,vc1);
        GuleKortComparator gkc = new GuleKortComparator();
        //Collections.sort(tabel2,gkc);

        System.out.println(tabel2.get(0));
        System.out.println(tabel2.get(1));
        System.out.println(tabel2.get(2));
        System.out.println(tabel2.get(3));
        System.out.println(tabel2.get(4));
        System.out.println();



        BubbleSort2 b2 = new BubbleSort2();
        b2.bubbleSort(tabel1);
        for (int i = 0; i < tabel1.length; i++){
            System.out.print(tabel1[i] + " ");
            System.out.println();
        }



    }
}
