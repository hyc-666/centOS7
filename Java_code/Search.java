public class Search{
    public static void main(String[] args){
        int[] arr = new int[10000];
        for(int i = 0;i<arr.length;i++){
            arr[i] = i;
        }
        //System.out.println(search(arr,-1));
        System.out.println(binarySearch(arr,-1));
    }
    /*public static int search(int[] arr,int x){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] ==x)
                return i;
        }
        return -1;

    }
    */
    
    public static int binarySearch(int[] arr,int x){
        int left = 0;
        int right = arr.length - 1;
        while(left<=right){
            int mid = (left + right)>>1;
            if(x<arr[mid])
                right = mid - 1;
            else if(x>arr[mid])
                left = mid + 1;
            else
                return mid;
        }
        return -1;
    }

}
