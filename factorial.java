public class factorial{
    public static void main(String[] args){
        int num=1;
        while(num<=10){
            int Fact=1;
            int i=1;
            while(i<=num){
                Fact=Fact*i;
                i++;
            }
            System.out.println("Factorial of " + num + " is: " + Fact);
            num++;
        }
    }
}