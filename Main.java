import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Patient[] patients = {
    new Patient("29284", "Pie", 182.8, 88.5),
    new Patient("32567", "Pat", 161.5, 46.2)
    };

    System.out.println("============ Patient Data =============");
    for (Patient p : patients) {
      System.out.println(p);
    }
    System.out.println("=======================================");
    Scanner inputId = new Scanner(System.in);
    System.out.print("Enter Patient Id: ");
    String pid = inputId.nextLine();

    Patient selectedPatient = null;
    for (Patient p : patients) {
      if (p.getPatientId().equals(pid)) {
        selectedPatient = p;
        break;
      }
    }

    if (selectedPatient != null) {
        Double bmi = selectedPatient.calculateBMI();
        String healthCategory = selectedPatient.getHealthCategory();
        System.out.printf("Patient BMI is: %.1f\n", bmi);
        System.out.println("Health Category: " + healthCategory);
    } else {
        System.out.println("Patient not found!");
    }
  } 
}