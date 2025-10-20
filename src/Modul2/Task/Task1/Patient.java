package Modul2.Task.Task1;

class Patient {
    public String name;
    private int recordNumber;
    public Doctor doctor;
    private String disease;

    // Constructor
    public Patient(String name, int recordNumber, Doctor doctor, String disease) {
        this.name = name;
        this.recordNumber = recordNumber;
        this.doctor = doctor;
        this.disease = disease;
    }

    public void printPatientDetails() {
        System.out.println("Patient Name: " + name);
        System.out.println("Record Number: " + recordNumber);
        System.out.println("Disease: " + disease);
        System.out.println("Doctor Assigned: " + doctor.getName());
    }

    public void updateDisease(String newDisease) {
        this.disease = newDisease;
        System.out.println("Disease updated to: " + disease);
    }
}
