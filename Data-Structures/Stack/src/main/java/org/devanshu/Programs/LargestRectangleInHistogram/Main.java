package org.devanshu.Programs.LargestRectangleInHistogram;

public class Main {
    public static void main(String[] args) {
//        int[] heights = {2,1,5,6,2,3};

        int[] heights = {2,4};

        LargestRectangle findMaxArea = new LargestRectangle();

        int ans = findMaxArea.maxArea(heights);

        System.out.println(ans);
    }
}
