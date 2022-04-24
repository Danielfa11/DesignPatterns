import java.util.HashMap;

public class JukeBox {
    
    private HashMap<String, Song> songs = new HashMap<>();
    private int currentSong;

    /**
     * Constructor for jukebox 
     */
    public JukeBox () {
        this.currentSong = 0;
    }

    /**
     * Adds song adds anothor song to the hashmap of songs
     * @param song a song to add
     */
    public void addSong(Song song) {
        songs.put(song.getTitle().toLowerCase(), song);
        currentSong++;
    }

    /**
     * Plays the song by printin out the name album, artics and genre
     * @param songName
     */
    public void play(String songName) {
       Song song = songs.get(songName.toLowerCase());
        System.out.println(songName+ "\nAlbum: " + song.getAlbum()
        + "\nBy: " + song.getFirstName() +" " + song.getLastName()
        + "\nGenre: " + song.getGenre()+"\n");
    }
}

