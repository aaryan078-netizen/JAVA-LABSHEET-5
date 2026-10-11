public class MedicalStaffMain {
    public static void main(String[] args) { Doctor d=new Doctor(1,"Dr. Aman","Neurology"); Pharmacist p=new Pharmacist(2,"Ravi","LIC-992"); d.displayDoctor(); p.displayPharmacist(); }
}
class MedicalStaff { protected int staffId; protected String staffName; MedicalStaff(int staffId,String staffName){this.staffId=staffId;this.staffName=staffName;} }
class Doctor extends MedicalStaff { private String specialization; Doctor(int staffId,String staffName,String specialization){super(staffId,staffName);this.specialization=specialization;} void displayDoctor(){System.out.println("Doctor: "+staffId+" | "+staffName+" | "+specialization);} }
class Pharmacist extends MedicalStaff { private String licenseNo; Pharmacist(int staffId,String staffName,String licenseNo){super(staffId,staffName);this.licenseNo=licenseNo;} void displayPharmacist(){System.out.println("Pharmacist: "+staffId+" | "+staffName+" | "+licenseNo);} }
