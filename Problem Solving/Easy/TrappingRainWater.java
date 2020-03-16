// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.


// The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!

// Example:

// Input: [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
import java.io.*;
import java.util.*;
class TrappingRainWater {

    // complete the below function implementation
    public int trap(int[] height) {
        int left = 0, right = height.length- 1;
    int ans = 0;
    int left_max = 0, right_max = 0;
    while (left < right) {
        if (height[left] < height[right]) {
            if(height[left] >= left_max){
                left_max = height[left];
            } else {
                ans += (left_max - height[left]);
            }
            ++left;
        }
        else {
            if(height[right] >= right_max){
                right_max = height[right];
            } else {
                ans += (right_max - height[right]);
            }
            --right;
        }
    }
    return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int height[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            height[i] = scanner.nextInt();
        }
        scanner.close();
        int result = new TrappingRainWater().trap(height);
        System.out.println(result);
    }
}
