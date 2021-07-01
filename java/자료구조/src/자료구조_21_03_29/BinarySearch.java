package src.자료구조_21_03_29;

public class BinarySearch {
    public static int binsearch(int arr[], int key, int left, int rigth){
        int mid;
        if(left < rigth){
            mid = (left + rigth) / 2;
            if(key == arr[mid])return arr[mid];
            else if(key < arr[mid])return(binsearch(arr, key, left, mid));
            else return(binsearch(arr, key, mid, rigth));
        }
        else return 0;
    }
    public static void main(String[] args){
        int[] arr = {1, 3, 4, 6, 7, 9, 10, 15, 17, 20};
        System.out.println(binsearch(arr, 20, 0, arr.length));
    }
}
