object Solution {

  def longestPalindrome(s: String): String =
{
      var maxlength = 0;
      var low = 0;
      var high = 0;
      var mytable = Array.ofDim[Boolean](s.length, s.length)
      for( i <- 0 to s.length - 1)
        {
          mytable(i)(i) = true;
        }
      for(i <- 0 to s.length -2)
        {
          if(s(i) == s(i+1))
            mytable(i)(i+1) = true
        }
      for(i <- (0 to s.length - 1).reverse)
        {
          for( j <- (i to s.length - 1).reverse)
            {
              if(mytable(i)(j) == false)
                {
                  if(s(i) == s(j) && mytable(i+1)(j-1) == true)
                    {
                      mytable(i)(j) = true;
                      if(j - i > maxlength)
                        {
                          low = i
                          high = j
                          maxlength = j - i
                        }
                    }
                }
              else
                {
                  if(j - i > maxlength)
                  {
                    low = i
                    high = j
                    maxlength = j - i
                  }
                }
            }
        }
      s.slice(low, high + 1)
    }
}