class Solution {
    static public int maxHeight(int[] heights)
    {
        int maxHeight = 0;
        for(int height : heights)
            if (maxHeight < height)
                maxHeight = height;
        return maxHeight;
    }
    static public int getLower(int[] heights, int threshold)
    {
        for (int i = 0; i < heights.length; i ++)
        {
            if (heights[i] >= threshold)
                return i;
        }
        return -1;
    }
    static public int getUpper(int[] heights, int threshold)
    {
        for (int i = heights.length - 1; i >= 0 ; i --)
        {
            if (heights[i] >= threshold)
                return i;
        }
        return -1;
    }
    static public int maxArea(int[] height) {
        int maxVolume = 0;
        int maxHeight = maxHeight(height);
        for(int i = 1; i <= maxHeight; i ++)
        {
            var currVolume = i * (getUpper(height, i) - getLower(height, i));
            maxVolume = Math.max(currVolume, maxVolume);
        }
        return maxVolume;
    }
}