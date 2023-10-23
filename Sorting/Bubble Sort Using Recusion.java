package Sorting;

class Solution
{
	public static void bubbleSort(int arr[], int n)
    {
        task(arr,0,n);
    }
    public static void task(int arr[], int i, int n)
    {
        if(i==n-1)
        {
            return;
        }
        task1(arr,i,0,n);
        task(arr,i+1,n);
    }
    public static void task1(int arr[], int i, int j, int n)
    {
        if(j==n-1-i)
        {
            return;
        }
        if(arr[j]>arr[j+1])
        {
            int dup=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=dup;
        }
        task1(arr,i,j+1,n);
    }
}