public abstract class PasswordDecorator extends Password {
    protected Password passwordBeginning;

    /**
     * Parent class construtor for password decorator
     * @param passwordBeginning the type password needs to be passed in
     */
    public PasswordDecorator(Password passwordBeginning){
        this.passwordBeginning = passwordBeginning;
    }

    /**
     * returns the string password
     * @return returns the string of the password
     */
    public String getPassword(){
        return passwordBeginning.getPassword();
    }
    
}
