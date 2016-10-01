import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        
        int[] hourglasses = new int[16];
        int[][] arr = new int[6][6];
        
        Scanner sc = new Scanner(System.in);

        int k = 0;
        for(int i=0; i<6; i++) {
            
            for(int j=0; j<6; j++) {
                
               arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<4; i++) {
            
            for (int j=0; j<4; j++) {
                
                int sum = 0;
                sum = sum + arr[i][j]+arr[i][j+1]+arr[i][j+2];
                sum = sum + arr[i+1][j+1];
                sum = sum + arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                hourglasses[k]=sum;
                k++;
            }
        }
        
        int largest = hourglasses[0];
        for(int i=0;i<hourglasses.length;i++) {
            
            if(hourglasses[i]>largest){
                largest=hourglasses[i];
            }
        }
        System.out.println(largest);
    }
} 