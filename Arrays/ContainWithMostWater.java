package Arrays;

public class ContainWithMostWater {
        public int maxArea(int[] height) {
            int n = height.length;
            int low=0;
            int max=0;
            int high=n-1;

            while(low<high){
                int w =high-low;
                int h = Math.min(height[low],height[high]);
                int area=h*w;
                max=Math.max(area,max);

                if(height[low]<height[high]){
                    low++;
                }else{high--;}

            }
            return max;
        }
    }

