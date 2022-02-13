import java.util.Iterator;
public class ExerciseIterator {
    private Exercise [] exercises;
    private int position = 0;
    
    public ExerciseIterator(Exercise [] exercises) {
        this.exercises = exercises;

    }

    public boolean hasNext() {
       if(position >= exercises.length || exercises[position] == null) {
           return false;
       }else {
        return true;
        }
    }
    public Exercise next() {
       Exercise exercise = exercises[position];
       position+=1;
       return exercise;
    }
}
