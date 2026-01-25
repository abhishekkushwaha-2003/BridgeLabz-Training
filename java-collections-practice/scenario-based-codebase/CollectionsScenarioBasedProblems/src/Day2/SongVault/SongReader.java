package Day2.SongVault;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SongReader {

    private static final Pattern TITLE =
            Pattern.compile("Title:\\s*(.*)");
    private static final Pattern ARTIST =
            Pattern.compile("Artist:\\s*(.*)");
    private static final Pattern DURATION =
            Pattern.compile("Duration:\\s*(.*)");
    private static final Pattern GENRE =
            Pattern.compile("Genre:\\s*(.*)");

    public static Song readSong(Path path) {

        String title = null, artist = null, duration = null, genre = null;

        try (BufferedReader br =
                     new BufferedReader(new FileReader(path.toFile()))) {

            String line;
            while ((line = br.readLine()) != null) {

                Matcher m;

                m = TITLE.matcher(line);
                if (m.matches()) title = m.group(1);

                m = ARTIST.matcher(line);
                if (m.matches()) artist = m.group(1);

                m = DURATION.matcher(line);
                if (m.matches()) duration = m.group(1);

                m = GENRE.matcher(line);
                if (m.matches()) genre = m.group(1);
            }

        } catch (Exception e) {
            return null;
        }

        if (title == null || artist == null || genre == null) {
            return null; 
        }

        return new Song(title, artist, duration, genre);
    }
}
