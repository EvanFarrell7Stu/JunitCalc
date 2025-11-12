package ie.atu;

public class Calculator {
    public int add(int FirstNum, int SecondNum){
        if(FirstNum>=Integer.MAX_VALUE || SecondNum>=Integer.MAX_VALUE){
            throw new ArithmeticException("Number cannot be greater than or equal to Integer.MAX_VALUE");
        }
        int result=FirstNum+SecondNum;
        return result;
    }
    public int sub(int FirstNum, int SecondNum){
        if(FirstNum<=Integer.MIN_VALUE || SecondNum<=Integer.MIN_VALUE){
            throw new ArithmeticException("Number cannot be less than or equal to Integer.MIN_VALUE");
        }
        int result=FirstNum-SecondNum;
        return result;
    }
    public long mul(int FirstNum, int SecondNum){
        long result= (long)FirstNum * SecondNum;
        if(result>=Integer.MAX_VALUE ){
            throw new ArithmeticException("Values too large for multiplication");
        }

        return result;
    }
    public float div(int FirstNum, int SecondNum){
        if(FirstNum>=Integer.MAX_VALUE|| SecondNum>=Integer.MAX_VALUE){
            throw new ArithmeticException("Number cannot be greater than or equal to Integer.MAX_VALUE");
        }
        if(SecondNum==0){
            throw new ArithmeticException("Cannot perform operation with '0'");

        }

        float result=FirstNum/SecondNum;
        return result;
    }
}
