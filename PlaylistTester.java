/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @Devan
 * @01-11-2026
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here

        Playlist p = new Playlist();

        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        
        System.out.println("Adding songs to the Playlist...\n");
        p.addSong(new Song("Devan is cool", "Devan Truong", 3, 51));
        p.addSong(new Song("Devan is awesome", "Devan Truong", 2, 31));
        p.addSong(new Song("Devan is Cool but with a capital C", "Devan Truong", 3, 36));
        p.addSong(new Song("Devan is Awesome but with a capital A", "Devan Truong", 2, 41));
        p.addSong(new Song("Devan is sad?", "Devan Truong", 1,32));
        p.addSong(new Song("Devan is Sad? but with a capital S", "Devan Truong", 2,37));


        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly

        p.printAllSongs();

        System.out.println("\nLiking the songs in position 2, 3, 4....\n");
        //Once your songs are 'liked', this should be reflected in the next printout

        p.likeSong(2);
        p.likeSong(3);
        p.likeSong(5);

        System.out.println("Printing the songs...\n");
        p.printAllSongs();
        
        System.out.println("\nRemoving the song in position 1...\n");
        p.removeSong(1);

        System.out.println("Printing the songs...\n");
        p.printAllSongs();

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!

        p.printLikedSongs();

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds

        System.out.println(p.getTotalDurationString());

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call

        p.removeAllUnliked();

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before

        p.printAllSongs();
    }
}
