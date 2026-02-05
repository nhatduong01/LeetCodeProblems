/**
 * @param {number[][]} grid
 * @return {number}
 */
var minPathSum = function(grid) {
  const m = grid.length;
  const n = grid[0].length;

  const memo = Array.from({ length: m }, () => Array(n));

  for (let i = 0; i < m; i++) {
    for (let j = 0; j < n; j++) {
      if (i === 0 && j === 0) {
        memo[i][j] = grid[i][j];
      } else if (i === 0) {
        memo[i][j] = grid[i][j] + memo[i][j - 1];
      } else if (j === 0) {
        memo[i][j] = grid[i][j] + memo[i - 1][j];
      } else {
        memo[i][j] = grid[i][j] + Math.min(
          memo[i - 1][j],
          memo[i][j - 1]
        );
      }
    }
  }

  return memo[m - 1][n - 1];
}