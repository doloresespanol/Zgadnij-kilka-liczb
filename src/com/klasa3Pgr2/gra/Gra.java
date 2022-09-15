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
    private Set<Integer> wylosowaneLiczby = new HashSet<>();
    private List<Integer> wpisaneLiczby = new ArrayList<>();
    private List<Integer> trafioneLiczby = new LinkedList<>();
    public void wylosowanieLiczb(int n){
        while (wylosowaneLiczby.size()<n){
            wylosowaneLiczby.add((int) (Math.random() * 100 + 1));
        }
    }
    public void wpisanieLiczb(int n){
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("\nPodaj n liczb");
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
        for(Integer wpisanaWartosc:wpisaneLiczby){
            if(wpisaneLiczby.contains(wpisanaWartosc)){
                trafioneLiczby.add(wpisanaWartosc);
            }
        }
    }
}

