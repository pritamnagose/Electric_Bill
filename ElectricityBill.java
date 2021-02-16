import java.util.Scanner;
class ElectricityBill
{
  int units;
  String name,city;
  double bill,total=0;
  public void input()
  {
    
    
    Scanner sc=new Scanner(System.in);
    System.out.print("\n\n  Enter Your Name :                                          \t");
    name=sc.nextLine();
    boolean flag = true;
        for (int i = 0; i < name.length(); i++) 
        {
          char ch = name.charAt(i);
          if (!(ch >= 'a' && ch <= 'z'|| ch >= 'A' && ch <= 'Z')) 
          {
              flag = false;
          }
        }
        if(!flag)
        {
          System.out.println("Given string is a proper string is not a proper name.");
          input();
        }
    System.out.print("  Enter Your City :                                            \t");
    city=sc.nextLine();
    System.out.print("  Enter the  Unit :                                            \t");
    units=sc.nextInt();
    
  }
  public void calculate()
  {
    
    if(units>=1 && units<=50)
    {
      bill=1.50*units;
    }
    else if(units>=51 && units<=100)
    {
      bill=3.00*units;
    }
    else if(units>=101 && units<=200)
    {
      bill=4.00*units;
    }
    else if(units>=200 && units<=300)
    {
      bill=5.00*units;
    }
    else 
    {
      bill=6.00*units;
    }

    if(bill>500)
    {
      total=bill+(bill*0.15);
    }
    else
    {
      total=bill;
    }
  }
  public void display()
  {
    System.out.println("\n  Bill Charges Per Unit                                              ");
    System.out.println("  1 Unit to 50 Units                                              1.50");
    System.out.println("  51 Unit to 100 Units                                            3.00");
    System.out.println("  101 Unit to 200 Units                                           4.00");
    System.out.println("  201 Unit to 300 Units                                           5.00");
    System.out.println("  Above 300 Units                                                 6.00");
    System.out.println("_____________________________");
    System.out.println("\n  Bill Amount                                                     "+bill);
    System.out.println("  The Total amount                                                "+total);
  }
  public static void main(String args[])
  {
    ElectricityBill b1=new ElectricityBill();
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" __________________________________________________________________________________");
    System.out.println("|                                                                                  |");
    System.out.println("|                                                                                  |");
    System.out.println("|                           ****ELECTRICITY BILL****                               |");
    System.out.println("|                                                                                  |");
    System.out.println("|                                                                                  |");
    System.out.print  ("|__________________________________________________________________________________|");
    b1.input();
    System.out.println("_____________________________");
    b1.calculate();
    b1.display();
    System.out.println("_____________________________");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
  }
}