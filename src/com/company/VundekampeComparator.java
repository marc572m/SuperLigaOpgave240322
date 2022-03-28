package com.company;


import java.util.Comparator;



class VundnekampeComparator implements Comparator<SuperligaKlub> {
    public VundnekampeComparator(){
    }
    public int compare(SuperligaKlub s1, SuperligaKlub s2) {

        return Integer.compare(s1.vundneKampe, s2.vundneKampe);
    }





}

