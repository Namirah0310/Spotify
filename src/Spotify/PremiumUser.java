package Spotify;

public class PremiumUser extends User{
    public PremiumUser(String name ){ super (name); }

    public static void downloadSong(){
        Song song = new Song("Happy",Genre.POP);
        System.out.println ("Sangen downloades..." + song.getTitle());
    }
}
