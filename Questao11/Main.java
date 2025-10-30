public class Main
{
	public static void main(String[] args) {
	    
	    int[] A = {1,2,3,4,5,6,7,8,9,0};
	    
	    int nPares = 0;
	    
	    for (int i = 0; i < A.length; i++) {
	        
	        if (A[i] % 2 == 0) {
	            nPares++;
	        } 
	        
	    }
	    
	    System.out.print("numeros pares: " + nPares);
		
	}
}
