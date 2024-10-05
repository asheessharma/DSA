package Employee_Java;

import java.util.Scanner;

public class Solution_Tcs {
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
