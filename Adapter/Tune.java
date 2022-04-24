public interface Tune {
    /**
     * intrface method for getArtist name
     * @return String "first last"
     */
    public String getArtistName();
    /**
     * method to get displaytitle 
     * @return String "recordTitle1Songtitle" where the 1 is use to split the string
     *      */
    public String getDisplayTitle();
    /**
     * returns the category of the music/genre
     * @return
     */
    public String getCategory();
}
