import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
public class MusicBox {
  private State englishState;
  private State frenchState;
  private State spanishState;
  private State State;
  
  public MusicBox(){
    englishState = new EnglishState(this);
    frenchState = new FrenchState(this);
    spanishState = new Spanish(this);
    State = englishState;
  }

  /**
   * goes to the make star method depending on state
   */
  public void pressStarButton() {
    State.pressStarButton();
  }

  /**
   * goes to happy method depending on diffent stae
   */
  public void pressHappyButton() {
    State.pressHappyButton();
  }

  /**
   * checks the state and sees if it needs to switch from english
   */
  public void pressEnglishButton() {
    State.pressEnglishButton();
  }

  /**
   * checks the state and sees if it needs to switch from French
   */
  public void pressFrenchButton () {
    State.pressFrenchButton();
  }

  /**
   * checks the state and sees if it needs to switch from Spanish
   */
  public void pressSpanishButton() {
    State.pressSpanishButton();
  }

  /**
   * changes the current language state of musice box
   * @param state a state of either spanish, english or french is passed in  
   */
  public void setState(State state) {
    this.State = state;
  }

  /**
   * give the state of enlish
   * @return the english state instance
   */
  public State getEnglishState() {
      return englishState;
  }

  /**
   * gives the french state 
   * @return the French state instace 
   */
  public State getFrenchState() {
      return frenchState;
  }

  /**
   * returns the spanish state instace 
   * @return the spanush State instance
   */
  public State getSpanishState() {
      return spanishState;
  }

  /**
   * Plays the song that is passed into it from the diffent states
   * @param songName the name of the song as a string
   * @param lyrics the words that are in the song
   */
  public void playSong(String songName, ArrayList<String> lyrics){
      System.out.println("\nPlaying: "+ songName);
    for(int i = 1; i < lyrics.size(); ++i) {
        System.out.println(lyrics.get(i));
        try
        {
            TimeUnit.SECONDS.sleep(1);
        } catch(InterruptedException ex) {
            System.out.print("waitning time error");
        }
    }
    System.out.println();
  }


  
}
