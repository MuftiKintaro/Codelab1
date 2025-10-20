package Modul2.Task.Task1;

//move member
public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Sarah Lee", 2001, 12000, "Cardiology");
        Patient patient = new Patient("Michael Brown", 105, doctor, "Heart Disease");

        Hospital hospital = new Hospital("City General Hospital", "123 Main Street", patient);

        hospital.printHospitalDetails();

        doctor.applyBonus();
        doctor.printDetails();
    }
}
