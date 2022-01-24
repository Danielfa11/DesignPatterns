package HomeWork02;

/**
 * this is a interface used to forece others to 
 * implemt certian atributes. 
 * 
 */
public interface Subject{
        public void registerObserver (Observer observer);
        public void removeObserver(Observer observer);
        public void notifyObservers();
}