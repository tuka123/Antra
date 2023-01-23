
//Create an interface named Test that has a void talk method and void
//walk method.

package All_Code;

public interface Test {
      void talk();
      void walk();
}
 class Test2 implements Test{
    public void talk(){
        System.out.println("Hey i'm talking....");
    }
    public  void walk(){
        System.out.println("Hey i'm walking.......");
    }
 }


