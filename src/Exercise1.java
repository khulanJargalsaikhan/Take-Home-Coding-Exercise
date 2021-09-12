public class Exercise1 {
    public static void main(String[]args){
    /*
    #1
    Print the number of integers in an array that are above the given input and the number that are below,
    e.g. for the array [1, 5, 2, 1, 10] with input 6, print “above: 1, below: 4”.


    */

        System.out.println(countingNums(new int[]{1, 5, 2, 1, 10}, 6));
        System.out.println(countingNums(new int[]{8, 11, 12, 11, 10, 20, 4, -6, 6, 0}, 6));

    }

    public static String countingNums(int[] nums, int num){
        int countAbove = 0;
        int countBelow = 0;
        for (int i=0; i<nums.length; i++){
            if(nums[i] > num) countAbove++;
            if(nums[i] < num) countBelow++;
        }
        return "above: " + countAbove + ", " + "below: " + countBelow;
    }




}
