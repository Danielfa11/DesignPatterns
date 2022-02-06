import java.util.ArrayList;

public abstract class Car {
    
   
    private String make;
    private String model;
    protected ArrayList<Accessory> accessories;
    /**
     * construtor of the car class and calls the method assemble
     * @param make pass in string make of car
     * @param model pass in string model of car
     * @athor Daniel Anderosn
     */
    public Car(String make, String model){
        this.make = make;
        this.model =model;
       accessories = new ArrayList<Accessory>();
        assemble();
    }
    /**
     * method to call all add methida and display method 
     * @athor Daniel Anderosn
     */
    public void assemble(){
       System.out.println("Creating a " +make +" "+ model);
        addFrame();
        addWheels();
        addEngine();
        addWindows();
        addAccessories();
        displayAccessories();
    }

    /**
     * method to force child classes to impent addframe method
     * @athor Daniel Anderosn
     */
    abstract protected void addFrame();
    /**
     * print out that wheels are being added
     * @athor Daniel Anderosn
     */
    protected void addWheels(){
        System.out.println("Adding the wheels");
    }
    /**
     * prints out that an engine is added
     * @athor Daniel Anderosn
     */
    protected void addEngine() {
        System.out.println("Adding standard engine");
    }
    /**
     * prints out that windows are added
     * @athor Daniel Anderosn
     */
    protected void addWindows(){
        System.out.println("Adding the Windows");
    }
    /**
     * force child class to inplement method
     * @athor Daniel Anderosn
     */
   abstract protected void addAccessories();

   /**
    * prints out the accessories
    * @athor Daniel Anderosn
    */
    protected void displayAccessories(){
        System.out.println("Accessories: ");
        for(int i = 0; i < accessories.size(); ++i){
            System.out.println("- "+accessories.get(i));
        }

    }

    /**
     * set options for the accessories
     * @athor Daniel Anderosn
     */
    enum  Accessory{
        SPORTS_SEATS,
       WINDOW_TINT,
       HEATED_SEATS,
       HIGH_END_SOUND,
       TRUNK_ORGANIZER,
       BACK_UP_CAMERA,
       FLOOR_MATTS,
       BLUE_TOOTH,
       EXTRA_CUP_HOLDERS,
       PHONE_CHARGER;
    }
}
