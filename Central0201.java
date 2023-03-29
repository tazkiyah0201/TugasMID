
package central0201;
public interface A extends B 
{ 
    public void bbb(); 
}
interface B extends A{}

public class A 
{
}
class Central0201 implements A,B{
public void aaa(){
System.out.println("aaa");
}
}
