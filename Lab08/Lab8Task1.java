public class Lab8Task1 {

    static String DtoBinary(int n){
        if (n == 0 || n == 1) {
           return String.valueOf(n); 
        } else {
            int r = n % 2;
             n = n / 2;
            return DtoBinary(n) + r;  // Recursive call appends the remainder
        }
    }
    

//    static string DtoBinary(int n){
//         if (n==1) {
//            return "1";
//         }else{
//         result+=DtoBinary(n/2);
//             result+=n%2
//         return result;
    
//         }
//     }

//     static void DtoBinary(int n){
//     if (n==1||n==0) {
//        System.out.print(n+" ");
//     }else{
//     int r= n%2;
//     n=n/2;
//      DtoBinary(n);
//      System.out.print(r+" ");

//     }
// }

    
    
    public static void main(String[] args) {
      //  System.out.println(DtoBinary(13)+" ");
     System.out.print( DtoBinary(13));
      
    }
}
