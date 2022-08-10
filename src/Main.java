public class Main {
    public static void main(String[] args) {
        int[] array = {1,4,6,8,9,15,36,41,79,99};
        int left = 0;
        int right = array.length -1 ;
        int value = 0;

        int check = binarySearch ( array,left,right,value);
        System.out.println(check);
    }
    public static int binarySearch(int[] array, int left, int right, int value ){
        if (left>right)return  -1;
        int mid = (left+right)/2;
        if (value == array[mid])return mid;
        else if (value >array[mid])return binarySearch(array,mid+1,right,value);
        else return binarySearch(array,left,mid-1,value);
    }
}