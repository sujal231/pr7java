import java.util.Scanner;

import javax.lang.model.element.Name;

class pr{

    public static void main(String[] args) {

        Bank  bank = new SBI();

        bank.SetRate("SBI");
        bank.getRate();
        bank.getRateOfInterest();

        bank = new icic();

        bank.SetRate("ICIC");
        bank.getRate();
        bank.getRateOfInterest();

        bank = new AXIS();

        bank.SetRate("AXIS");
        bank.getRate();
        bank.getRateOfInterest();
    }
}

abstract class Bank
{


    double  p,r,t,i;
    String s;   
    public void SetRate(String s)
    {
       this.s=s;
    }
    public void getRate()
    {
        System.out.println(s);
    
    }

    abstract void getRateOfInterest();
}

class SBI extends Bank
{
    void getRateOfInterest()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal =");
        p = sc.nextDouble();
        System.out.print("Enter rate  =");
        r = sc.nextDouble();
        System.out.print("Enter time =");
        t = sc.nextDouble();
         
        i = (p*r*t)/100;

        System.out.println("Interest= "+i);
        System.out.println();


    }
}
class icic extends Bank{

    void getRateOfInterest()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal =");
        p = sc.nextDouble();
        System.out.print("Enter rate  =");
        r = sc.nextDouble();
        System.out.print("Enter time =");
        t = sc.nextDouble();
         
        i = (p*r*t)/100;

        System.out.println("Interest= "+i);
        System.out.println();


    }

}

class AXIS extends Bank
{

    void getRateOfInterest()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal =");
        p = sc.nextDouble();
        System.out.print("Enter rate  =");
        r = sc.nextDouble();
        System.out.print("Enter time =");
        t = sc.nextDouble();
         
        i = (p*r*t)/100;

        System.out.println("Interest= "+i);

    }
}
