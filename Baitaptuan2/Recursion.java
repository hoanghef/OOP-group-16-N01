public class Recursion{
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public stactic void main(String[] args){
        int number =10;
        System.out.println(factorial(number));
    }
}