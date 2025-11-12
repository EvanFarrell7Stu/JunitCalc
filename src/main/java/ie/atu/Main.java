package ie.atu;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int total=calc.add(Integer.MAX_VALUE,2);
        //int total2=calc.addExact(Integer.MAX_VALUE,2);
        System.out.println(total);
    }
}