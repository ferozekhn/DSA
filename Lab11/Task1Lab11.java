public class Task1Lab11{
        int indx=0;

    
        // create an array
        int arr[];
        // constructor
        public Task1Lab11(int data) {
        // initialize an array
         arr= new int[data];
        }
        public void insert(int data) {
        // insert data in array in any order
        if(indx< arr.length){   
        arr[indx]=data;
        indx++;
        }
        // handle all possible exceptions/errors
        }

        public int extractMax() {
        // return and remove max value from array 
        // handle all possible exceptions/errors
        int a=0;
        for (int i = 0; i < indx; i++) {
            if (i==0) {
                a = arr[i];
            }
            if (a<arr[i+1]) {
                a=arr[i+1];
            }
            
        } 
        int count=0;
        for (int i = 0; i <=indx; i++) {
            count++;
            if (a==arr[i]) {
                arr[i]=0;   
                indx--;
                break; 
            }
            
        }
        for (int i =count-1 ; i <= indx; i++) {
             arr[i]=arr[i+1];
        }
        return a;
        
    }
           
        public int getMax() {
        // just return max value from array
        // handle all possible exceptions/errors
        int a=0;
        for (int i = 0; i < arr.length-1; i++) {
            if (i==0) {
                a = arr[i];
            }
            if (a<arr[i+1]) {
                a=arr[i+1];
            }
            
        }
        return a;
        }
        public boolean searchData(int data) {
         // search data from array
        for (int i = 0; i <=indx; i++) {
            if (arr[i] == data) {
                return true;
            }
        }
        return false;
        // handle all possible exceptions/errors
        }
       
public static void main(String[] args) {

Task1Lab11 lab11 = new Task1Lab11(10);

lab11.insert(10);
lab11.insert(5);
lab11.insert(8);
lab11.insert(15);
lab11.insert(6);
lab11.insert(9);
System.out.println(" : : "+lab11.arr[3]);

System.out.println("Extracted maximum value is: " + lab11.extractMax());
System.out.println(" : : "+lab11.arr[3]);
System.out.println(" : : "+lab11.arr[4]);
System.out.println(" : : "+lab11.arr[5]);
System.out.println("Maximum value is  in array : " + lab11.getMax());
System.out.println("Search for 4 in array: " + lab11.searchData(4));


}
}