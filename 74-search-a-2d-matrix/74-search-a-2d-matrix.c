

int findRow(int** matrix, int target, int low, int high)
{
  if(high < low)
    return low;
  int middle = (high+ low) /2;
  if (matrix[middle][0] == target )
    {
      return middle;
    }
  else if (matrix[middle][0] > target)
    return findRow(matrix ,target, low, middle -1);
  else 
  {
    if((middle + 1 <= high))
      {
        if (matrix[middle + 1][0] > target)
          return middle;
        else return findRow(matrix, target, middle +1, high);
      }
    else return middle;
  }
}
bool binarySearch(int myArray[], int target, int low, int high)
{
  int middle = (low + high ) / 2;
  if(myArray[middle] == target) return true;
  if (low > high)
    return false;
  if(myArray[middle] > target)
    return  binarySearch(myArray, target, low, middle -1);
  else
    return binarySearch(myArray, target, middle +1, high);  
}
bool searchMatrix(int** matrix, int matrixSize, int* matrixColSize, int target)
{
  int row = findRow(matrix,target, 0, matrixSize - 1);
    printf("%d\n", row);
  return binarySearch(matrix[row], target, 0, matrixColSize[row] - 1);
}