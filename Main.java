
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Patient patient = new Patient("29284", "Pie", 182.8, 88.5);
    Patient patient2 = new Patient("32567", "Pat", 161.5, 46.2);

    System.out.println("============ Patient Data =============");
    System.out.println(patient);
    System.out.println(patient2);
    System.out.println("=======================================");
    Scanner inputId = new Scanner(System.in);
    System.out.print("Enter Patient Id: ");
    String pid = inputId.nextLine();

    Patient selectedPatient = null;
    if (patient.getPatientId().equals(pid)) {
        selectedPatient = patient;
    } else if (patient2.getPatientId().equals(pid)) {
        selectedPatient = patient2;
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