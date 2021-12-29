/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function s (s) {
    let result = [0]
    let stack  = []
    let location = {}
    let curr = 0
    for (let i = 0; i < s.length; i ++)
        {
            if(stack.includes(s[i]))
            {
              if(!result.includes(curr))
                result.push(curr)
              curr = 1;
              i = location[s[i]] + 1
              location = {}
              location[s[i]] = i
              stack = [];
              stack.push(s[i]);
            }
            else
            {
              location[s[i]] = i
              curr++;
              stack.push(s[i])
            }
            if(i === s.length - 1 && !result.includes(curr))
                result.push(curr)
        }
    return Math.max.apply(Math, result);
};
