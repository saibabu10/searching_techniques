public class BinarySearch {
    static int BinarySearching(int[] arr,int target)
    {
        int low = 0;
        int high = arr.length-1;
        boolean isAscending  = arr[low]<arr[high];
//        System.out.println(isAscending);
        while(low<=high)
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            //Ascending Order
            if(isAscending) {
                  if (arr[mid] < target) {
                    low = mid + 1;
                } else{
                    high = mid - 1;
                }
            }
            //Descending Order
            else {
                if(arr[mid]>target)
                {
                    low=mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        int target = 3;
        System.out.println( BinarySearching(arr,target)+1);
    }
}
