import java.util.*;

public class StoreArray {
    
    public static int[] store_array(int n){

        int[] arr = new int[n];

        for(int i=0; i<n; i++){

            arr[i] = i+1;
        }
        return arr;
    } 

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enetr the size of array: ");
        int n = sc.nextInt();
        int[] output = store_array(n);

        for(int i=0; i<n; i++){
            System.out.println(output[i]);
        }
        sc.close();
    }
}
