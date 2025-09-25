package Spotify;
import java.util.Scanner;
import java.util.ArrayList;

//Test class
public class SpotifyTest {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Song> playliste = new ArrayList<>();


        //Velkomst besked
        // valg af navn og bruger type
        System.out.println("---Velkommen til HomeMade Spotify---");

        System.out.println("Hvad er dit navn?");
        String name = input.nextLine();

        System.out.println("Hvilken version bruger du? Free eller Premium? ");
        String brugerInput = input.nextLine();

        //laver en variabel som vi kalder bruger, da user osv allerede er i brug

        User bruger;

        if (brugerInput.equalsIgnoreCase("Free")){
            bruger = new FreeUser(name);
        }else if (brugerInput.equalsIgnoreCase("Premium")){
            bruger = new PremiumUser(name);
        } else{
            System.out.println("ugyldigt UserType - FreeUser er derfor anvendt som standard");
            bruger = new FreeUser(name);
        }

        userInput();

    }

        public static void userInput(){
        Scanner sc = new Scanner (System.in);
            //laver en boolean metode for at kunne vælge
            boolean menuOpen = true;
            while (menuOpen) {
                System.out.println("---MENU---");
                System.out.println("---Vælg et nummer---");
                System.out.println("1 - Tilføj Sang");
                System.out.println("2 - Fjern sang");
                System.out.println("3 - Vis alle sange");
                System.out.println("4 - søg efter Sang");
                System.out.println("5 - Rediger sang");
                System.out.println("6 - Afslut.");

                int Choice = sc.nextInt();
                if (Choice == 1) {
                    System.out.println("Adding Song.");
                    User.addSong();

                } else if (Choice == 2) {
                    System.out.println("Removing Song.");

                }else if(Choice == 3){
                    System.out.println("Displays all songs.");
                    //maybe use iterator
                } else if (Choice == 6) {
                    System.out.println("Closing program.");
                    menuOpen = false;
                } else {
                    System.out.println("Input not valid");
                }
            }
        }

    }


