package org.generation.italy.security;

import java.util.Scanner;

public class PasswordGenerator {
   
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inserisci il tuo nome");
        String name = sc.nextLine();
        
        System.out.println("Inserisci il tuo cognome");
        String surname = sc.nextLine();
        
        System.out.println("Inserisci il tuo colore preferito");
        String favoriteColor = sc.nextLine();
        
        
        System.out.println("Inserisci il giorno della tua nascita");
        int day = sc.nextInt();
        
        System.out.println("Inserisci il mese della tua nascita");
        int month = sc.nextInt();
        
        System.out.println("Inserisci l'anno della tua nascita");
        int year = sc.nextInt();
        
        int sum = day + month + year;
        
        System.out.println(name + "-" + surname + "-" + favoriteColor + "-" + sum);
    }
	
}
