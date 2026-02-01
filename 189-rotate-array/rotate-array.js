/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
  k = k % nums.length
  var new_array = new Array(nums.length)
  new_array = nums.slice(nums.length - k, nums.length)
  new_array.push(...nums.slice(0, nums.length - k))
  for (let i = 0; i < nums.length; i++) {
    nums[i] = new_array[i];
  }
};