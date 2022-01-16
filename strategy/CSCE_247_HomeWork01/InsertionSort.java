package CSCE_247_HomeWork01;


import java.util.ArrayList;

public class InsertionSort implements SortBehavior {

    //referanced https://stackabuse.com/insertion-sort-in-java/
    public ArrayList<String> sort(ArrayList<String> data) {
       for(int i =1;i<data.size();i++)
       {
           String current=data.get(i);
           int j= i-1;
           while(j>-1 &&(data.get(j).compareTo(current)>0)){
               data.set(j+1, data.get(j));
               j--;
           }
           data.set(j+1, current);
       }

//Change this to ArrayList sort
        return data;
    }
    
}

