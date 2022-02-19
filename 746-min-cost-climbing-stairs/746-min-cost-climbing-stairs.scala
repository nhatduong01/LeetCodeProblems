object Solution {
    def minCostClimbingStairs(cost: Array[Int]): Int = 
    {
    var myArray = cost.clone()
    for( index <- (0 until cost.length - 2).reverse)
      {
        myArray(index) = math.min(myArray(index + 1),myArray(index + 2)) + myArray(index)
      }
    math.min(myArray(0), myArray(1))    
    }
}