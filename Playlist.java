import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */

    private ArrayList<Song> songs;


     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */

    public Playlist() {
        songs = new ArrayList<Song>();
    }
      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */

    public void addSong(Song s) {
        songs.add(s);
    }

    // Liking a song (by position/index)
    public void likeSong(int index) {
        if (index >= 0 && index < songs.size()) {
            songs.get(index).like();
        }
    }

    // Removing a song (by position/index)
    public void removeSong(int index) {
        if (index >= 0 && index < songs.size()) {
            songs.remove(index);
        }
    }

    // Examining all songs (prints)
    public void printAllSongs() {
        for (Song s : songs) {
            System.out.println(s);
        }
    }

    // Examining a sublist of liked songs (prints)
    public void printLikedSongs() {
        for (Song s : songs) {
            if (s.isLiked()) {
                System.out.println(s);
            }
        }
    }

    // Determining total duration (returns formatted string m:ss)
    public String getTotalDurationString() {
        int totalSeconds = 0;
        for (Song s : songs) {
            totalSeconds += s.getDurationSeconds();
        }

        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        return minutes + ":" + (seconds < 10 ? "0" + seconds : seconds);
    }

    public void removeAllUnliked() {
        // IMPORTANT: iterate backwards to avoid skipping elements
        for (int i = songs.size() - 1; i >= 0; i--) {
            if (!songs.get(i).isLiked()) {
                songs.remove(i);
            }
        }
    }
}
