package CSCE_247_HomeWork01;

import java.util.ArrayList;

public class Listing
{
private String title;
private ArrayList<String> items;
private SortBehavior SortBehavior;

public Listing(String title, ArrayList<String> items, SortBehavior SortBehavior){
    this.title = title;
    this.items = items;
    this.SortBehavior = SortBehavior;
}

public String getTitle()
{
    return title;
}
public Listing(String title)
{
    System.out.println(title);
}

public void add(String item)
{
items.add(item);
}
public void remove(String item)
{
    items.remove(item);
}
public void setSortBehavior(SortBehavior SortBehavior)
{

}
}