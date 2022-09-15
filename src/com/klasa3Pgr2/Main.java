package com.klasa3Pgr2;
public class Main {
    public static void main(String[] args) {
        //losowanie 6 liczb zapisze je w tablicy potem w kolekcji
        //wpisywanie 6 liczb
        //sprawdzanie ile trafionych
        System.out.println("Witaj na losowaniu 6 liczb");
        //tablica wylosowane
        int wylosowane[] = new int[6];
        //wartosci w tablicy typu prostego lub zlozonego
        //nie ma mozliwosci zminy jej rozmiaru po jej deklaracji
        for(int i =0; i<wylosowane.length; i++){
            wylosowane[i] = (int)(Math.random()*100+1);
        }
        for(int i =0; i<wylosowane.length; i++){
            System.out.print(wylosowane[i] + " ");
        }
    }
}