 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        BigInteger result = new BigInteger("1"); 
        for (int i=2; i<= value; i++)
        result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

}

