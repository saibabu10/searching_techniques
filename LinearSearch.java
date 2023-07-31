public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        int N = arr.length;
        int target = 7;
        for(int ind=0;ind<N;ind++)
        {
            if(arr[ind]==target)
            {
                System.out.println("element found in "+ind+" position");
            }
        }
    }
}
