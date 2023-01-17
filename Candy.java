//Override the taste method from the Candy class in the Chocolate class
//to return “tastes chocolately”. It should print “tastes sweet!” and then
// “tastes chocolately”.

package All_Code;

public class Candy
{
    public String taste()
    {
        return "tastes sweet!";
    }
    public static void main(String[] args)
    {
        Candy c1 = new Candy();
        System.out.println(c1.taste());
        Candy c2 = new Chocolate();
        System.out.println(c2.taste());
    }
}
class Chocolate extends Candy
{
public  String taste(){
  return "tastest chocolately ";
}

    public static void main(String[] args) {
        Candy c = new Candy();
        c.taste();
        Chocolate c1 = new Chocolate();
        c1.taste();
    }
}
