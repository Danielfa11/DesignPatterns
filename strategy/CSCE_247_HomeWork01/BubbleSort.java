package CSCE_247_HomeWork01;

import java.util.ArrayList;

public class BubbleSort implements SortBehavior {

    //referanced https://stackoverflow.com/questions/8121176/java-sort-arraylist-using-bubblesort
    public ArrayList<String> sort(ArrayList<String> data) {
        String temp;
        for(int i=0;i< data.size();i++)
        {
            for (int j =0; j<data.size()-1;j++)
            {
                if(data.get(j).compareTo(data.get(j+1))>0)
                {
                    temp=data.get(j);
                    data.set(i,data.get(i+1));
                    data.set(i+1, temp);
                }
            }
        }
        return data;
    }
    
}
