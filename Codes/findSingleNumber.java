import java.util.*;

class findSingleNumber {
    public static int singleNumber(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
 
        if(nums.length == 0) {
            return 0;
        }

        for(int i=0; i<nums.length; i++) {

            if(map.containsKey(nums[i])) {
                
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if(value == 1) {
                return key;
            }
        }
        return 0;
    }
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        
        System.out.print("Enter the array elements: ");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        
        int result = singleNumber(arr);
        
        System.out.print(result);
    }
}
