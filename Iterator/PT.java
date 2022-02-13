import java.util.ArrayList;

public class PT {
    
    private String firstName;
    private String lastName;
    private String bio;
    private Exercise exercise[];
    private int numExercises;

    public PT (String firstName, String lastName, String bio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this. bio = bio;
        exercise = new Exercise[1];
     }

    public void addExercise(String title, ArrayList<String>muscleGroups, ArrayList<String>directions){
        Exercise temp = new Exercise(title, muscleGroups, directions);
        if(exercise[0] == null){
           exercise[0] = temp;
          numExercises =1;
           return;
       }
        
        exercise =  growArray(exercise);
        exercise[numExercises] = temp;
        numExercises= exercise.length;
        return;
        
    } 

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getBio() {
        return this.bio;
    }

    private Exercise[] growArray(Exercise exercise[]) {
        Exercise[] temp = new Exercise[numExercises+1];
        for(int i = 0; i < exercise.length; i++) {
            temp[i] = exercise[i];
          }
          return temp;

    }
    public ExerciseIterator createIterator() {

        return new ExerciseIterator(exercise);
    }

    public String toString() {
       return firstName+lastName+"\n"+bio+"\n";
    }
}
