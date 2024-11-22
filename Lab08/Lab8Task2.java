public class Lab8Task2 {
    int i=0,num=0;
     void Palindrome(String s){
        int size=s.length();
        
        if (s.charAt(i)==s.charAt(size-1)) {
            i++;
            size--;
            if (size/2>num) {
                num++;
            
            Palindrome( s);
            }
        }else{
        if (num==size-1) {
            System.out.println("it is palindrome");
            
        }else{
            System.out.println("it is not palindrome");
        }
    }
    }
    
    
    
    
    public static void main(String[] args) {
       String s="racecar";
       Lab8Task2 l2=new Lab8Task2();
       l2.Palindrome(s);
    }
    
}
