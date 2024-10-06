package Employee_Java;

public class SmartPhone {
    private String modelName;
    private String brand;
    private int price;
    private boolean inStock;
    public SmartPhone(String modelName, String brand, int price, boolean inStock){
        this.modelName = modelName;
        this.brand = brand;
        this.price = price;
        this.inStock = inStock;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getBrand() {
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

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
