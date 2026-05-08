def move_z(nums):
    j = 0#position for next non - zeroes
    for i in range(len(nums)):
        if nums[i] != 0:
            nums[j], nums[i] = nums[i], nums[j]
            j += 1
nums = [0, 1, 0, 3, 12]
c=move_z(nums)
print(nums) #[1, 2, 3, 12, 0, 0,]
