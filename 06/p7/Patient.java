import java.util.*;
interface MedicalRecord{
    void addRecord(String record);
    void viewRecord();
}
abstract class Patient{
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;

    Patient(String patientId, String name, int age, String diagnosis){
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }
    public String getDiagnosis(){
        return diagnosis;
    }
    public String getPatientDetails(){
        return ("Patient ID: "+patientId+"\nName: "+name+"\nAge: "+age);
    }
    public abstract double calculateBill();
}

class InPatient extends Patient implements MedicalRecord{
    private int daysAdmitted;
    private double dailyRate;
    private List<String> records;

    InPatient(String patientId, String name, int age, String diagnosis, int daysAdmitted, double dailyRate){
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
        this.records = new ArrayList<>();
    }
    public double calculateBill(){
        return daysAdmitted * dailyRate;
    }
    public void addRecord(String record){
        records.add(record);
    }

    @Override
    public void viewRecord() {
        System.out.println("Medical Records: "+records);
    }
}

class OutPatient extends Patient implements MedicalRecord{
    private double consultationFee;
    private List<String> records;

    OutPatient(String patientId, String name, int age, String diagnosis, double consultationFee){
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
        this.records = new ArrayList<>();
    }
    public double calculateBill(){
        return consultationFee;
    }
    public void addRecord(String record){
        records.add(record);
    }
    public void viewRecord(){
        System.out.println("Medical Records: "+records);
    }
}