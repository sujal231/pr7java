import java.util.Scanner;

import javax.lang.model.element.Name;

class pr{
    
    public static void main(String[] args) {
    
    
        
        Shape shape = new Rectangle();
        shape.read("Rectangle");
        shape.show();
        shape.shows();


        shape = new Circle();
        shape.read("Circle");
        shape.show();
        shape.shows();
        

    
    }

}
abstract class Shape{

    String s;
    int l,w,ans;
    final double pi=3.14;
    double r;
    double ans1;
    
    public void read(String s) 
    {
        this.s=s;  
    }
    public void show() 
    {
        System.out.println(s);
    }
    abstract void shows();
}

class Rectangle extends Shape{

    
    void shows()
    {   
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length= ");
        l= sc.nextInt();
        System.out.print("Enter Width= ");
        w =sc.nextInt();
        ans = l*w;
        System.out.println("ans= "+ans);
        System.out.println();
    }


} 
class Circle  extends Shape{


    void shows()
    {



        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Radius= ");
        r = sc.nextDouble();
        ans1 = pi*r*r;
        System.out.println("Circle= "+ans1);
    }


}