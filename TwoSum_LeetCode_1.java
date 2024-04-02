package arraySamp;

public class TwoSum_LeetCode_1 {
	
	static int newArr[] = new int[2];

	    public static int[] twoSum(int[] nums, int target) {
	        
	   
	        for (int i = 0; i < nums.length; i++) {
	            for (int j = i + 1; j < nums.length; j++) {
	                if (nums[i] + nums[j] == target) {
	                    newArr[0] = i;
	                    newArr[1] = j;
	                    return newArr;
	                }
	            }
	        }
	        return null;
	    }

	
	public static void main(String[] args) {
		int nums[] = new int[4];
		nums[0] = 2;
		nums[1] = 7;
		nums[2] = 11;
		nums[3] = 15;
		 
		int target = 26;
		
		System.out.print(target+" is The sum of two Indices of ["+nums[0]+","+nums[1]+","+nums[2]+","+ nums[3]+"]:" );
		int[] result = twoSum(nums,target);
		System.out.print("["+result[0]+","+result[1]+"]");
//	    for (int i = 0; i < newArr.length; i++) {
//	    	
//	        System.out.print(newArr[i]+",");
//	    }
//	    System.out.println("]");
//		
	}
	

}
