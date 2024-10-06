package Employee_Java;

import java.util.Scanner;

public class Solution_SmartPhone {
    public static int findTotalPriceForGivenBrand(SmartPhone [] smartphone , String brand){
        int totalPrice = 0;

        for(SmartPhone temp : smartphone){
            if(temp.getBrand().equalsIgnoreCase(brand)){
                totalPrice+=temp.getPrice();

            }
        }
        return totalPrice>0 ?totalPrice : 0;
    }
    public static SmartPhone findAvailablePhoneWithThirdMaxPrice(SmartPhone [] arr){
        SmartPhone first = null;
        SmartPhone second = null;
        SmartPhone third = null;
        for(SmartPhone phone : arr){
            if(phone.isInStock()){
                if(first == null || first.getPrice() < phone.getPrice()){
                    third = second;
                    second = first;
                    first = phone;
                }else if(second == null || phone.getPrice() > second.getPrice()){
                    third = second;
                    second = phone;
                }
                else if(third == null || phone.getPrice() > third.getPrice()){
                    third = phone;
                }
            }

        }
        return third;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartPhone [] objects = new SmartPhone[5];
        for(int i = 0; i < 5; i++){
            String modelName = sc.nextLine();
            String brand = sc.nextLine();
            int price = sc.nextInt();
            boolean inStock = sc.nextBoolean();
            sc.nextLine();
            objects[i] = new SmartPhone(modelName,brand,price,inStock);
        }
        String brandName = sc.nextLine();
        int returnPrice = findTotalPriceForGivenBrand(objects,brandName);
        if(returnPrice>0){
            System.out.println(returnPrice);
        }else{
            System.out.println("No phone available with the given brand");
        }
        SmartPhone returnObj = findAvailablePhoneWithThirdMaxPrice(objects);
        if(returnObj != null){
            System.out.println(returnObj.getModelName());
            System.out.println(returnObj.getPrice());
        }else{
            System.out.println("No phones available");
        }
    }


}
