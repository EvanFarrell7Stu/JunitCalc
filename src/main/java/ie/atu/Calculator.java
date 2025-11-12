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
    public long mul(long FirstNum, long SecondNum){
        if(FirstNum*SecondNum>=Integer.MAX_VALUE ){
            throw new ArithmeticException("Values too large for multiplication");
        }
        int result= Math.toIntExact((int) FirstNum * SecondNum);
        return result;
    }
    public float div(int FirstNum, int SecondNum){
        if(FirstNum>=Integer.MAX_VALUE|| SecondNum>=Integer.MAX_VALUE){
            throw new ArithmeticException("Number cannot be greater than or equal to Integer.MAX_VALUE");
        }
        if(FirstNum==0 || SecondNum==0){
            throw new ArithmeticException("Cannot perform operation with '0'");

        }

        float result=FirstNum/SecondNum;
        return result;
    }
}
