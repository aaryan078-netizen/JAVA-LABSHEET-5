public class EligibilityMain {
    public static void main(String[] args) {
        Medicine medicine=new Medicine("ExampleMedicine",18);
        System.out.println("Age 22: "+medicine.checkEligibility(22));
        System.out.println("Age 12: "+medicine.checkEligibility(12));
    }
}
class Medicine { String medicineName; int ageLimit; Medicine(String medicineName,int ageLimit){this.medicineName=medicineName;this.ageLimit=ageLimit;} String checkEligibility(int patientAge){String result; if(patientAge>=ageLimit) result="Eligible"; else result="Not Eligible"; return result;} }
