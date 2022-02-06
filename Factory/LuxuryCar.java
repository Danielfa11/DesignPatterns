
public class LuxuryCar extends Car {
    /**
     * the constructor for luxury car
     * @param make passed in string for make
     * @param model passed in string for the model
     * @athor Daniel Anderosn
     */
    public LuxuryCar(String make, String model){
        super(make, model);
    }
/**
 * prints out the frame
 * @athor Daniel Anderosn
 */
    protected void addFrame(){
        System.out.println("Adding a beautiful frame");
    }

    /**
     * prints out the engine
     * @athor Daniel Anderosn
     */
    @Override
    protected void addEngine(){
        System.out.println("Adding supped up Engine");
    }
/**
 * adds the accessories for luxury car
 * @athor Daniel Anderosn
 */
    protected void addAccessories(){
        accessories.add(0, Accessory.FLOOR_MATTS);
        accessories.add(1, Accessory.PHONE_CHARGER);
        accessories.add(2, Accessory.BACK_UP_CAMERA);
        accessories.add(3, Accessory.EXTRA_CUP_HOLDERS);
        accessories.add(4, Accessory.HEATED_SEATS);
        accessories.add(5, Accessory.SPORTS_SEATS);
        accessories.add(6, Accessory.WINDOW_TINT);
        accessories.add(7, Accessory.HIGH_END_SOUND);
        accessories.add(8, Accessory.TRUNK_ORGANIZER);
        accessories.add(9, Accessory.BLUE_TOOTH);
        
    }   
}
