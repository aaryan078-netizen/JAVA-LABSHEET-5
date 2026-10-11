public class PharmacyMain {
    public static void main(String[] args) {
        Pharmacy p1=new Pharmacy("Care Pharmacy","Mathura"), p2=new Pharmacy("Health Plus","Agra"), p3=new Pharmacy("MediStore","Delhi");
        p1.displayPharmacy(); p2.displayPharmacy(); p3.displayPharmacy(); Pharmacy.displayPharmacyCount();
    }
}
class Pharmacy {
    String pharmacyName, location; static int pharmacyCount=0;
    Pharmacy(String pharmacyName,String location) { this.pharmacyName=pharmacyName; this.location=location; pharmacyCount++; }
    void displayPharmacy() { System.out.println(pharmacyName + " - " + location); }
    static void displayPharmacyCount() { System.out.println("Total pharmacies: " + pharmacyCount); }
}
