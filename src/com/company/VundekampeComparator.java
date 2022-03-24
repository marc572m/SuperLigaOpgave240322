package com.company;


import java.util.Comparator;



class VundnekampeComparator implements Comparator<SuperligaKlub> {
    public int compare(SuperligaKlub s1, SuperligaKlub s2) {

        if (s1.vundneKampe==s2.vundneKampe)
            return 0;
        else if(s1.vundneKampe<s2.vundneKampe)
            return -1;
        else return 1;
    }


}

