public class SimpleClass{

     public static void main(String []args){
        
       fuzz();
     }
     
     
    public static void fuzz() {
    
        for(int i=1;i<=100;i++) {
            if (i%15==0)  { 
                System.out.println("FizzBuzz");
                continue;}
            
            if (i%5 == 0) { 
                System.out.println("Buzz");
                continue;}
            
            if (i%3==0) { 
                System.out.println("Fizz");
                continue;}
                
            else { 
                System.out.println(i); 
                continue;
            }
        }
  	}
}
