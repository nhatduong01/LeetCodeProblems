class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        # Handle overflow case
        INT_MIN, INT_MAX = -2**31, 2**31 - 1
        
        # Determine the sign of the result
        sign = -1 if (dividend < 0) ^ (divisor < 0) else 1
        
        # Work with absolute values to simplify calculations
        dividend, divisor = abs(dividend), abs(divisor)
        
        quotient = 0
        
        # Perform the division using bit manipulation
        for i in range(31, -1, -1):
            if (dividend >> i) >= divisor:
                quotient |= 1 << i
                dividend -= divisor << i
        
        # Apply the sign to the result
        result = sign * quotient
        
        # Clamp the result within the 32-bit signed integer range
        return max(min(result, INT_MAX), INT_MIN)
        