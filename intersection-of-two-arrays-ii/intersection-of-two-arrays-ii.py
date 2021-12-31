def findNum (myList, myNum):
  for i in myList:
    if i == myNum:
      return myList.index(i)
  return -1
class Solution(object):
    def intersect(self, nums1, nums2):
      result = []
      for i in range(len(nums1)):
        temp = findNum(nums2, nums1[i])
        if temp != -1:
          result.append(nums1[i])
          nums2.remove(nums2[temp])
      return result