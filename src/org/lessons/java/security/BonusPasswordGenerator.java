package org.lessons.java.security;

import java.util.Scanner;

public class BonusPasswordGenerator {
    public static void main(String[] args) {

        //dichiaro scanner
        Scanner scanner = new Scanner(System.in);


        // Variabili
        String userName;
        String userSurname;
        String favoriteColor;
        int dayBirth;
        int monthBirth;
        int yearBirth;

        //chiedo valori a utente
        System.out.println("Qual è il tuo nome?");
        userName = scanner.nextLine();
        System.out.println("Qual è il tuo cognome?");
        userSurname = scanner.nextLine();
        System.out.println("Qual è il tuo colore preferito?");
        favoriteColor = scanner.nextLine();
        System.out.println("Qual è la tua data di nascita?");

        dayBirth = scanner.nextInt();
        monthBirth = scanner.nextInt();
        yearBirth = scanner.nextInt();

        scanner.close();

        int sumDateBirth = dayBirth + monthBirth + yearBirth;

        String passwordGenerator = userName + "-" + userSurname + "-" + favoriteColor + "-" + sumDateBirth;
        System.out.println("Questa è la tua password: " + passwordGenerator);

    }
}
