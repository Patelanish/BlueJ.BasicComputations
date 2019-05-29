 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int num1 = (integers[0] > integers [1]) ? integers [0] : integers[1];
        int num2 = (num1 > integers[2]) ? num1 : integers[2];
        return num2;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int num1 = Math.max(integers [0], integers[1]);
        int num2 = Math.max(num1, integers[2]);
        return num2;
    }
}
