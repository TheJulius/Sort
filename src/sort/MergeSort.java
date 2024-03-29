package sort;

public class MergeSort {
	
	protected static int count;
	
	void merge(int arr[], int beg, int mid, int end)  
	{  
	  
	int l = mid - beg + 1;  
	int r = end - mid;  
	  
	int intLeftArray[] = new int [l];  
	int intRightArray[] = new int [r];  
	  
	for (int i=0; i<l; ++i)  
	intLeftArray[i] = arr[beg + i];  
	  
	for (int j=0; j<r; ++j)  
	intRightArray[j] = arr[mid + 1+ j];  
	  
	  
	int i = 0, j = 0;  
	int k = beg;  
	
	while (i<l&&j<r)
	{
		count++;
	if (intLeftArray[i] <= intRightArray[j])  
	{  
	arr[k] = intLeftArray[i];  
	i++;  
	}  
	else  
	{  
	arr[k] = intRightArray[j];  
	j++;  
	}  
	k++;  
	}  
	while (i<l)  
	{  
	arr[k] = intLeftArray[i];  
	i++;  
	k++;  
	}  
	  
	while (j<r)  
	{  
	arr[k] = intRightArray[j];  
	j++;  
	k++;  
	}  
	}  
	  
	void sort(int arr[], int beg, int end)  
	{	
	if (beg<end)  
	{
	int mid = (beg+end)/2;  
	sort(arr, beg, mid);  
	sort(arr , mid+1, end);  
	merge(arr, beg, mid, end);  
	}  
}
}