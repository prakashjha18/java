//APPROACH 1 

import java.lang.Math; 
class Solution {
    public int maxArea(int[] height) {
        //ArrayList<Integer> area = new ArrayList<Integer>();
        int max = 0;
        for (int i=0; i<height.length; i++)
        {
            for(int j=0; j<height.length;j++)
            {
                if(height[i] <height[j])
                {
                    
                    if (height[i] * Math.abs(i-j)>max)
                    {
                        max  = height[i] * Math.abs(i-j);
                    }
                }
                else
                {
                    if(height[j] * Math.abs(i-j)>max)
                    {
                        max = height[j] * Math.abs(i-j);
                    }
                }
            }
        }
        return max;
    }
}

//APPROACH 2

class Solution {
    public int maxArea(int[] height) {
        
        int maxarea=0, h1=0,h2=height.length-1;
        
        //go on checking left and right various combination
        //at every step move in the height which is min hoping to increase the area
        while(h1!=h2){
            
            //check max area
            maxarea=Math.max(maxarea,Math.min(height[h1],height[h2])*(h2-h1));
            
            //check min height and move it inside
            if(height[h2]<height[h1]){
                h2--;
            }else{
                h1++;
            }
            
        }
        return maxarea;
    }
}
