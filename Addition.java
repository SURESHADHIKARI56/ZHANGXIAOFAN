
public class Addition {
        int add(){
            int a=10;
            int b=20;
            return a+b;
        }
        int add(int a,int b){
            return a+b;
        }
        float add(float a,float b){
            return a+b;
        }
        public static void main(String[] args){
            Addition obj=new Addition();
            System.out.println("Addition of two numbers is: "+obj.add());
            System.out.println("Addition of two numbers is: "+obj.add(10,20));
            System.out.println("Addition of two numbers is: "+obj.add(10.5f,20.5f));
        }
    }

