package Interfaces;
interface Device{
    void turnOn();
    void turnOff();

}
interface Rechargeable{

    void charge();
    int batteryLevel();
}
class Laptop implements Device,Rechargeable{
    private int batteryPercentage = 100;
    @Override
    public void turnOn(){
        if(batteryPercentage > 0){
            System.out.println("Laptop is turned on");
            batteryPercentage-=10;
        }else{
            System.out.println(" ** Low Battery ** \n Please charge...");
        }
    }
    @Override
    public void turnOff(){
        System.out.println("Laptop is turned off");
    }
    @Override
    public void charge(){
        System.out.println("Laptop is fully Charged");
        batteryPercentage = 100;
    }
    @Override
    public int batteryLevel(){
        return batteryPercentage;
    }

}

public class SmartPhone implements Device, Rechargeable {
        public int batteryLevel(){
            return (int)Math.floor(Math.random()*100);
        }
        public void turnOn(){
            if(batteryLevel() > 0){
                System.out.println("Turned on");
            }else{
                System.out.println("Turned off");
            }
        }
        public void turnOff(){
            System.out.println("Device turned off \n Please charge...");
        }
        public void charge(){
            System.out.println("charging..." + batteryLevel());
        }

    public static void main(String[] args) {
        Laptop obj = new Laptop();
        System.out.println(obj.batteryLevel());
        obj.turnOn();
        obj.turnOn();
        System.out.println(obj.batteryLevel());
        obj.turnOff();
        SmartPhone obj1 = new SmartPhone();
        System.out.println(obj1.batteryLevel());
        obj.turnOn();
        obj1.charge();


    }
}
