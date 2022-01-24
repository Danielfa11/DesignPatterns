package HomeWork02;
import java.util.HashMap;

import java.util.ArrayList;
    /**
     * intialy sets up the 
     */
public class StudentGovPoll implements Subject{
      private ArrayList<Observer> observers;
      private HashMap<String, Integer> votes = new HashMap<String,Integer>();
      private String school;
      private int numUpdates;

      /**
       * Initilizes and creates the values of StudentGovPoll
       * @param school Is a string value
       */
      public StudentGovPoll(String school){
          observers = new ArrayList<Observer>();
          //HashMap<String, Integer> votes;
          this.school= school;
      }

      /**
       * adds an observer 
       * @param observer need a oberser to be passed in
       */
      public void registerObserver(Observer observer){
        observers.add(observer);
      }

      /**
       * removes and observer 
       * @param observer needs and observer to be passed in 
       */
      public void removeObserver(Observer observer){
          observers.remove(observer);
      }

      /**
       * this updates all of the observers
       */
      public void notifyObservers(){
          for (Observer observer : observers){
              observer.update(votes);
          }
      }

      /**
       * this adds a canidate to the hash map
       * @param president
       */
      public void addCandidate(String president)
      {
        votes.put(president, -1);
      }

      /**
       * this updates the vote count of the presidents
       * @param president
       * @param num
       */
      public void enterVotes(String president, int num){
           int temp =votes.get(president);
           if(temp == -1){
               temp = num;
               votes.put(president, temp);
               numUpdates+=1;
               return;
           }

           temp += num;
           votes.put(president, temp);
          numUpdates+=1;
          if(numUpdates%4 == 0){
            notifyObservers();
          }
           return;
      }

      /**
       * this gives the name of the school 
       * @return
       */
      public String getSchool(){
          return school;
      }
      /**
       * 
       */
   
}
