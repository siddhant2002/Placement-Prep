package Sorting;

class Solution
{
	int  select(int arr[], int i)
	{
	    int max=arr[i],pmax=i;;
	    for(int ind=i+1;ind<arr.length;ind++)
	    {
	        if(arr[ind]<max)
	        {
	            max=arr[ind];
	            pmax=ind;
	        }
	    }
	    int dup=arr[i];
	    arr[i]=arr[pmax];
	    arr[pmax]=dup;
	    return 1;
	}
	
	void selectionSort(int arr[], int n)
	{
	    for(int i=0;i<n;i++)
	    {
	        int val=select(arr,i);
	    }
	}
}