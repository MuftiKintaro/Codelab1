package Modul2.Task.Task1;

class Doctor {
    private static final double BONUS_RATE = 0.05;
    private String name;
    private int id;
    private double salary;
    private String specialization;

    // Constructor
    public Doctor(String name, int id, double salary, String specialization) {
        this.setName(name);
        this.id = id;
        this.salary = salary;
        this.specialization = specialization;
    }

    public void applyBonus() {
        salary += CalculateBonus();
        System.out.println("Bonus applied | New Salary: " + salary);
    }
    //Extract Method
    private double CalculateBonus() {
        double bonus = salary * BONUS_RATE;
        return bonus;
    }

    public void printDetails() {
        System.out.println("Doctor ID: " + id);
        System.out.println("Name: " + getName());
        System.out.println("Specialization: " + specialization);
        System.out.println("Salary: " + salary);
    }

    public void updateSpecialization(String newSpecialization) {
        this.specialization = newSpecialization;
        System.out.println("Specialization updated to: " + specialization);
    }


    //encapsulate field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class MainApp {
}

