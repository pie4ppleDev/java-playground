public class Patient implements Health {
  private String patientId;
  private String name;
  private Double height;
  private Double weight;

  public Patient() {
  }

  public Patient(String patientId, String name, Double height, Double weight) {
    this.patientId = patientId;
    this.name = name;
    this.height = height;
    this.weight = weight;
  }

  public String getPatientId() {
    return patientId;
  }

  @Override
  public String toString() {
    return "Patient ID: " + patientId + ", " + "Name: " + name;
  }

  @Override
  public double calculateBMI() {
    if (height == null || weight == null || height == 0) {
      return 0.0;
    }
    double heightInMeter = height / 100;
    return weight / (heightInMeter * heightInMeter);
  }

  public String getHealthCategory() {
        double bmi = calculateBMI();
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal weight";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }
}