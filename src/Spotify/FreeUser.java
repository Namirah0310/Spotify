package Spotify;

public class FreeUser extends User {
    public FreeUser(String name) {
        super(name);
    }


    public void adsOn() {
        System.out.println("Reklame!!! Undgå disse reklamer, og musik stop, ved køb af Premium");
    }
}