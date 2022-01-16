package CSCE_247_HomeWork01;

import java.util.ArrayList;

public class BubbleSort implements SortBehavior {

    //referancedhttps://stackoverflow.com/questions/30951974/basic-bubble-sort-with-arraylist-in-java/54285692
    public ArrayList<String> sort(ArrayList<String> data) {
        String temp;
        if(data.size()>1)
        {
            for(int i= 0;i<data.size()-1;i++)
            {
                for(int j =0; j<data.size()-i-1;j++)
                {
                    if(data.get(j).compareTo(data.get(j+1))>0)
                    {
                        temp = data.get(j+1);
                        data.set(j+1,data.get(j));
                        data.set(j,temp);
                    }
                }
            }
        }
        return data;
    }
    
}
