public class Tarea {

    public static void main(String[] args) {
        int sp=0, si=0, i;
        i = 1;
        while(i <=50) {
        	
             i+=1;
             
        	if(i%2==0)
            {
             sp=sp+i;  //sp =2; 
            }
             else{ 
             si=si+i;
            }
        
        }   
        
        System.out.println("Suma de pares es:" +sp);
        System.out.println("Suma de impares es:"  +si);
                               
    }   
}