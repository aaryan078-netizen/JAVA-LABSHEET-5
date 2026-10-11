public class PatientMain {
    public static void main(String[] args) {
        Patient[] patients={new Patient(1,"Asha",25),new Patient(2,"Rahul",34),new Patient(3,"Neha",19),new Patient(4,"Amit",51),new Patient(5,"Riya",42)};
        new PatientManager().displayAllPatients(patients);
    }
}
class Patient { int patientId,age; String patientName; Patient(int patientId,String patientName,int age){this.patientId=patientId;this.patientName=patientName;this.age=age;} void displayPatient(){System.out.println(patientId+" | "+patientName+" | Age: "+age);} }
class PatientManager { void displayAllPatients(Patient[] patients){for(int i=0;i<patients.length;i++) patients[i].displayPatient();} }
