public class Main{
    public static void main(String[] args){
        Patient[] patients = {
                new InPatient("P32","Harry",28,"Malaria",3,1500),
                new OutPatient("P34","Antonio",32,"Diabetes",500)
        };
        for(Patient p : patients){
            System.out.println(p.getPatientDetails());
            System.out.println("Diagnosis: "+p.getDiagnosis());
            System.out.println("Total Bill: "+p.calculateBill());

            if(p instanceof MedicalRecord){
                MedicalRecord m = (MedicalRecord) p;
                m.addRecord("Initial check-up");
                m.addRecord("X Ray result");
                m.viewRecord();
            }
            System.out.println();
        }
    }
}