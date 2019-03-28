package lecture;

import java.util.ArrayList;

public class Student {
   private String firstName;
    private String lastName;
    private Double[] testScores;
    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores= testScores;
    }

  public int getNumberOfExamsTaken(){
      return testScores.length;


  }
  public Double[] getExamScores(){
  return testScores;

  }
}
