package HomeWork02;

import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Map;

import javax.management.MBeanParameterInfo;

public class PercentageDisplay implements Observer {

    private Subject poll;
    private HashMap<String, Integer> votes;
    private int numVotes;
   
    /**
     * creates the new percentageDisplay 
     * @param poll needs subject to be passed into it
     */
   public PercentageDisplay(Subject poll){
        this.poll = poll;
        HashMap<String, Integer> votes = new HashMap();
       this.numVotes= 0;
        poll.registerObserver(this);
    }
    /**
     * this updates the votes of the hash map.
     */
    @Override
    public void update(HashMap<String, Integer> votes) {
        this.votes =votes;
        for(Map.Entry mapElement : votes.entrySet())
        {
            String key =(String)mapElement.getKey();
            numVotes+=votes.get(key);
        }
       
        display();
        
    }
    /**
     * Displays the percentage of votes for each canidate.
     */
    private void display(){
        System.out.println();
        System.out.println("Current Percent of votes:");
     
        for(Map.Entry mapElement : votes.entrySet())
      {
          String key =(String)mapElement.getKey();
         //double percent1 = (votes.get(key)/numVotes)*100;
         double percent=votes.get(key);
         percent /=numVotes;
         percent*=100;
         Math.round(percent);
         System.out.println(key+":"+percent+"%");
      }

    }

    
}
