package studentsProject;

import java.util.HashMap;
import java.util.Map;

public class GradeBook extends TestResults {
    public static void main(String[] args) {

    }

    public static void studentsGrades(){
        Map <String,Integer> originalGrades = getOriginalGrades();
        Map <String,Integer> makeUpGrades = getMakeUpGrades();
        Map <String,Integer> finalGrades = new HashMap<>();

        for (var grade:
                makeUpGrades.entrySet()) {
        }
    }
}
