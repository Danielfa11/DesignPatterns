public class CarFactory {
   /**
    * the factory for the car construction 
    * @param type pass in type string small, sedan, or luxurt
    * @param make string make of the car
    * @param model string model of the car
    * @return returns a type of car
    * @athor Daniel Anderosn
    */
    public static Car createCar(String type, String make, String model){

        if(type.equalsIgnoreCase("SMALL")){
            return new SmallCar(make, model);
        }else if(type.equalsIgnoreCase("SEDAN")){
            return new SedanCar(make, model);
        }else if(type.equalsIgnoreCase("LUXURY")){
            return new LuxuryCar(make, model);
        }
        return null;
    }

    /**
     * sets three type of car options 
     * @athor Daniel Anderosn
     */
    enum CarType {
        SMALL,
        SEDAN,
        LUXURY,

    }
}
