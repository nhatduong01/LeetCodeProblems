int max (int a, int b)
{
  return (a > b)? a : b;
}
int maxThreeNums(int a, int b, int c)
{

  return max(max(a,b), c);
}
int MaxCrossMidPoint(int* nums, int low, int mid, int high)
{
  int sum = 0;
  int max_left = INT_MIN, max_right = INT_MIN;
  for(int i = mid; i >=low; i --)
  {
    sum += nums[i];
    if(sum > max_left)
      max_left = sum;
  }
  sum = 0;
  for(int i = mid +1; i <= high ; i ++)
  {
    sum += nums[i];
    if(sum > max_right)
      max_right = sum;
  }
  return maxThreeNums(max_left, max_right, max_left + max_right);
}
int recursiveMaxSubArray(int* nums, int low, int high)
{
  if (low == high)
    return nums[low];
  int mid = (low+ high) /2;
  return maxThreeNums(recursiveMaxSubArray(nums, low, mid),
  recursiveMaxSubArray(nums, mid +1, high),
  MaxCrossMidPoint(nums, low, mid, high)
  );
}
int maxSubArray(int* nums, int numsSize)
{
  return recursiveMaxSubArray(nums, 0, numsSize -1);
}