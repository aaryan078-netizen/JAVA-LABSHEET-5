public class MedicineProductMain {
    public static void main(String[] args) {
        MedicineProduct p=new MedicineProduct("Vitamin C","VC10",99.5); p.setPrice(89.5);
        System.out.println("Medicine name: "+p.getMedicineName()); p.displayProduct();
    }
}
class MedicineProduct { private String medicineName,batchNo; private double price; MedicineProduct(String medicineName,String batchNo,double price){this.medicineName=medicineName;this.batchNo=batchNo;this.price=price;} public String getMedicineName(){return medicineName;} public String getBatchNo(){return batchNo;} public double getPrice(){return price;} public void setMedicineName(String medicineName){this.medicineName=medicineName;} public void setBatchNo(String batchNo){this.batchNo=batchNo;} public void setPrice(double price){if(price>=0)this.price=price;} void displayProduct(){System.out.println(medicineName+" | "+batchNo+" | ₹"+price);} }
