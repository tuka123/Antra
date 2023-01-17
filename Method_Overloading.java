
//Write a method that overloads the talk method by taking in a name and
//printing “Hello” with that name

package All_Code;

public class Method_Overloading {
    public static void talk()

    {

        System.out.println("hello there!");

    }

    public static void talk(String name){
        System.out.println("Hello " +name);
    }

    public static void main(String[] args)

    {

        talk("Matthew");

    }

}