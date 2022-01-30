import java.util.Random;

public class SpecialChars extends PasswordDecorator {

    /**
     * the constructor for Special Chars
     * @param passwordBeginning needs to be passed a password
     */
    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
        this.password=passwordBeginning.getPassword();
    }

    /**
     * the getpassword method for special chars
     * @return returns a modiffied string password
     */
    @Override
    public String getPassword() {
        String toReturn = "";
        char [] temp = this.password.toCharArray();
        char [] SpecialChars = ("*!%+.{}").toCharArray();
        Random rand = new Random();
        for( int i = 0; i< temp.length; i++){
            int upperBound = 10;
            int thirdTime = rand.nextInt(upperBound);
            int RandomChar = rand.nextInt(SpecialChars.length-1);
            toReturn+=temp[i];
            if(thirdTime == 0 || thirdTime == 1 || thirdTime == 2 )
            {
            toReturn+=SpecialChars[RandomChar];
            }
            
        }


        return toReturn;
    }
    
}
