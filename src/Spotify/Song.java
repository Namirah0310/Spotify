package Spotify;

public class Song {
    private String title;
    private Genre genre;

    //Constructor
    public Song(String tilte, Genre genre){
        this.title = title;
        this.genre = genre;
    }
    //Getters
    public String getTitle(){
        return title;
    }
    public Genre getGenre() {
        return genre;
    }
    //Setters
    public void setTitle(String title){this.title = title; }
    public void setGenre(Genre genre){this.genre = genre; }

    //toString method
    @Override
    public String toString(){
        return title + "---" + genre;
    }
}
