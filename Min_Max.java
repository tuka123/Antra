package All_Code;

public class Min_Max {
    public static void main(String[] args) {
        int count = 0;
        int[] A = {3,5,8,-3,-7,-4,10,12};

        int min = Integer.MAX_VALUE;

        for(int i = 0; i< A.length; i++){
            if(min<A[i]){
                System.out.println(count++);
            }
        }
    }
}
