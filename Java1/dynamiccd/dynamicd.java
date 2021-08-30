package dynamiccd;
class xyz
{
void m1()
{
System.out.println("this is is super class method");
}
}
class pqr extends xyz
{
void m1()
{
System.out.println("this is sub class method");
}
}
public class dynamicd {
    public static void main(String[] args) {
        xyz ref;
ref=new xyz();
ref.m1();
ref=new pqr();
ref.m1();
    }
    
}
