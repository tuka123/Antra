package Day_1;


public class PrimeNumber {
    public static void main(String[] args) {
        int no=17;
        int fact=(int)Math.sqrt(no);
        int c=0;
        for(int i=2;i<fact;i++) {
            if(no%i==0)c++;
        }
        if(c==0) {
            System.out.println("Prime Number");
        }else {
            System.out.println("Not Prime Number");
        }
    }

}
