package Employee_Java;

import java.util.Scanner;
//Create a class HeadSets with below attributes:
//
//headsetName - String
//
//brand-String
//
//price-int
//
//available-boolean

//The above attributes should be as required. private, write getters, setters and parameterized constructor
//Create class Solution with main method.
//Implement two static methods - find TotalPriceForGivenBrand and findAvailable HeadsetWithSecondMinPrice in Solution class.
//findTotal PriceForGiven Brand method:
//The method will return the total price of Headsets from array of Headset objects for the given brand(String parameter passed).
//If no Headsets with the given brand is present in the array of Headsets objects, then the method should return 0.
// findAvailableHeadsetWithSecondMinPrice method:
//This method will take array of Headset objects as an input parameter and returns available Headset object with the second lowest/minimum price from the given array objects.
//If no Headsets with the above condition is present in the array of Headsets objects, then the method should return null.
//Note: No two Headsets will have the same price.
//All the searches should be case-insensitive.
//The above-mentioned static methods should be called from the main method.
//For findTotalPriceForGiven Brand method - The main method should print the returned total price as it is if the returned value is greater than 0 or it should print "No Headsets available with the given brand".
//Eg: 4500
// where 4500 is the total Headsets price
//For findAvailable HeadsetWithSecondMinPrice method - The main method should print the headsetsName and price from the returned Headsets object if the returned value is not null.
//If the returned value is null then it should print "No Headsets available".
//Eg:Logitech Wired
//1500
//where Logitech Wired is the headsetName and 1500 is the price to be
//Before calling these static methods in main, use Scanner object to read the values of four Headset objects referring attributes in the above mentioned attribute sequence.
//Next, read the value of String parameter for capturing brand.
public class Solution_HeadSets {
    public static int findTotalPriceForGivenBrand(String newbrand, HeadSets[] obj){
        int totalprice=0;
        boolean found = false;

        for(HeadSets obj1 : obj){
            if(obj1.getBrand().equalsIgnoreCase(newbrand)){
                totalprice+=obj1.getPrice();
                found = true;
            }
        }
        return found ? totalprice : 0;
    }
    public static HeadSets findAvailableHeadSetsWithSecondMinPrice(HeadSets [] hs){
        HeadSets min = null ; HeadSets secondMin  = null;
        for(HeadSets set : hs){
            if(set.isAvailable()){
                if(min== null || min.getPrice() > set.getPrice()){
                    secondMin = min;
                    min = set;
                }
                else if(secondMin == null || set.getPrice() < secondMin.getPrice() ){
                    secondMin = set;
                }
            }
        }
        return secondMin;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HeadSets [] hs = new HeadSets[4];
        for(int i=0; i < hs.length; i++){
            String headSetName = sc.nextLine();
            String brand = sc.nextLine();
            int price = sc.nextInt();
            boolean available = sc.nextBoolean();
            sc.nextLine();
            hs[i]=new HeadSets(headSetName,brand,price,available);
        }
        String newBrand = sc.nextLine();
        int price = findTotalPriceForGivenBrand(newBrand,hs);
        if(price>0){
            System.out.println(price);
        }else{
            System.out.println("No HeadSets available with the given brand");
        }
        HeadSets obj = findAvailableHeadSetsWithSecondMinPrice(hs);
        if(obj!=null){
            System.out.println(obj.getHeadSetName());
            System.out.println(obj.getPrice());
        }else{
            System.out.println("No HeadSets available");
        }

    }
}
