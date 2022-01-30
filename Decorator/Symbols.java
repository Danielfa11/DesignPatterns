public class Symbols extends PasswordDecorator {

    /**
     * the constructor for Symbol password
     * @param passwordBeginning needs a Password object passed in
     */
    public Symbols(Password passwordBeginning){
        super(passwordBeginning);
        this.password = passwordBeginning.getPassword();
        
    }
   
   /**
    * The get password method for Symbols 
    *@return Returns the String password with symbols
    */
    @Override
    public String getPassword() {
        
        String temp = this.password; 
        temp = temp.replaceAll("a", "@");
        temp = temp.replaceAll("b", "8");
        temp = temp.replaceAll("e", "3");
        temp = temp.replaceAll("g", "9");
        temp = temp.replaceAll("i", "!");
        temp = temp.replaceAll("o", "0");
        
        temp = temp.replace("s", "$");
        temp = temp.replaceAll("t", "7");
       // this.password = temp;
        return temp;
    }

    
}
