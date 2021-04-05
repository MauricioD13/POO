import java.util.Map;
import java.util.ArrayList;

class UberBlack extends Car {
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    String brand;
    String model;

    public void UberBlack(String license, Account driver, String brand, String modelMap<String, ArrayList<String,Integer>> typeCarAccepted) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;

    }
}