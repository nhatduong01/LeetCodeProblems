object Solution {
  def checkPalindrome(s: String, low: Int, high: Int) : Boolean =
    {
      if(low == high || low > high)
        true
      else if (s(low) == s(high))
         checkPalindrome(s,low +1, high -1)
      else false
    }
    def longestPalindrome(s: String): String = 
    {
    var maxlength = 0;
    var low = 0;
    var high = 0;
    for(index1 <- (0 to s.length -1))
      {
        for(index2 <- (index1 + maxlength  to s.length - 1))
          {
            if (checkPalindrome(s slice(index1, index2 +1), 0, index2 - index1) && (index2 + 1 - index1) > maxlength)
            {
              maxlength = index2 - index1 + 1
              low = index1
              high = index2
            }
          }
      }
    s.slice(low, high +1)
    }
}