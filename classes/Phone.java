package classes;

public class Phone {
    String brand;
    String type;
    double price;
    double priceInRp;
    double RP = 14500;

    // Constructor
    public Phone(String brand, String type){
        this.brand = brand;
        this.type = type;
    }

    // setter
    public void setPrice(double current_price){
        price = current_price;
    }
    // getter
    public double getPrice(){
        return price;
    }

    public double convertToRP(){
        priceInRp = price * RP;
        return priceInRp;
    }

    // print phone detail
    public void getPhoneData(){
        System.out.println("================================");
        System.out.println("Brand:"+ brand);
        System.out.println("Brand:"+ type);
        System.out.println(String.format("Price: $%,.2f", price));
        System.out.println("================================");
    }
}
