package Day_1;



public class StringReverese {

    public static void main(String[] args) {
        String str="Antra";
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }
        System.out.print(str1);

    }

}