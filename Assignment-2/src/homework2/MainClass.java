/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

/**
 *
 * @author mhtkarakose
 */
public class MainClass {
    
     public static int[] doSelectionSort(int[] arr){  
          
        for (int i = 0; i < arr.length - 1; i++) 
        { 
            int index = i; 
            for (int j = i + 1; j < arr.length; j++) 
                if (arr[j] < arr[index]) 
                    index = j; 
       
            int smallerNumber = arr[index];  
            arr[index] = arr[i]; 
            arr[i] = smallerNumber; 
        } 
        return arr; 
    } 
    public int doBinarySearch(int[] inputArr, int key) {
         
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
      public static long durationdoSelectionSort(int[] a){ 
        
       long startTime = System.nanoTime(); 
        doSelectionSort(a); 
        long endTime = System.nanoTime(); 
         
        long duration = (endTime - startTime); 
        //System.out.println(duration+ " duration"); 
        return duration; 
    }    
     public static long durationHeapSort(int[] a){
        long startTime = System.nanoTime(); 
        HeapSort.sort(a);
        long endTime = System.nanoTime(); 
         
        long duration = (endTime - startTime); 
        //System.out.println(duration+ " duration"); 
        return duration; 
     }
     public static long durationdoBinarySearch(int[] a , int key ){
        long startTime = System.nanoTime(); 
        MainClass homework2 = new MainClass();
        homework2.doBinarySearch(a, key);
        long endTime = System.nanoTime(); 
         
        long duration = (endTime - startTime); 
        //System.out.println(duration+ " duration"); 
        return duration; 
     }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] dizi = new int[1000]; //    n=1000 
        int[] dizi2 = new int[10000]; //  n=10000 
        int[] dizi3 = new int[100000]; // n=100000 
        
        for (int i = 0; i < dizi.length; i++) { 
            dizi[i] = (int) (Math.random() * 100);      
        }// end for 
        long n1000SelectionSort =   durationdoSelectionSort(dizi);
        long n1000HeapSort      =   durationHeapSort(dizi);
        long n1000BinarySearch  =  durationdoBinarySearch(dizi,500);
        
        System.out.println("n=1000 Selection Sort :"+n1000SelectionSort);  
        System.out.println("n=1000 Heap Sort :"+n1000HeapSort); 
        System.out.println("n=1000 Binary Search :"+n1000BinarySearch); 
        
        for (int i = 0; i < dizi2.length; i++) { 
            dizi2[i] = (int) (Math.random() * 100);      
        }// end for 
        
        long n10000SelectionSort =   durationdoSelectionSort(dizi);
        long n10000HeapSort      =   durationHeapSort(dizi);
        long n10000BinarySearch  =  durationdoBinarySearch(dizi,500);
        System.out.println("");
        System.out.println("n=1000 Selection Sort :"+n10000SelectionSort);  
        System.out.println("n=1000 Heap Sort :"+n10000HeapSort); 
        System.out.println("n=1000 Binary Search :"+n10000BinarySearch); 
        
        for (int i = 0; i < dizi3.length; i++) { 
            dizi3[i] = (int) (Math.random() * 100);      
        }// end for 
        
        long n100000SelectionSort =   durationdoSelectionSort(dizi);
        long n100000HeapSort      =   durationHeapSort(dizi);
        long n100000BinarySearch  =  durationdoBinarySearch(dizi,500);
        System.out.println("");
        System.out.println("n=1000 Selection Sort :"+n100000SelectionSort);  
        System.out.println("n=1000 Heap Sort :"+n100000HeapSort); 
        System.out.println("n=1000 Binary Search :"+n100000BinarySearch); 
        
        
    }
    
}
