class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        results = []
        nums.sort()
        for idx in range(len(nums)):
            if idx > 0 and nums[idx] == nums[idx - 1]:
                continue
            if nums[idx] > 0:
                break
            left = idx + 1
            right = len(nums) - 1
            while left < right:
                temp = nums[idx] + nums[left] + nums[right]
                if temp > 0:
                    right = right - 1
                elif temp < 0:
                    left = left + 1
                else:
                    results.append([nums[idx], nums[left], nums[right]])

                    left += 1
                    right -= 1
                    while left < right and nums[left] == nums[left - 1]:
                        left += 1
                    while left < right and nums[right] == nums[right + 1]:
                        right -= 1

        return results
