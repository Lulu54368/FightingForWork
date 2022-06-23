class Solution(object):
    def reverse(self, x):
        MIN = -2147483648
        MAX = 2147483647
        neg = 0
        if x < 0:
            neg = 1
            x *= -1
        result = 0
        while x != 0:
            result *= 10
            result += (x%10)
            x = x//10
            if neg== 0 and result > MAX:
                return 0
        if neg == 1:
            result *= -1
            if result < MIN:
                return 0
        return result
            
            
        