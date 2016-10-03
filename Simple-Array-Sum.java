import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int arraySize = sc.nextInt();
        int[] arr = new int[arraySize];
        int sum = 0;
       
        for(int i = 0; i < arraySize; i++) {
            
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}