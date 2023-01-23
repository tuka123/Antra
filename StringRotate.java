package Day_1;



public class StringRotate {
    public static String rotate(String str,int no) {
        String ret="";
        for(int i=str.length()-(no) ;i<str.length();i++) {
            ret=ret+str.charAt(i);
        }
        for(int i=0;i<str.length()-no;i++) {
            ret=ret+str.charAt(i);
        }
        return ret;
    }
    public static void main(String[] args) {
        System.out.println(StringRotate.rotate("Antra", 3));
    }

}
