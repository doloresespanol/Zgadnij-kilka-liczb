package com.klasa3Pgr2;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Witaj na losowaniu 6 liczb");
        //tablica wylosowane
        //kolekcja
        //mogą mieć tylko typy złożone
        //mozna dodawac i usuwac elementy
        Set<Integer> wylosowane = new HashSet<>();
        //zbiór zazwyczaj zawiera elementy bez powtórzeń
        //zbiór zazwyczaj nie ma indeksowania elementów
        while (wylosowane.size()<6){
            wylosowane.add((int) (Math.random() * 10 + 1));
        }
        for(int element:wylosowane){
            System.out.print(element+" ");
        }
        System.out.println("\nInaczej wypisane: ");
        System.out.print(wylosowane);

        //wpisywanie 6 liczb z klawiatury
        //dodajemy elementy na koncu tablicy
        //na razie dowolne potem bez powtorzen
        Scanner klawiatura = new Scanner(System.in);
        List<Integer> wpisane = new ArrayList<>();
        //lista to kolekcja w ktorej mozna zmieniac rozmiar w trakcie dzialania programu
        //elementy indeksowe moga sie powtarzac
        System.out.println("\nPodaj 6 liczb");
        while(wpisane.size()<6){
            int liczba = klawiatura.nextInt();
            while(wpisane.contains(liczba)){
                System.out.println("Już taka liczbę wpisano");
                liczba=klawiatura.nextInt();
            }
            wpisane.add(liczba);
        }
        System.out.println(wpisane);
    }
}