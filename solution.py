import sys

nums = [10, 11, 21]
result = 0

temp = sum(nums) - max(nums)

if ((max(nums) - temp) <= 0):
	for i in nums:
		if (i != max(nums)):
			result += i
		else:
			result += 0	
else:
	print('-1')
	sys.exit(0)

print(result * 2)
