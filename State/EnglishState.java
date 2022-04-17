import java.util.ArrayList;

public class EnglishState implements State{

    private MusicBox box;

    public EnglishState(MusicBox box) {
        this.box = box;
    }

    /**
     * makes and calls the playsong method in music box for twinckel twincle
     */
    @Override
    public void pressStarButton() {
        ArrayList<String> Star = new ArrayList<>();
        Star.add(" Twinkle Twinkle Little Star");
        Star.add("Twinkle twinkle little star");
        Star.add("How I wonder what you are");
        Star.add("Up above the world so high");
        Star.add("Like a dimond in the sky");
        Star.add("Twinkle twinkle little star");
        Star.add("How I wonder what you are");
        box.playSong(Star.get(0), Star);

    }
    /**
     * make and passes happy and know it to be played in music box
     */
    @Override
    public void pressHappyButton() {
        ArrayList<String> Happy = new ArrayList<>();
        Happy.add("If you're happy and you know it");
        Happy.add("If you're happy and you know it clap your hands");
        Happy.add("If you're happy and you know it clap your hands");
        Happy.add("If you're happy and you know it");
        Happy.add("And you really want to show it");
        Happy.add("If you're happy and you know it clap your hands");
        box.playSong(Happy.get(0), Happy);
    }

    /**
     * inform use in english mode
     */
    @Override
    public void pressEnglishButton() {
        System.out.println("you are all ready in enghlish mode \n");
        
    }

    /**
     * switchs to french mode
     */
    @Override
    public void pressFrenchButton() {
        System.out.println("Switching to French \n");
        box.setState(box.getFrenchState());
    }

    /**
     * switches to Spanish mode
     */
    @Override
    public void pressSpanishButton() {
        System.out.println("Switching to Spanish \n");
        box.setState(box.getSpanishState());
        
    }


}