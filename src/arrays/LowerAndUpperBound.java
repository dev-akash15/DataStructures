package arrays;
class LowerAndUpperBound {
  
  
  public static void main(String[] s){
    LowerAndUpperBound ob = new LowerAndUpperBound();
    int[] arr = {2,2};
   
    int[] res = ob.searchRange(arr,3);
    
    System.out.println("The lower bound is "+res[0]);
    System.out.println("The upper bound is "+res[1]);
  }
  
    public int[] searchRange(int[] nums, int target) {
        int starting =-1;
        int ending = -1;
        int[] ans = new int[2];
        int low = 0;
        int high = nums.length-1;
        
        if(nums.length==1 && nums[0]!=target || nums.length==0) { 
            ans[0]=ans[1]=-1;
            return ans;
        }
        else if(nums.length==1 && nums[0]==target) {
            return ans;
        }
        
        
        while(low<=high && nums.length>1){
            int mid = (low+high)/2;
            if(target==nums[mid]){
                high = mid -1;
                starting = mid;
            }
            else if(target<nums[mid]){
                high = mid-1;
            }
            else low = mid+1;
        }
        
        low =0; high =nums.length-1;
       
        while(low<=high){
            
            int mid = (low+high)/2;
            if(target==nums[mid]){
                low = mid+1;
                ending = mid;
            }
            else if(target>nums[mid]){
                low = mid+1;
            }
            else high = mid-1;
        }
        
        ans[0] = starting;
        ans[1] = ending;
        
        return ans;
    }
}
