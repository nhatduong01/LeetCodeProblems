/**
 * @param {number} n
 * @return {string[]}
 */
function addNextParenthesis(open, close, curr_string) {
  if (open == close) {
    if (open == 1)
      return [curr_string + "()"]
    return [...addNextParenthesis(open - 1, close, curr_string + "(")]
  }
  if(open == 0)
    return [curr_string + (")".repeat(close))]
  return [...addNextParenthesis(open - 1, close, curr_string + "("), ...addNextParenthesis(open, close - 1, curr_string + ")")]
};

var generateParenthesis = function(n) {
   return addNextParenthesis(n, n, "") 
};