
//Edit this code so the class Beagle is a subclass of the Dog class. When
//you run the code it should print “woof!” and then “arf arf”

package All_Code;

public class Dog
{
    public void speak()
    {
        System.out.println("woof!");
    }
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.speak();
        Beagle b = new Beagle();
        b.speak();
    }
}
class Beagle
{
    public void speak()
    {
        System.out.println("arf arf");
    }
}
