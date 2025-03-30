import java.util.*;

class Patient {
    String name;
    List<Doctor> consultedDoctors = new ArrayList<>();

    public Patient(String name) {
        this.name = name;
    }

    public void consultDoctor(Doctor doctor) {
        consultedDoctors.add(doctor);
    }

    public String getName() {
        return name;
    }

    public List<Doctor> getConsultedDoctors() {
        return consultedDoctors;
    }
}

class Doctor {
    String name;
    List<Patient> patients = new ArrayList<>();

    public Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
        if (!patient.getConsultedDoctors().contains(this)) {
            patient.consultDoctor(this);
        }
        System.out.println("Doctor " + name + " is consulting Patient " + patient.getName());
    }

    public String getName() {
        return name;
    }

    public List<Patient> getPatients() {
        return patients;
    }
}

class Hospital {
    String name;
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();

    public Hospital(String name) {
        this.name = name;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showConsultations() {
        System.out.println("Consultations in " + name + ":");
        for (Doctor d : doctors) {
            System.out.println("Doctor: " + d.getName());
            for (Patient p : d.getPatients()) {
                System.out.println("  Consulted Patient: " + p.getName());
            }
        }
    }
}

class HospitalSystem {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Care Hospital");

        Doctor doc1 = new Doctor("Dr. Smith");
        Doctor doc2 = new Doctor("Dr. Johnson");

        Patient pat1 = new Patient("Alice");
        Patient pat2 = new Patient("Bob");
        Patient pat3 = new Patient("Charlie");

        hospital.addDoctor(doc1);
        hospital.addDoctor(doc2);
        hospital.addPatient(pat1);
        hospital.addPatient(pat2);
        hospital.addPatient(pat3);

        doc1.consult(pat1);
        doc1.consult(pat2);
        doc2.consult(pat1);
        doc2.consult(pat3);

        hospital.showConsultations();
    }
}
