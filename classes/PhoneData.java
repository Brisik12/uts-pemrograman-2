package classes;

public class PhoneData {
    public static void main(String[] args) {
        // create object iphone
        Phone iphone13 = new Phone("apple", "iphone");
        Phone zflip = new Phone("samsung", "z-flip");

        // set price
        iphone13.setPrice(2000);
        zflip.setPrice(1500);

        // Get phone list
        iphone13.getPhoneData();
        System.out.println("Harga dalam Rupiah: Rp." + String.format("%,.2f", iphone13.convertToRP()));
        zflip.getPhoneData();
        System.out.println("Harga dalam Rupiah: Rp." + String.format("%,.2f", zflip.convertToRP()));
    }
}
