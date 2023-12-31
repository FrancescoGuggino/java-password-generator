package org.lessons.java.security;

public class PasswordGenerator {
    public static void main(String[] args) {

        // salvare in opportune variabili il nome, cognome, colore preferito e data di nascita di un utente
        // suddivisa in giorno, mese e anno (in numero)
        // Variabili
        String userName;
        String userSurname;
        String favoriteColor;
        int dayBirth;
        int monthBirth;
        int yearBirth;

        // generare (e stampare a video) una password concatenando nome, cognome,
        // colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere
        // assegno valori alle variabili
        userName = "Pinco";
        userSurname = "Pallo";
        favoriteColor = "Magenta";
        dayBirth = 12;
        monthBirth = 05;
        yearBirth = 1994;

        // stampo
        System.out.println("Nome: " + userName);
        System.out.println("Cognome: " + userSurname);
        System.out.println("Colore preferito: " + favoriteColor);
        //variabile data di nascita
        String dateBirth = dayBirth + "/" + monthBirth + "/" + yearBirth;
        System.out.println("Data di nascita: " + dateBirth);

        // genera password
        int sumDateBirth = dayBirth + monthBirth + yearBirth;
        String passwordGenerator = userName + "-" + userSurname + "-" + favoriteColor + "-" + sumDateBirth;
        System.out.println("Questa è la tua password: " + passwordGenerator);
    }
}
