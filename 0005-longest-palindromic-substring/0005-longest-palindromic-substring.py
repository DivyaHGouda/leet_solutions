class Solution(object):
    def longestPalindrome(self, s):
        s1=""
        res=0
        for i in range(len(s)):
            l,r=i,i
            while l>=0 and r<len(s) and s[l]==s[r]:
                if(res<r-l+1):
                    res=r-l+1
                    s1=s[l:r+1]
                r+=1
                l-=1
            l,r=i,i+1
            while l>=0 and r<len(s) and s[l]==s[r]:
                if(res<r-l+1):
                    res=r-l+1
                    s1=s[l:r+1]
                r+=1
                l-=1
        return s1
        