// import java.util.Scanner;
// public class Sorting{
    
//     //  public static void slectionSort(int arr[],int n){
//     //     for (int i = 0; i < arr.length-1; i++) {
//     //         int minpos=i;
//     //         for (int j = i+1; j < arr.length-1; j++) {
//     //             if (arr[minpos]>arr[j]) {
//     //                 minpos=j;
//     //             }
//     //             int temp=arr[minpos];
//     //             arr[minpos]=arr[i];
//     //             arr[i]=temp;
//     //         }
//     //     }


//     //  }
    
    
    
    
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int arr[]={4,3,5,1,2};
//         int arr1[]={6,8,10,9,7};
    
// //slection sort algorithm
//       for (int i = 0; i < arr.length; i++) {
//             int minpos=i;
//             for (int j = i+1; j < arr.length; j++) {
//                 if (arr[minpos]>arr[j]) {
//                     minpos=j;
//                 }
//             }
//                 int temp=arr[minpos];
//                 arr[minpos]=arr[i];
//                 arr[i]=temp;
            
//         }
   
//         System.out.print("output of slection sort algorithm: ");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }

// //insertion sort algorithm

//     for(int i=1; i<arr1.length; i++) {
//     int curr = arr1[i];
//     int prev = i-1;
//     int temp =0;
//     //finding out the correct pos to insert
//     while(prev >=0 && arr1[prev] > curr){
//     arr1[prev+1] = arr1[prev];
//     prev --;
//     }
//     //insertion
//     arr1[prev+1] = curr;
//     }

// System.out.println();
// System.out.print("output for insertion  sort algorithm: ");
// for (int i = 0; i < arr1.length; i++) {
//     System.out.print(arr1[i]+" ");
// }
 
 
//     }
// }
