import java.util.Scanner;
class Employees5
{
    int eno,esal;
    String ename;
    void read(int empno,String name,int sal)
    {
        this.eno=empno;
        this.ename=name;
        this.esal=sal;
        
    }
    void display()
    {
        System.out.println("The eno is: "+eno);
        System.out.println("The name is: "+ename);
        System.out.println("The esal is: "+esal);
    }
    public static void main(String[] args)
    {
        Scanner in1=new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int n=in1.nextInt();
        Employees5[] e = new Employees5[n];
        for(int i=0;i<n;i++)
        {
            e[i]= new Employees5();
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the eno");
            int enumber=in.nextInt();
            System.out.println("Enter the name");
            String emname=in.next();
            System.out.println("Enter the esal");
            int esall=in.nextInt();
            e[i].read(enumber,emname,esall);
        }
        int ch=0;
        while(ch!=3)
        {
            System.out.println("1.Display all Employees");
            System.out.println("2.search Employees");
            System.out.println("3.Exit");
            System.out.println("Enter your option");
            ch=in1.nextInt();
            switch(ch)
            {
                case 1:for(int i=0;i<n;i++)
                        {
                            e[i].display();
                        }
                        break;
                case 2: System.out.println("Enter the eno number");
                        int number=in1.nextInt();
                        for(int i=0;i<n;i++)
                        {
                            if(e[i].eno==number)
                            {
                                e[i].display();
                            }
                        }
                        break;
                case 3:break;
                default:System.out.println("Worng option");
            }
        }
    }    
}