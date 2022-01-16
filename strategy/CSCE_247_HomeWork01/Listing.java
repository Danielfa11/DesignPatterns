package CSCE_247_HomeWork01;

import java.util.ArrayList;

public class Listing
{
private String title;
private ArrayList<String> items;
private SortBehavior sortBehavior;


public Listing(String title){ //ArrayList<String> items, SortBehavior SortBehavior){
    this.title = title;
    items = new ArrayList<String>();        // class parts 
    sortBehavior = new BubbleSort();
}

public String getTitle()
{
    return title;
}

public ArrayList<String> getSortedList()
{      
    sortBehavior.sort(items);   
    return items;
}

public ArrayList<String> getUnSortedList()      //just returns the list 
{
    return items;
}


public void add(String item)        // adds items to the list with the built in .add() for Arraylist -doesnt work yet-
{
    if(items.equals(null))
    {
        items.add(0, item);
    }else{
        items.add(item);
    }
}

public void remove(String item)     // removes items from the list with the .removes method of arraylists 
{
    items.remove(item);
}

public void setSortBehavior(SortBehavior sb)        // sets sort behavior
{
     sortBehavior = sb;   
}

}
