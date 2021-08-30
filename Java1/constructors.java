import java.util.*;

class xyz 
{
xyz()
{
System.out.println("this is default constructor");
}
void defss(){
System.out.println("some method");
}
}
class pqr 
{
pqr(int a,int b )
{
int x=a;
int y=b;
int c=x+y;
System.out.println(c+" \t is addition value");
}
void defss2(){
    System.out.println("some method");
}
}
class abc
{
int a;
int b;
abc(int x,int y)
{
a=x;
b=y;
}
void display()
{
System.out.println(a+""+b);
}
abc(abc z)
{
a=z.a;
b=z.b;
}
}
public class constructors {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
xyz obj= new xyz();   //default
obj.defss();
System.out.println("enter a,b values");
int a=s.nextInt();
int b=s.nextInt();
pqr obj1= new pqr(a,b); //parameter
obj1.defss2();
abc obj2=new abc(10,20); //copy
obj2.display();
abc obj3=new abc(obj2);
obj3.display();
s.close();
    }
    
}
