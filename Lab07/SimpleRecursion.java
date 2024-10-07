import java.util.Scanner;

class SimpleRecursion{

//   public static  void UpToN(int n){
//         if(n>1)
//         UpToN(n-1);
//         System.out.print(n+" ");

//     }

public static  void UpToLastIndex(char arr[] ,int i){

         if(i<arr.length-1)
            UpToLastIndex(arr,i+1);
            System.out.print(arr[i]+" ");
    
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter any integer :");
        // int N=sc.nextInt();
        // UpToN(N);
        char arr[]={'a','b','c','d','e','f','g','h'};
        UpToLastIndex(arr,0);

    }
}