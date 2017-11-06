package vraag2;

import java.math.BigInteger;

public class vraag2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BigInteger product = BigInteger.valueOf(1);
        for(int e = 1; e <= 100; e++) {
        	product = product.multiply(BigInteger.valueOf(e));
        }
        
        System.out.println(product);
	}

}
