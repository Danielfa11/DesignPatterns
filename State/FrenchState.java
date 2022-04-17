import java.util.ArrayList;

public class FrenchState implements State {

    private MusicBox box;

    public FrenchState(MusicBox box) {
        this.box = box;
    }

    /**
     * makes and passes spanish twinckes to music box
     */
    @Override
    public void pressStarButton() {
        ArrayList<String> Star = new ArrayList<>();
        Star.add(" Petite étoile scintillante scintillante");
        Star.add("Petite étoile scintillante scintillanter");
        Star.add("Comment je me demande ce que vous êtes");
        Star.add("Au-dessus du monde si haut");
        Star.add("Comme un diamant dans le ciel");
        Star.add("Petite étoile scintillante scintillante");
        Star.add("Comment je me demande ce que vous êtes");
        box.playSong(Star.get(0), Star);
        
    }

    /**
     * makes and passes spanish happy to music box to be played
     */
    @Override
    public void pressHappyButton() {
        ArrayList<String> Happy = new ArrayList<>();
        Happy.add("Si tu es content et que tu le sais");
        Happy.add("Si tu es heureux et que tu le sais, tape dans tes mains");
        Happy.add("Si tu es heureux et que tu le sais, tape dans tes mains");
        Happy.add("Si tu es content et que tu le sais");
        Happy.add("Et tu veux vraiment le montrer");
        Happy.add("Si tu es heureux et que tu le sais, tape dans tes mains");
        box.playSong(Happy.get(0), Happy);
        
    }

    /**
     * switchs to enlish mode
     */
    @Override
    public void pressEnglishButton() {
        System.out.println("Switching to english \n");
        box.setState(box.getEnglishState());;
        
    }
/**
 * informs that already in french mode
 */
    @Override
    public void pressFrenchButton() {
        System.out.println("All ready in French State \n");
        
    }

    /**
     * switches to spanish mode
     */
    @Override
    public void pressSpanishButton() {
      System.out.println("Switching to Spanish \n");
        box.setState(box.getSpanishState());
        
    }
    
}
