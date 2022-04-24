public class Track extends Song {

    private String title;
    private String album;
    private String firstName;
    private String lastName;
    private Genre genre;

    /**
     * Constuctor for track
     * @param title String title
     * @param album String album
     * @param firstName String first name
     * @param lastName String last name
     * @param genre Enum genre
     */
    public Track(String title, String album, String firstName, String lastName, Genre genre) {
        this.title = title;
        this.album = album;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
    }

    /**
     *  method to get song title
     */
    @Override
    public String getTitle() {
        return title;
    }

    /**
     * method to get song album
     */
    @Override
    public String getAlbum() {
        return album;
    }

    /**
     * method to get song first name
     */
    @Override
    public String getFirstName() {
        return firstName;
    }

    /**
     * method to get song artist last name
     */
    @Override
    public String getLastName() {
        return lastName;
    }

    /**
     * method to get song genre as a string
     */
    @Override
    public String getGenre() {
        return genre.name();
    }

    /**
     * toString method
     */
    @Override
    public String toString() {
        return null;
    }
    
}
