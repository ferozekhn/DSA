import java.util.*;
class Fact{
   static double startTime ;
   static  double endTime  ;
   static double startTime1 ;
   static  double endTime1  ;
    public static int fctrl(int n){
         startTime1 = System.nanoTime();	//record the starting time 
           if (n==1) {
            return 1;
           }
         endTime1  = System.nanoTime();	//record the ending time
         return n*fctrl(n-1);

       }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer .It is a limit of factorial number in iterative approach : ");
        int n=sc.nextInt();
      System.out.println("Here I use iterative approach to print factorial mumber .");
      // iterative approach
      int sum=1;
      System.out.print(n+"!"+"  is  = ");
  for (int i = 1; i <=n; i++) {
       startTime = System.nanoTime();	//record the starting time 
         sum*=i;  
         System.out.print(i);

         if (i!=n) 
        System.out.print(" * ");
        endTime   = System.nanoTime();	//record the ending time
      }
      double totalTime = endTime - startTime;
      System.out.print(" = "+sum);



//recursive approach
System.out.println();
System.out.println("Enter an integer .It is a limit of factorial number in recursive approach : ");
int n1=sc.nextInt();
System.out.println("Here I use recursive approach to print factorial mumber .");
System.out.println("factorial of "+n1+" = "+fctrl(n1));
double totalTime1 = endTime1 - startTime1;

if (totalTime<totalTime1) {
    System.out.println("iterative approach to take less time to recursive approach.");
    
}else{
    System.out.println("iterative approach to take more time to recursive approach.");
    
}





    }

}