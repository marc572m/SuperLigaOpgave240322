package com.company;

public class SuperligaKlub implements Comparable {
    String klubnavn;
    String adresse;
    String postnummer;
    int vundneKampe;
    int uafgjorteKampe;
    int spilledeKampe;
    int scoringer;
    int udvisninger;
    int guleKort;

    public SuperligaKlub(String klubnavn, String adresse, String postnummer, int vundneKampe, int uafgjorteKampe, int spilledeKampe, int scoringer, int udvisninger, int guleKort) {
        this.klubnavn = klubnavn;
        this.adresse = adresse;
        this.postnummer = postnummer;
        this.vundneKampe = vundneKampe;
        this.uafgjorteKampe = uafgjorteKampe;
        this.spilledeKampe = spilledeKampe;
        this.scoringer = scoringer;
        this.udvisninger = udvisninger;
        this.guleKort = guleKort;
    }

    @Override
    public String toString() {
        return "SuperligaKlub{" +
                "klubnavn='" + klubnavn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", postnummer='" + postnummer + '\'' +
                ", vundneKampe=" + vundneKampe +
                ", uafgjorteKampe=" + uafgjorteKampe +
                ", spilledeKampe=" + spilledeKampe +
                ", scoringer=" + scoringer +
                ", udvisninger=" + udvisninger +
                ", guleKort=" + guleKort +
                '}';
    }

/*
    @Override
    public int compareTo(Object o) {
        SuperligaKlub s1=(SuperligaKlub) o;
        if(klubnavn.compareTo(s1.klubnavn)==0)
            return 0;
        else if(klubnavn.compareTo(s1.klubnavn)>0)
            return 1;
        else
            return -1;
    }


 */


    public int compareTo(Object o) {
        SuperligaKlub s1=(SuperligaKlub) o;
        if(vundneKampe==s1.vundneKampe)
            return 0;
        else if(vundneKampe<s1.vundneKampe)
            return 1;
        else
            return -1;
    }


/*
    public int compareTo(Object o) {
        SuperligaKlub s1=(SuperligaKlub) o;
        if(scoringer==s1.scoringer)
            return 0;
        else if(scoringer<s1.scoringer)
            return 1;
        else
            return -1;
    }

 */



}

