package Spotify;

import java.util.ArrayList;
//Test class
public class SpotifyTest {
    public static void main (String[] args){
        ArrayList<Song> songs = new ArrayList<>();
        welcome();
        PremiumUser.downloadSong();
    }
    //starts the program
    public static void welcome(){
        System.out.println("Welcome to the homemade Spotify. Choose what to do:");
        // make different options for what to do.
    }
    //can be called to display the songs
    /* public static void displaySongs(){

    }*/
}
