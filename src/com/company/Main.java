package com.company;

import java.util.*;

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

        Set<SuperligaKlub> hashSetTabel = new HashSet<>();
        hashSetTabel.add(fck);
        hashSetTabel.add(fcm);
        hashSetTabel.add(bif);
        hashSetTabel.add(aab);
        hashSetTabel.add(rfc);
        //for (SuperligaKlub s: hashSetTabel) {
          //  System.out.println(s + " ");
       // }

        Set<SuperligaKlub> linkedHashSetTabel = new LinkedHashSet<>();
        linkedHashSetTabel.add(fck);
        linkedHashSetTabel.add(fcm);
        linkedHashSetTabel.add(bif);
        linkedHashSetTabel.add(aab);
        linkedHashSetTabel.add(rfc);

        Set<SuperligaKlub> linkedTreeSet = new TreeSet<>();
        linkedTreeSet.add(fck);
        linkedTreeSet.add(fcm);
        linkedTreeSet.add(bif);
        linkedTreeSet.add(aab);
        linkedTreeSet.add(rfc);

        TreeSet<SuperligaKlub> linkedTreeSet1 = new TreeSet<SuperligaKlub>(new GuleKortComparator());
        linkedTreeSet1.add(fck);
        linkedTreeSet1.add(fcm);
        linkedTreeSet1.add(bif);
        linkedTreeSet1.add(aab);
        linkedTreeSet1.add(rfc);
        for (SuperligaKlub s: linkedTreeSet1) {
          System.out.println(s + " ");
         }

/*
        Map<SuperligaKlub,String> klubber = new HashMap<>();
        klubber.put(fck,"Jess Thorup");
        klubber.put(fcm,"Bo Henriksen");
        klubber.put(bif,"Niels Frederiksen");
        klubber.put(aab,"Jacob Friis");
        klubber.put(rfc,"Thomas Thomasberg");
        System.out.println("HashMap:");
        for (SuperligaKlub key : klubber.keySet()){
            System.out.println(key + " = "+ klubber.get(key));
        }

        System.out.println("LinkedHashmap:");
        Map<SuperligaKlub, String> klubber1 = new LinkedHashMap<>();
        klubber1.put(fck,"Jess Thorup");
        klubber1.put(fcm,"Bo Henriksen");
        klubber1.put(bif,"Niels Frederiksen");
        klubber1.put(aab,"Jacob Friis");
        klubber1.put(rfc,"Thomas Thomasberg");
        for (SuperligaKlub key : klubber1.keySet()){
            System.out.println(key + " = "+ klubber1.get(key));
        }

        System.out.println("TreeMap:");
        Map<SuperligaKlub, String> klubber2 = new TreeMap<>();
        klubber2.put(fck,"Jess Thorup");
        klubber2.put(fcm,"Bo Henriksen");
        klubber2.put(bif,"Niels Frederiksen");
        klubber2.put(aab,"Jacob Friis");
        klubber2.put(rfc,"Thomas Thomasberg");
        for (SuperligaKlub key : klubber2.keySet()){
            System.out.println(key + " = "+ klubber2.get(key));
        }


 */

    /*BubbleSort1 bubble = new BubbleSort1();
    bubble.bubbleSort(tabel1);
        for (int i = 0; i < tabel1.length; i++){
            System.out.print(tabel1[i] + " ");
        System.out.println();
        }

    }
     */



       /* VundnekampeComparator vc1 = new VundnekampeComparator();
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

        */



    }
}
