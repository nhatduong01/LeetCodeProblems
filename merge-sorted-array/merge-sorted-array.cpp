class Solution {
public:
void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
 if(m == 0)
    {
      nums1 = nums2;
      return;
    }
  int index1 = 0, index2 = 0;
  int currSize = m;
  while(currSize != nums1.size())
  {
    if(nums1[index1] >= nums2[index2])
    {
      currSize++;
      for(int i = currSize-1 ; i >index1; i--)
      {
        nums1[i] = nums1[i-1];
      }
      nums1[index1++] = nums2[index2++];
    }
    else
    {
      m--;
      index1++;
      if(m == 0)
      {
        for(auto j = nums2.begin() + index2; j != nums2.end(); j++)
        {
          nums1[index1++] = *j;
          currSize++;
        }
      }
    }
  } 
}
};