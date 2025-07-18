
class calculator1 {
    int add(int a, int b)
    {
        return a+b;
    }
    int add(int a, int b, int c )
    {
        return a+b+c;
    }
    double add(double a, double b)
    {
        return a+b;
    }
    public class OverloadingExample{
    public static void main(String[] args) {
        calculator1 calc= new  calculator();
        System.out.println("Add(2,3):" + calc.add(2,3));
         System.out.println("Add(2,3,4):" + calc.add(2,3,4));
          System.out.println("Add(2.5,3.5):" + calc.add(2.5,3.5));
    }
        
    }
}