
class Solution(object):
    def sortArray(self, nums):
        def quicksort(l, r):
            if l >= r:
                return
            pivot = nums[random.randint(l, r)]
            li, ri = l, r
            while li <= ri:
                if nums[li] >= pivot > nums[ri] or nums[li] > pivot >= nums[ri]:
                    nums[li], nums[ri] = nums[ri], nums[li]
                li += (nums[li] <= pivot)
                ri -= (nums[ri] >= pivot)

            quicksort(l, ri)
            quicksort(li, r)

        quicksort(0, len(nums)-1)
        return nums