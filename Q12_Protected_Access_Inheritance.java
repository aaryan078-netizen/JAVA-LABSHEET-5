public class ProtectedAccessMain {
    public static void main(String[] args) { Pharmacist p=new Pharmacist(25,"Dev","LIC-7788"); p.displayPharmacist(); }
}
class HospitalStaff { protected int staffId; protected String staffName; protected HospitalStaff(int staffId,String staffName){this.staffId=staffId;this.staffName=staffName;} protected void displayStaff(){System.out.println(staffId+" | "+staffName);} }
class Pharmacist extends HospitalStaff { private String licenseNo; Pharmacist(int staffId,String staffName,String licenseNo){super(staffId,staffName);this.licenseNo=licenseNo;} void displayPharmacist(){displayStaff();System.out.println("License: "+licenseNo+"; inherited staff: "+staffId+", "+staffName);} }
