package com.klasa3Pgr2.gra;

import java.util.*;

public class Gra {
    //modyfikatory dostępu
    /*
    public - dostępne wszędzie
    brak - dostępne wszędzie w pakiecie
    private - klasa
    protected - w klasie i klasach potomnych oraz w pakiecie
    używanie private hermetyzacja
     */
    private static Set<Integer> wylosowaneLiczby = new HashSet<>();
    private List<Integer> wpisaneLiczby = new ArrayList<>();
    private List<Integer> trafioneLiczby = new LinkedList<>();
    private void wylosowanieLiczb(int n){
        while (wylosowaneLiczby.size()<n){
            wylosowaneLiczby.add((int) (Math.random() * 100 + 1));
        }
    }
    private void wpisanieLiczb(int n){
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("\nPodaj n liczb");
        wpisaneLiczby.clear();
        while(wpisaneLiczby.size()<n){
            int liczba = klawiatura.nextInt();
            while(wpisaneLiczby.contains(liczba)){
                System.out.println("Już taka liczbę wpisano");
                liczba=klawiatura.nextInt();
            }
            wpisaneLiczby.add(liczba);
        }
    }
    public void podsumowanie (){
        for(Integer wpisana:wpisaneLiczby){
            if(wylosowaneLiczby.contains(wpisana)){
                trafioneLiczby.add(wpisana);
            }
        }
    }
    public void zagraj (int liczbaWpisanych){
        wylosowanieLiczb(6);
        wpisanieLiczb(liczbaWpisanych);
        podsumowanie();
        System.out.println("Wylosowane liczby: "+wylosowaneLiczby);
        System.out.println("Wpisane liczby: "+wpisaneLiczby);
        System.out.println("Trafione liczby: "+trafioneLiczby);

    }

}