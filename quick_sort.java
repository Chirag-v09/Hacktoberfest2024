import java.util.*;
class quick_sort
{
    //This is the recursive function that implements quicksort algorithm.
    void quicksort(int array[],int left,int right)
    {
        int left1 = left;
        int right1 = right;
      //I have taken the leftmost element as the pivot for the quicksort.
        int pivot = array[left];
        
        while(left<right)
        {
            while((array[right]>=pivot)&&(left<right))
            right--;
            if(left!=right)
            {
                array[left] = array[right];
                left++;
            }
            while((array[left]<=pivot)&&(left<right))
            left++;
            if(left!=right)
            {
                array[right]=array[left];
                right--;
            }
        }
            array[left] = pivot;
            pivot = left;
            left = left1;
            right = right1;
            //Calling the quicksort function with the divided arrays.
            if(left<pivot)
            quicksort(array,left,pivot-1);
            if(pivot<right)
            quicksort(array,pivot+1,right);
        }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i =0;i<n;i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("The array initially is - \n");
        for(int i =0;i<n;i++)
        {
            System.out.print(array[i]+" ");
        }
        
        System.out.println("\nThe array after sorting is \n");
        quick_sort q = new quick_sort();
        q.quicksort(array,0,n-1);
        for(int i =0;i<n;i++)
        {
            System.out.print(array[i]+" ");
        }

    }
}
