package ie.atu;

public class Calculator {
    public int add(int FirstNum, int SecondNum){
        if(FirstNum>=Integer.MAX_VALUE || SecondNum>=Integer.MAX_VALUE){
            throw new ArithmeticException("Number too large");
        }
        int result=FirstNum+SecondNum;
        return result;
    }
    public int sub(int FirstNum, int SecondNum){
        if(FirstNum>=Integer.MAX_VALUE || SecondNum>=Integer.MAX_VALUE){
            throw new ArithmeticException("Number too large");
        }
        int result=FirstNum-SecondNum;
        return result;
    }
    public long mul(int FirstNum, int SecondNum){
        if(FirstNum*SecondNum>=Integer.MAX_VALUE){
            throw new ArithmeticException("Number too large");
        }
        long result=FirstNum*SecondNum;
        return result;
    }
    public float div(int FirstNum, int SecondNum){
        if(FirstNum==0 || SecondNum==0){
            throw new ArithmeticException("Cannot perform operation with '0'");
        }
        float result=FirstNum/SecondNum;
        return result;
    }
}
