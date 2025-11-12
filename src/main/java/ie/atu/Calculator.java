package ie.atu;

public class Calculator {
    public int add(int FirstNum, int SecondNum){
        if(FirstNum>=Integer.MAX_VALUE || SecondNum>=Integer.MAX_VALUE){
            throw new ArithmeticException("number too large");
        }
        int result=FirstNum+SecondNum;
        return result;
    }
}
