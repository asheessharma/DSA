package Employee_Java;

public class HeadSets {
    private String headSetName;
    private String brand;
    private int price;
    private boolean available;
    public HeadSets(String headSetName, String brand, int price, Boolean available){
        this.headSetName = headSetName;
        this.brand = brand;
        this.price = price;
        this.available = available;
    }
    public String getHeadSetName(){
        return headSetName;
    }
    public void setHeadSetName(String name){
        this.headSetName = name;
    }
    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
