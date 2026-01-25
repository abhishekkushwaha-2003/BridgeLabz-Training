package Day2.SongVault;

public class Media<T> {

    protected T title;
    protected String artist;
    protected String duration;

    public Media(T title, String artist, String duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public T getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }
}
