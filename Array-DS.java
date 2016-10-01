import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();

        int[] arr = new int[arraySize];

        for(int i=0; i<arraySize; i++) {
            
            arr[i] = sc.nextInt();
        }
        
        for (int i=arraySize-1; i>=0; i--) {
            
            System.out.print(arr[i] + " ");
        }
    }
}