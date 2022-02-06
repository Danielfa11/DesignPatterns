public class SmallCar extends Car {
    /**
     * constructor for small car
     * @param make passed in string make
     * @param model passsed in string model
     * @athor Daniel Anderosn
     */
    public SmallCar(String make, String model){
        super(make, model);
    }
    /**
     * prints out making frame 
     * @athor Daniel Anderosn
     */
    protected void addFrame(){
        System.out.println("Adding a small frame");
    }
    /**
     * Adds the accessories to the array list 
     * @athor Daniel Anderosn
     */
    protected void addAccessories(){
        accessories.add(0, Accessory.FLOOR_MATTS);
        accessories.add(1, Accessory.PHONE_CHARGER);
    }
}
