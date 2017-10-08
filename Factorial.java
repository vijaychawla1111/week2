public class Factorial {

    // return n!, assuming n >= 0
    public static long factorial(int n) {
        long product = 1;
        for (int i = 1; i <= n; i++)
            product = product * i;
        return product;
    }

    public static void main(String[] args) { 
        int n = Integer.parseInt(args[0]);
        System.out.println(factorial(n));
    }

}
