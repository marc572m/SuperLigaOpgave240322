package com.company;

import java.util.Comparator;



class GuleKortComparator implements Comparator<SuperligaKlub> {
    public int compare(SuperligaKlub s1, SuperligaKlub s2) {

        if (s1.guleKort==s2.guleKort)
            return 0;
        else if(s1.guleKort<s2.guleKort)
            return -1;
        else return 1;
    }


}