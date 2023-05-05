

package com.mycompany.extracredit2;


public class ExtraCredit2 {
    /*
    This is TimeComplexity: O(n)
    I dont think it possible to do better than a linear solution
    */
    public static double getSum(int[] a){
        int max1 = a[0], max2 = 0, min1 = a[0], min2 = 0;
      
        for(int i = 1; i < a.length; i++){
            
           if(a[i] > max1){
               max2 = max1;
               max1 = a[i];
           }else if(a[i] > max2){
               max2 = a[i];
           }
           
           if(a[i] < min1){
               min2 = min1;
               min1 = a[i];
           }else if(a[i] < min2){
               min2 = a[i];
           }
        }
        
        System.out.println("1st Max value is: " + max1);
        System.out.println("2nd Max Value is: " + max2);
        System.out.println("1st Min value is: " + min1);
        System.out.println("2nd Min Value is: " + min2);
        return (double)(max1+max2)/(min1+min2);
    }
    
    
    
    public static void main(String[] args) {
        
        int[] arr = {3,5,12,450,1,1,5,6,23,6,8,9,321,2,3};
        System.out.println("The ratio is: " +getSum(arr));
        
    }
}
