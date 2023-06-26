public class MoveZeros {
    public static void move0(int nums[]) {
        int k = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
        }
    }
    public static void main(String args[]) {
        int nums[] = {0,1,0,3,12};
        move0(nums);
        for(int i:nums) {
            System.out.print(i+",");
        }
    }
}