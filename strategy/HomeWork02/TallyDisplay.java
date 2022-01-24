package HomeWork02;

import java.util.HashMap;
import java.util.Map;


public class TallyDisplay implements Observer{
    private Subject poll;
    HashMap<String,Integer> votes;
   
    /**
     * this iniilzes the poll and regerster TallyDisplay as an observer.
     * @param poll needs a type of subject passed into it.
     */
    public TallyDisplay(Subject poll){
        this.poll = poll;
        poll.registerObserver(this);
        HashMap<String, Integer> votes = new HashMap();
        
    }
    
    /**
     * the update method for TattyDisplay 
     */
    public void update(HashMap<String, Integer> votes) {
        
        this.votes = votes;
        display();
    }

    /**
     * prints out the tatty 
     */
    private void display(){
        System.out.println("\nCurrent Tallies:");
       
        for(Map.Entry mapElement : votes.entrySet())
      {
          String key =(String)mapElement.getKey();
         System.out.println(key+":"+votes.get(key));
      }
    }

   
}
