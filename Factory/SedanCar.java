public class SedanCar extends Car {
   
   /**
    * construtor for sedan car
    * @param make passed in string make of car
    * @param model passed in string model of car
    * @athor Daniel Anderosn
    */
    public SedanCar(String make, String model){
        super(make, model);
    }
    /**
     * print the adding frame
     * @athor Daniel Anderosn
     */
    protected void addFrame(){
        System.out.println("Adding three part frame");
    }
    /**
     * adds the accessories for sedan 
     * @athor Daniel Anderosn
     */
    protected void addAccessories(){
        accessories.add(0, Accessory.FLOOR_MATTS);
        accessories.add(1, Accessory.PHONE_CHARGER);
        accessories.add(2, Accessory.BACK_UP_CAMERA);
        accessories.add(3, Accessory.EXTRA_CUP_HOLDERS);
        accessories.add(4, Accessory.HEATED_SEATS);
    }
}
