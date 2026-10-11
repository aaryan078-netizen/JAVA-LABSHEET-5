public class DefaultAccessMain {
    public static void main(String[] args) { Pharmacy p=new Pharmacy(); p.medicineName="Amoxicillin"; p.price=65.0; p.displayMedicine(); }
}
class Pharmacy { // Default/package-private members: no access keyword; same package can access them.
    String medicineName; double price; Pharmacy(){} void displayMedicine(){System.out.println(medicineName+" | ₹"+price);} }
