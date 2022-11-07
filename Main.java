import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 10 new song objects
        Song firstSong = new Song("Song 1", "Artist 1", 1);
        Song secondSong = new Song("Song 2", "Artist 2", 2);
        Song thirdSong = new Song("Song 3", "Artist 3", 3);
        Song fourthSong = new Song("Song 4", "Artist 4", 4);
        Song fifthSong = new Song("Song 5", "Artist 5", 5);
        Song sixSong = new Song("Song 6", "Artist 6", 6);
        Song seventhSong = new Song("Song 7", "Artist 7", 7);
        Song eigthSong = new Song("Song 8", "Artist 8", 8);
        Song ninthSong = new Song("Song 9", "Artist 9", 9);
        Song tenthSong = new Song("Song 10", "Artist 10", 10);

        // Songs object
        Songs songs = new Songs();

        // Add all songs to song list
        songs.addToList(firstSong);
        songs.addToList(secondSong);
        songs.addToList(thirdSong);
        songs.addToList(fourthSong);
        songs.addToList(fifthSong);
        songs.addToList(sixSong);
        songs.addToList(seventhSong);
        songs.addToList(eigthSong);
        songs.addToList(ninthSong);
        songs.addToList(tenthSong);
        songs.addToList(tenthSong);
        

        // Display all songs
        songs.displayAllSongsFromList();
        System.out.print("\n");

        // Remove last song from songs list
        songs.removeFromList(tenthSong);

        // Display all songs
        songs.displayAllSongsFromList();
        System.out.print("\n");

        // Display all songs played more than 5 times
        songs.displayAllSongsPlayedOverAGivenNumberOfTimes(5);

        System.out.println("\nIf you would like to see if a song is available type yes");

        // Song avaiable
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            System.out.println("\nWhat the title of the song you'd like to know if its available?");
            String songTitle = scanner.nextLine();
            if (songs.songAvailable(songTitle)) {
                System.out.println("\n" + songTitle + " is available");
            }
        } 

        System.out.println("\nIf you would like to search for a song by name type yes");

        // Display searched song details
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            System.out.println("\nWhat the title of the song you'd like to search for?");
            String songTitle = scanner.nextLine();
            songs.searchBySong(songTitle);
        } 

        System.out.println("\nIf you would like to search by artist  type yes");

        // Search by artist
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            System.out.println("\nWhat the artist you'd like to search for?");
            String songArtist = scanner.nextLine();
            songs.searchByArtist(songArtist);
        } 

        scanner.close();



    }
}
