import java.util.ArrayList;
import java.util.List;
/*This CW1 Assingment of Progarming concept */
public class Songs {
    List<Song> songsList = new ArrayList<>();

    /**
     * Adds a song to the songs list
     * @param song - The song to add
     */
    void addToList(Song song) {
        // Prevent duplicates being added
        if (!songsList.contains(song)) {
            songsList.add(song);
        }
    }

    /**
     * Removes a song from the songs list
     * @param song - The song to be removed
     */
    void removeFromList(Song song) {
        songsList.remove(song);
    }

    /**
     * Checks if the song is available
     * @param songTitle - The title to search for
     * @return true or false depending on wether the song is available
     */
    boolean songAvailable(String songTitle) {
        for (Song song: songsList) {
            if (song.getTitle().equals(songTitle)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Displays all songs with a particular name
     * @param songTitle - The title of the song
     */
    void searchBySong(String songTitle){
        for (Song song: songsList) {
            if (song.getTitle().equals(songTitle)) {
                System.out.println("Title: " + song.getTitle());
                System.out.println("Artist: " + song.getArtist());
                System.out.println("Number Of Times Played: " + song.getNumberOfTimesPlayed());
            }
        } 
    }

    /**
     * Displays all songs by a particular artists
     * @param artist - The name of the artist 
     */
    void searchByArtist(String artist) {
        for (Song song: songsList) {
            if (song.getArtist().equals(artist)) {
                System.out.println("Title: " + song.getTitle());
                System.out.println("Artist: " + song.getArtist());
                System.out.println("Number Of Times Played: " + song.getNumberOfTimesPlayed());
            }
        }
        
    }
    
    /**
     * Displays all songs
     */
    void displayAllSongsFromList() {
        for (Song song: songsList) {
            System.out.println("Title: " + song.getTitle());
            System.out.println("Artist: " + song.getArtist());
            System.out.println("Number Of Times Played: " + song.getNumberOfTimesPlayed());
        }
    }

    /**
     * Displays all songs that have been played more than a certain number of times
     * @param timesPlayed - The number of times a song a song has been played (You're looking for anything greater than this number) 
     */
    void displayAllSongsPlayedOverAGivenNumberOfTimes(int timesPlayed) {
        for (Song song : songsList) {
            if (song.getNumberOfTimesPlayed() > timesPlayed) {
                System.out.println("Title: " + song.getTitle());
                System.out.println("Artist: " + song.getArtist());
                System.out.println("Number Of Times Played: " + song.getNumberOfTimesPlayed());
            }
        }
    }

}
