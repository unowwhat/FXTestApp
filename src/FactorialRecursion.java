public class FactorialRecursion {

    private static int factorial(int n){
        if (n>1) return n * factorial(n-1);
        else return n;
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println(factorial(a));
    }
}
