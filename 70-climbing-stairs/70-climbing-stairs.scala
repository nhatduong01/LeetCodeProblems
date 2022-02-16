object Solution {
    def climbStairs(n: Int): Int = 
    {
    if(n == 1)
      1
    else if (n == 2)
      2
    else
      {
        var frs = 1
        var sed = 2
        var result = frs + sed
        for (i <- (3 to n - 1))
          {
            frs = sed
            sed = result
            result = frs + sed
          }
          result
      }
    }
}