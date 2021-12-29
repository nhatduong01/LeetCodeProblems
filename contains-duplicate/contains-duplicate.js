/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {

  let storage = []
  for (let i = 0; i < nums.length; i ++)
  {
    if(storage.includes(nums[i]))
    {
      return true
    }
      storage.push(nums[i])
  }
  return false;
};