public class SongAdapter extends Song {

    private Tune tune;
    /**
     * constuctor for tune
     * @param tune pass in a tune of oldie
     */
    public SongAdapter (Tune tune) {
        this.tune = tune;
    }

    /**
     * method to get a string title
     */
    @Override
    public String getTitle() {
       String toReturn = tune.getDisplayTitle();
       String temp [] = toReturn.split("1", 2);
       toReturn = temp[1];
       return toReturn;
    }

    /**
     * method to get the string album
     */
    @Override
    public String getAlbum() {
       String toReturn = tune.getDisplayTitle();
       String temp [] = toReturn.split("1", 2);
       toReturn = temp[0];
       return toReturn;
    }

    @Override
    /**
    * Method to get oldie first name
     */
    public String getFirstName() {
       String toReturn = tune.getArtistName();
       String temp [] = toReturn.split(" ", 2);
       toReturn = temp[0];
       return toReturn;
        
    }

    /**
     * method to get oldie last name
     */
    @Override
    public String getLastName() {
        String toReturn = tune.getArtistName();
        String temp [] = toReturn.split(" ", 2);
        toReturn = temp[1];
        return toReturn;
    }

    /**
     * method to get oldie genre
     */
    @Override
    public String getGenre() {
        return tune.getCategory();
    }

    /**
     * method to get oldie toString
     */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
