package Garbaje_Section;


public class Rough {
    private int [] arr;
    private  int currSize , maxsize , start , end ;
    public Rough(){
        start = -1 ;
        end = -1;
        arr = new int[10];
        currSize = 0;
    }
    public Rough(int size){
        maxsize = size;
        arr = new int[maxsize];
        start = -1 ;
        end = -1;
        currSize = 0;
    }
    public void push(int x){
        if(currSize == maxsize){
            System.out.println("Queue is full ... \n Exiting ....");
            System.exit(1);
        }
        if(end == -1){
            start = 0;
            end = 0;
        }
        else{
            end = (end + 1) % maxsize;
        }
        arr[end] = x;
        System.out.println("Pushed " + x);
        currSize++;
    }
    public void pop(){
        if(start==-1){
            System.out.println("Queue is Empty... \n Exiting....");
            System.exit(1);
        }
        int ele  = arr[start];
        if(currSize == 1){
                start = 0;
                end = 0;
        }
        else{
            start = (start + 1) % maxsize;
        }
        System.out.println("Popped ele : " + ele);
        currSize--;
    }
    public void top(){
        if(start == -1){
            System.out.println("Invalid Request... \n Exiting... ");
            System.exit(1);
        }
        System.out.println("Top element is : " + arr[start]);
    }

    public void Curr_size(){
        System.out.println("Size is : " + currSize);
    }
    public boolean isempty(){
        return !(currSize == 0);
    }
    public static void main(String[] args) {
//        int [] arr = {1,2,3,4};int k = 2;
//        missingNumbers(arr,k);
//        int [] nums={0,4,3,0,4};
//        System.out.println(specialArray(nums));
//        System.out.println(xorOperation(4,3));
//        System.out.println(singleEle(new int []{1,1,2,2,3,3,4,4,8,8,9}));
//        int [] num={1,1,2,3,3,4,4,8,8};
//        System.out.println(singleNonDuplicate(num));
//        cyclic(num);


//        System.out.println(noofbits(10));
//        permutation("","abc");
//        char [] chars = {'a','b','b','b','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'};
//        compress(chars);
        Rough q = new Rough(5);
        q.push(1);
        q.push(12);
        q.push(13);
        q.push(14);
        q.push(15);
        while(q.isempty()){
            q.pop();
        }

    }

//    static void missingNumbers(int [] arr,int k){
//        int [] missing=new int[k];
//        int index=0;
//        int j=0;
//        for(int i=1;i<= arr[arr.length-1];i++){
//            if(j<k){
//                if(arr[index]!=i){
//                    missing[j]=i;
//                    j++;
//                }
//                else{
//                    index++;
//                }
//            }
//
//        }
//        int last=arr[arr.length-1];
//        int count=1;
//        for(int temp=j;temp<k;temp++){
//            missing[temp]=last+count;
//            ++count;
//        }
//        System.out.println(Arrays.toString(missing));
//    }
//public static int specialArray(int[] nums) {
//    int n=nums.length;
//    int max=-1;
//
//    for(int i=1;i<=n;i++){
//        int count=0;
//        for(int j=0;j<n;j++){
//            if(nums[j]>=i){
//                count++;
//            }
//        }
//        if(count==i && count>max){
//            max = count;
//        }
//    }
//    return max;
//}
//public static  int xorOperation(int n, int start) {
//    //int [] arr=new int[n];
//    int sum=0;
//    for(int i=0;i<n;i++){
//        int temp=start+2*i;
//        sum=sum^temp;
//    }
//    return sum;
//}
//    public static  int singleEle(int [] arr) {
//
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            sum=sum^arr[i];
//        }
//        return sum;
//    }
//    public static  void cyclic(int [] arr){
//        int n=arr.length;
//        for(int i=0;i<n;i++){
//            int index=arr[i]-1;
//            if(arr[index]!=arr[i]){
//                swap(arr,index,i);
//            }
//
//        }
//        printArray(arr);
//    }
//
//    private static void swap(int[] arr, int index, int i) {
//        int temp=arr[index];
//        arr[index]=arr[i];
//        arr[i]=temp;
//    }
//    private  static void printArray(int [] arr){
//        System.out.println(Arrays.toString(arr));
//    }
    public static int singleNonDuplicate(int[] nums) {
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
        int mid = left + (right - left) / 2;


        if (mid % 2 == 1) {
            mid--;
        }


        if (nums[mid] == nums[mid + 1]) {
            left = mid + 2;
        } else {

            right = mid;
        }
    }

    return nums[left];
}
    private static int noofbits(int n){
        int counter=0;
        while(n!=0){
            if((n&1)==1){
                counter++;
            }
            n=n>>1;
        }
        return counter;
    }
    private static void permutation(String p, String up){
        if(up.length()==0){
            System.out.print(p+" ");
            return;
        }
        permutation(p+up.charAt(0),up.substring(1));
        permutation(p,up.substring(1));
    }
    private static void compress(char [] chars){
//        HashMap<Character, Integer> map = new HashMap<>();
//        for(char ch : chars){
//            if(!map.containsKey(ch)){
//                map.put(ch,1);
//            }
//            else{
//                map.put(ch,map.get(ch)+1);
//            }
//        }
//        ArrayList<String> list = new ArrayList<>();
//        for(Map.Entry<Character,Integer> set : map.entrySet()){
//            list.add(Character.toString(set.getKey()));
//            if(set.getValue() != 1){
//                int v = set.getValue();
//                if(v>9){
//                    while(v!=0){
//                        int data = v % 10;
//                        list.add(Integer.toString(data));
//                        v /= 10;
//                    }
//                }
//                else{
//                    String value = Integer.toString(set.getValue());
//                    list.add( value);
//                }
//            }
//        }
//        System.out.println(list);
//        System.out.println(list.size());
        int n = chars.length;
        if (n == 0) {
            System.out.println("Fuck You");
        }

        int write = 0; // Index to write the result
        int anchor = 0; // Start of the group of characters

        for (int read = 0; read < n; read++) {
            // If we reached the end of the array or the currSizeent character is different from the next one
            if (read + 1 == n || chars[read] != chars[read + 1]) {
                chars[write++] = chars[anchor]; // Write the character

                // If the group length is more than 1, write the length
                if (read > anchor) {
                    int length = read - anchor + 1;
                    for (char c : Integer.toString(length).toCharArray()) {
                        chars[write++] = c;
                    }
                }

                // Move the anchor to the next group of characters
                anchor = read + 1;
            }
        }

        System.out.println(write);




    }


}
