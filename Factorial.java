 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        int answer=1;
        for (int i=2; i<=value; i++)
            answer *= i;
        return BigInteger.valueOf(answer);    
    }

}
