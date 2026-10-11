public class PublicAccessMain {
    public static void main(String[] args) { Hospital h=new Hospital(); h.hospitalName="City Hospital"; h.hospitalCode="CH101"; System.out.println(h.hospitalName+" / "+h.hospitalCode); h.displayHospital(); }
}
class Hospital { // Public members can be accessed from other classes.
    public String hospitalName, hospitalCode; public Hospital(){hospitalName="General Hospital";hospitalCode="GH001";} public void displayHospital(){System.out.println("Hospital: "+hospitalName+", Code: "+hospitalCode);} }
