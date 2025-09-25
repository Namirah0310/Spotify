package Spotify;

public class PremiumUser extends User{
    public PremiumUser(String name ){ super (name); }

    public void downloadSong(Song song){
        System.out.println ("Sangen downloades..." + song.getTitle());
    }
}
