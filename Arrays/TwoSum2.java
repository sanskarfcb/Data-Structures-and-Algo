package Arrays;

public class TwoSum2 {

        public int[] twoSum(int[] numbers, int target) {
            int j=1;
            int arr[] =new int[2];
            int s=0;
            int e = numbers.length-1;
            while(s<e){
                if(numbers[s]+numbers[e]==target){
                    arr[0]=s+1;
                    arr[1]=e+1;
                }
                if(numbers[s]+numbers[e]>target){
                    e--;
                }else{
                    s++;
                }
            }
            return arr;
        }
    }

