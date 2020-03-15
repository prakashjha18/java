// Objective
// Given a collection of intervals as input, merge overlapping intervals and output the result.

// The input may not specify intervals in sorted order i.e a lower interval could be specified after a higher interval. The output intervals have to be in sorted order.

// Note: Handle cases where an interval could overlap with more than one other interval.

// Examples
// Example 1

// Input: [1,4],[2,5],[12,15],[8,10]

// Output: [1,5],[8,10],[12,15]

// Intervals [1,4] and [2,5] have overlap and have been merged into [1,5]

// Example 2

// Input: [1,3],[4,5]

// Output: [1,3],[4,5]

// No overlap seen; not merged.

import java.io.*;
import java.util.*;

class MergeIntervals {
    // Implement your solution by completing the below function
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        return MergeIntervals(intervals);
    }
    public int[][] MergeIntervals(int[][] intervals) {
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        List<int[]> output_List = new ArrayList();
        int[] prev = intervals[0];
        for(int i=1; i<intervals.length;i++) {
            if(prev[1] >= intervals[i][0]) {
                int low = Math.min(prev[0], intervals[i][0]);
                int high = Math.max(prev[1], intervals[i][1]);
                prev = new int[]{low, high};
            }
            else {
                output_List.add(prev);
                prev = intervals[i];
            }
        }
        output_List.add(prev);
        return output_List.toArray(new int[output_List.size()][]);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] nums = new int[n][2];
        for (int i = 0; i < n; i++) {
            nums[i][0] = scanner.nextInt();
            nums[i][1] = scanner.nextInt();
        }
        scanner.close();

        int[][] results = new MergeIntervals().merge(nums);
        for (int i = 0; i < results.length; ++i)
            System.out.println(String.valueOf(results[i][0]) + " " + String.valueOf(results[i][1]));
    }
}
