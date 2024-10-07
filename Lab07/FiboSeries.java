import java.util.Scanner;
class FiboSeries{

    static int count1=0;
      static int fabonic(int n){
        count1++;
        if (n==1||n==0) {
            return n;
        }
            int f1= fabonic(n-1);
            int f2=fabonic(n-2);
            int fn=f1+f2;
            return fn;
       }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer .It is a limit of fibo series: ");
        int n=sc.nextInt();
      System.out.println("Here I use iterative approach to print fibonacci series.");
      // iterative fibonacci series  
      int sum=0,a=0,b=1,count=0;
       for (int i = 1; i < n; i++) {
           count++;
        if (i>1&&sum<n) {
            a=b;
            b=sum;
            sum=b+a;
         System.out.print(" "+sum); 
     }else{
                sum=a+b;
                System.out.print(a+" "+b + " "+sum);

            }
            
       if (sum>n) {
        break;
       }
       
       
    }
        System.out.println();
      System.out.println("counter :" +count);
    
      System.out.print("Enter an integer .It is a limit of fibo series: ");
      int n1=sc.nextInt();
    System.out.println("Here I use recursive  approach to print fibonacci series.");
    // recurrsive fibonacci series  
//    System.out.print("0  "+"1  "+" "); 
    System.out.println(fabonic(n1));
      
      System.out.println();
      System.out.println("counter: "+count1);

      if (count<count1) {
        System.out.println();
        System.out.println("iterative approach takes a less time from recursive.");
        
      }
    }
    
}