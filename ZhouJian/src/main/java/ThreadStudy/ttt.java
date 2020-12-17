package ThreadStudy;

public class ttt {
    public static void main(String[] args) {
        long starttime =System.currentTimeMillis();
        long endtime=starttime+1000;
        long count=0;
        while (true){
            Math.sqrt(count);
            if (endtime<System.currentTimeMillis()){
                break;
            }
            ++count;
        }
        System.out.println(count);
    }
}
