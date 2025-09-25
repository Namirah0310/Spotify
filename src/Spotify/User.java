package Spotify;

import java.util.ArrayList;

public class User {
    protected String name;

    public User(String name){
        this.name = name;
    }

    //tilføjer sangene
    public void addSong(ArrayList<Song> playliste, Song song){
        playliste.add(song);
        System.out.println("Sangen "+ song.getTitle() + "Er nu blevet tilføjet.");
    }

    //Fjerner Sangene
    public boolean removeSong(ArrayList<Song> playliste, String titel){
        for (Song s : playliste){
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
