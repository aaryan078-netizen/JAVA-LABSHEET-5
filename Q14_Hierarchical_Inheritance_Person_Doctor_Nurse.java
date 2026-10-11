public class HierarchicalMain {
    public static void main(String[] args) { Doctor d=new Doctor("Dr. Isha",36,"Cardiology"); Nurse n=new Nurse("Pooja",29,"Ward B"); d.displayDoctor(); n.displayNurse(); }
}
class Person { protected String name; protected int age; Person(String name,int age){this.name=name;this.age=age;} void displayPerson(){System.out.println(name+", age "+age);} }
class Doctor extends Person { private String specialization; Doctor(String name,int age,String specialization){super(name,age);this.specialization=specialization;} void displayDoctor(){displayPerson();System.out.println("Doctor specialization: "+specialization);} }
class Nurse extends Person { private String ward; Nurse(String name,int age,String ward){super(name,age);this.ward=ward;} void displayNurse(){displayPerson();System.out.println("Nurse ward: "+ward);} }
