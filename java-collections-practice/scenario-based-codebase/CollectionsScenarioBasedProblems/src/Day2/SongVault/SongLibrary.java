package Day2.SongVault;

import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class SongLibrary {

    private List<Song> songs = new ArrayList<>();

    // load songs from folder
    public void loadSongs(String folderPath) {

        try {
            Files.list(Paths.get(folderPath))
                    .filter(p -> p.toString().endsWith(".txt"))
                    .forEach(p -> {
                        Song s = SongReader.readSong(p);
                        if (s != null) {
                            songs.add(s);
                        }
                    });

        } catch (Exception e) {
            System.out.println("Error reading songs folder");
        }
    }

    // group by genre
    public Map<String, List<Song>> groupByGenre() {
        return songs.stream()
                .collect(Collectors.groupingBy(Song::getGenre));
    }

    // unique artists
    public Set<String> getUniqueArtists() {
        return songs.stream()
                .map(Song::getArtist)
                .collect(Collectors.toSet());
    }

    // filter by genre
    public List<Song> filterByGenre(String genre) {
        return songs.stream()
                .filter(s -> s.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }

    // sort by title
    public List<Song> sortByTitle() {
        return songs.stream()
                .sorted(Comparator.comparing(Song::getTitle))
                .collect(Collectors.toList());
    }
}

