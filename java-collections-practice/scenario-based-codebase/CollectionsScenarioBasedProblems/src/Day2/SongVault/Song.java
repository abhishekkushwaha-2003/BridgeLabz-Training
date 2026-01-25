package Day2.SongVault;

public class Song extends Media<String> {

    private String genre;

    public Song(String title, String artist, String duration, String genre) {
        super(title, artist, duration);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return title + " | " + artist + " | " + duration + " | " + genre;
    }
}
