import java.util.ArrayList;

public class Spanish implements State {

    private MusicBox box;

    public Spanish(MusicBox box) {
        this.box = box;
    }

    /**
     * makes the spanish version of Twinckle star and calls playsong
     */
    @Override
    public void pressStarButton() {
        ArrayList<String> Star = new ArrayList<>();
        Star.add(" Brilla brilla pequeña estrella");
        Star.add("Brilla centelleante pequeña estrella");
        Star.add("Cómo me pregunto lo que eres");
        Star.add("Por encima del mundo tan arriba");
        Star.add("Como una dimond en el cielo");
        Star.add("brilla brilla pequeña estrella");
        Star.add("Cómo me pregunto lo que eres");
        box.playSong(Star.get(0), Star);
        
    }

    /**
     * makes the spanish version of happy and calls playsong
     */
    @Override
    public void pressHappyButton() {
        ArrayList<String> Happy = new ArrayList<>();
        Happy.add("si estás contento y lo sabes");
        Happy.add("Si eres feliz y lo sabes aplaude");
        Happy.add("Si eres feliz y lo sabes aplaude");
        Happy.add("si estás contento y lo sabes");
        Happy.add("Y realmente quieres mostrarlo");
        Happy.add("Si eres feliz y lo sabes aplaude");
        box.playSong(Happy.get(0), Happy);
        
    }

    /**
     * checks to switch to english
     */
    @Override
    public void pressEnglishButton() {
       System.out.println("Switching to English \n");
        box.setState(box.getEnglishState());
        
    }

    /**
     * Switch music box to french
     */
    @Override
    public void pressFrenchButton() {
        System.out.println("Switching to French \n");
        box.setState(box.getFrenchState());
        
    }

    /**
     * prints out already in spanish
     */
    @Override
    public void pressSpanishButton() {
        System.out.println("All readly in Spanish state \n");
        
    }
    
}
