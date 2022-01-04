/**
 * @param {number[][]} mat
 * @param {number} r
 * @param {number} c
 * @return {number[][]}
 */
var matrixReshape = function(mat, r, c) 
{
    let row = 0, column = 0;
    if(r*c != mat.length * mat[0].length)
      return mat
    let result = []
    for (let i = 0; i < r; i++)
    {
      let temp = [];
      for(let j = 0; j < c; j++)
      {
        temp.push(mat[row][column++])
        if(column == mat[0].length)
        {
          column = 0;
          row++;
        }
      }
        result.push(temp)
    }
    return result
};