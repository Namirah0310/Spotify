package Spotify;

import java.util.ArrayList;

public class User {
    protected String name;

    public User(String name){
        this.name = name;
    }

    //tilføjer sangene
    public static void addSong(){
        ArrayList<Song> playliste = new ArrayList<>();
        Song song = new Song("Happy",Genre.JAZZ);
        playliste.add(song);
        System.out.println("Sangen "+ playliste.get(0) + " Er nu blevet tilføjet.");
    }

    //Fjerner Sangene 
    public static boolean removeSong(ArrayList<Song> playliste, String titel){
        for (Song s : playliste) {
            if (s.getTitle().equalsIgnoreCase(titel)){
                playliste.remove(s);
                System.out.println("Sangen"+ titel + "Er nu fjernet");
                return true;
            }
        }
        System.out.println("sangen " + titel + "Findes ikke i playlisten");
        return false;
    }


}
