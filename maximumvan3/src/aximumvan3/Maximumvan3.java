package aximumvan3;

public class Maximumvan3 {
	/**
	 * returns the maximum of the given numbers  
	 * @post The result equals one of the given numbers 
	 * |result==i||result==j||result==k
	 * @post the result is not equal to or bigger then the given numbers
	 * | i<=result && j<=result §§ k<=result 
	 */
	

	public static int maximumvan3(int i, int j, int k) {
		if (i<j) {
			if (j<k) {
						return k;
				
					}
					else {
						return j;
								
					}
				
				}
		else {
			if (i>k) {return i;
					
					}
					else {
					return k;
					}
			}
		}
}
	
	
			

		

	
	


