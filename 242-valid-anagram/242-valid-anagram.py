class Solution(object):
    def isAnagram(self,magazine, ransomNote):
      if (len(magazine) != len(ransomNote)):
        return False
      myDict = {}
      for i in range(len(ransomNote)):
        if ransomNote[i] in myDict:
          myDict[ransomNote[i]] += 1
        else:
          myDict[ransomNote[i]] = 1
      for i in range(len(magazine)):
        if magazine[i] in myDict:
          myDict[magazine[i]] -= 1
          if myDict[magazine[i]] == 0:
            myDict.pop(magazine[i])
      return not bool(myDict)