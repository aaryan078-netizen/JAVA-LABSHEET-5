public class PatientMain {
    public static void main(String[] args) {
        Patient p=new Patient("Karan",28,68.5); p.setAge(30); p.setAge(-4); p.setWeight(70); p.setWeight(0); p.displayPatient();
    }
}
class Patient { private String patientName; private int age; private double weight; Patient(String patientName,int age,double weight){this.patientName=patientName;setAge(age);setWeight(weight);} public String getPatientName(){return patientName;} public void setPatientName(String patientName){this.patientName=patientName;} public int getAge(){return age;} public void setAge(int age){if(age>=0)this.age=age;else System.out.println("Invalid age ignored");} public double getWeight(){return weight;} public void setWeight(double weight){if(weight>0)this.weight=weight;else System.out.println("Invalid weight ignored");} void displayPatient(){System.out.println(patientName+", age="+age+", weight="+weight+" kg");} }
