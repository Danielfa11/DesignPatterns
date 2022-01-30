import java.util.Random;
public class EasyPassword extends Password {

    /**
     * This method sets the easy password to be what is entered
     * @param phrase
     */
    public EasyPassword(String phrase) {
        this.password = phrase;

    }
    /** 
     * EasyPassword get password method
     * @return a string 
     */
    public String getPassword() {
        String tempString = this.password;
        
        tempString =tempString.replaceAll(" ","");
        Random rand = new Random();
        int upperBound = 101;
        int RandomNum = rand.nextInt(upperBound);
        tempString+=RandomNum;
        this.password=tempString;
        return this.password;
    }
}

