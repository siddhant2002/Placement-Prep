package Sorting;

class Solution {
    public int[] sortArray(int[] nums) {
        task(nums,0,nums.length-1);
        return nums;
    }
    public void task(int nums[] , int i, int j)
    {
        if(i<j)
        {
            int mid=i+(j-i)/2;
            task(nums,i,mid);
            task(nums,mid+1,j);
            task1(nums,i,mid,j);
        }
    }
    public void task1(int nums[], int start, int mid, int end)
    {
        int i=start,j=mid+1,k=0;
        int b[]=new int[end-start+1];
        while(i<=mid && j<=end)
        {
            if(nums[i]>nums[j])
            {
                b[k++]=nums[j++];
            }
            else
            {
                b[k++]=nums[i++];
            }
        }
        while(i<=mid)
        {
            b[k++]=nums[i++];
        }
        while(j<=end)
        {
            b[k++]=nums[j++];
        }
        for(int p=start;p<=end;p++)
        {
            nums[p]=b[p-start];
        }
    }
}