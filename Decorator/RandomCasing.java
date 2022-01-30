import java.util.Random;

public class RandomCasing extends PasswordDecorator {

    /**
     * the constructor for the passwords in random casing
     * @param passwordBeginning needs a password to be passed in 
     */
    public RandomCasing(Password passwordBeginning) {
        super(passwordBeginning);
        this.password = passwordBeginning.getPassword();
    }

    /**
     * the get password method for Random Casing
     * @return Returns a string password that is modified
     */
    @Override
    public String getPassword() {
        String toReturn = "";
        char [] temp = this.password.toCharArray(); 
        Random rand = new Random();
        for( int i = 0; i< temp.length; i++){
            int upperBound = 2;
            int halfTime = rand.nextInt(upperBound);
            if(halfTime == 0)
            {
                temp[i] = Character.toUpperCase(temp[i]);
            }
            toReturn+=temp[i];
        }

        return toReturn;
    }

    
    
}
