public class Song{

    // Fields
    private String title;
    private String artist;
    private int numberOfTimesPlayed;

    /**
     * Constructor for creating a new song object
     * @param title - The title of the song
     * @param artist - The artist who made the song
     * @param numberOfTimesPlayed - The number of times the song has been played
     */
    public Song(String title, String artist, int numberOfTimesPlayed) {
        this.title = title;
        this.artist = artist;
        this.numberOfTimesPlayed = numberOfTimesPlayed;
    }

    /**
     * Copy constructor for creating a new song object
     * @param song - The new song object
     */
    public Song(Song song) {
        title = song.title;
        artist = song.artist;
        numberOfTimesPlayed = song.numberOfTimesPlayed;
    }

    /**
     * Getter to get a songs title
     * @return - The title of a song
     */
    String getTitle() {
        return title;
    }

    /**
     * Setter to set a song title
     * A potential usecase for this method would be if a song changed title or the intial title was entered incorrectly
     * @param title - The title of the song
     */
    void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter to get a songs artist
     * @return - The artist for a song
     */
    String getArtist() {
        return artist;
    }

    /**
     * Setter to set the artist
     * A usecase for this method would be if you need to update the artist name on a old song as they have changed their name
     * @param artist - The name of the artist
     */
    void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Getter to get the number of times a song has been played
     * @return - The number of times a song has been played
     */
    int getNumberOfTimesPlayed(){
        return numberOfTimesPlayed;
    }

    /**
     * Setter to set the number of times a song has been played 
     * A potential usecase for this method would be to increase the number of times a song had been played
     * @param numberOfTimesPlayed - The number of times
     */
    void setNumberOfTimesPlayed(int numberOfTimesPlayed) {
        this.numberOfTimesPlayed = numberOfTimesPlayed;
    }

}