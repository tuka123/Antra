
//Add an equals method to this class that returns true if the current Dog
//and passed Dog have the same name. The code should print false
//twice then true twice.


package Day_02;

public class Dogg {

    private String name;

    public Dogg(String name) {
        this.name = name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else {
            return false;
        }
    }

        {
// ADD CODE HERE
        }
        public static void main (String[]args)
        {
            Dogg d1 = new Dogg("Rufus");
            Dogg d2 = new Dogg("Sally");
            Dogg d3 = new Dogg("Rufus");
            Dogg d4 = d3;
            System.out.println(d1.equals(d2));
            System.out.println(d2.equals(d3));
            System.out.println(d1.equals(d3));
            System.out.println(d3.equals(d4));
        }
    }

