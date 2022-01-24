package HomeWork02;

import java.util.HashMap;
/**
 * this is a interface to for others to have the update method.
 */
public interface Observer {
    public void update(HashMap<String,Integer> votes);
}