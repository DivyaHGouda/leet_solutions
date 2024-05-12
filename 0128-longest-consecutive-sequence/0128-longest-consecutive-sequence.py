class Solution(object):
    def longestConsecutive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums)==0:
            return 0
        c=1
        d=1
        nums.sort()
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]+1:
                c+=1
            elif nums[i]!=nums[i-1]:
                d=max(d,c)
                c=1
        return max(d,c)