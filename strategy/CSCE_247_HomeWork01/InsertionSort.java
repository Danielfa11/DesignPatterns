package CSCE_247_HomeWork01;

import java.util.ArrayList;

public class InsertionSort implements SortBehavior {

    //referanced http://faculty.edcc.edu/paul.bladek/CS142/insertionSort.htm
    public ArrayList<String> sort(ArrayList<String> data) {
        
        String temp;
        for(int i=1;i< data.length;i++)
        {
            temp=data[i];
            int j = 0;
            for(j = i; j>0;j--)
            {
                if(temp.compareTo(data[j-1])<0)
                {
                    data[j] = data[j-1];   
                }else
                { 
                break;
                }
                data[j]=temp;
            }
        }


        return data;
    }
    
}
