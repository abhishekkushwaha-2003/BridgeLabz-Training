package Day2.SongVault;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class SongVaultMain {
    public static void main(String[] args) {

        SongLibrary library = new SongLibrary();
        library.loadSongs("songs");

        System.out.println("\n--- All Songs (Sorted by Title) ---");
        for (Song s : library.sortByTitle()) {
            System.out.println(s);
        }

        System.out.println("\n--- Songs Grouped by Genre ---");
        Map<String, List<Song>> byGenre = library.groupByGenre();
        byGenre.forEach((g, list) -> {
            System.out.println(g + ": " + list.size());
        });

        System.out.println("\n--- Unique Artists ---");
        Set<String> artists = library.getUniqueArtists();
        artists.forEach(System.out::println);

        System.out.println("\n--- Rock Songs ---");
        library.filterByGenre("Rock")
                .forEach(System.out::println);
    }
}
