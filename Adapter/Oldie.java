public class Oldie implements Tune {

    private String artistName;
    private String songTitle;
    private String recordTitle;
    private String category;

    /**
     * Constuctor for oldie
     * @param artistName String name of artist
     * @param songTitle String name of song
     * @param recordTitle String name of Record
     * @param category String Category
     */
    public Oldie(String artistName, String songTitle, String recordTitle, String category) {
        this.artistName = artistName;
        this.songTitle = songTitle;
        this.recordTitle = recordTitle;
        this.category = category;
    }

    /**
     * method to get name of artist
     */
    @Override
    public String getArtistName() {
        return artistName;
    }

    /**
     * method to get tilte of record and song
     */
    @Override
    public String getDisplayTitle() {
        return recordTitle + "1" + songTitle;
    }

    /**
     * method to get name of category
     */
    @Override
    public String getCategory() {
        return category;
    }
    
}
