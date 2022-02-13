import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise {
 private String title;
 private ArrayList<String> targetMuscles;
 private ArrayList<String> directions; 

 public Exercise(String title) {
     this.title =title;
 }

 public Exercise(String title, ArrayList<String> targetMuscles, ArrayList<String> directions) {
     this.title = title;
     this.targetMuscles = targetMuscles;
     this.directions=directions;
 }

 public void addTargetMuscle(String muscle) {
    targetMuscles.add(muscle);
 }

 public void removeTargetMuscle(String muscle) {

targetMuscles.remove(muscle);
 }

 public String toString() {
    
    String[] directonTemp = new String [directions.size()] ;
    String[] targetTemp = new String [targetMuscles.size()];

    for(int i = 0; i < directonTemp.length; i++) {
        directonTemp[i] =directions.get(i);
    }
    for(int i = 0; i < targetTemp.length; i++) {
        targetTemp[i] = targetMuscles.get(i);
    }
    int BiggerThan = -1;
    BiggerThan = directonTemp.length;
  

    String toReturn = "Muacles:";
    for(int i = 0; i < targetTemp.length; i++){
        toReturn = toReturn + targetTemp[i]+",";
    }
    toReturn += "\nExercises:\n";
    for(int i = 0; i<directonTemp.length; i++) {
        toReturn =toReturn+ "- " + directonTemp[i]+"\n";
    }
    return "\n ..."+title+"...\n"+toReturn;
 }

 
}
