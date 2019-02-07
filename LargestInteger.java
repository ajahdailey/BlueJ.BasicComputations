 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int number = 0;
        for (int i = 0 ; i < integers.length; i++) {
            if (integers[i] > number ) {
                number = integers[i];
            }
    
        }
        return number; 
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int number = 0;
        for (int i=0 ; i <integers.length; i++) {
            number = Math.max(integers[i], number);
        }
        return number;
    }
}
