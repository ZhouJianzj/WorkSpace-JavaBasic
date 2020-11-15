package Array.Work01;

/**
 * @ClassName ArrayTwo
 * @Description TODO
 * @Author
 * @Date 2020/11/12
 **/
public class ArrayTwo {
//    引入两个变量

    int count = 1;
    int a;
    int b;
    int [][] allRoom;
    public ArrayTwo(){

    }

    /**
     * 有参的构造方法进行筛选并且创建一个二维数组，使得二位数组是一个元素是10个的一维数组元素是10的元素。
     * @param a
     * @param b
     */
    public ArrayTwo(int a,int b){
        System.out.println("请预定你的房间");
        System.out.println("尊敬的顾客你好！\n本酒店最高的楼层是10楼每层10间房间！");
        if (a > 0 && a <= 10){
           this.a = a;
            this.b = b;
            int[][] allRoom1 = new int[a][b];
            for(int i = 0;i < allRoom1.length; i++){
                for(int i1  = 0;i1 < allRoom1[i].length;i1++){
                    System.out.print(allRoom1[i][i1] = 0);
                    if(i1 == 9){
                        System.out.println(" ");
                        count ++;
                    }
                }
            }
            allRoom1 = allRoom;
        }else {
            return;
        }

    }
    public void push(int a, int b){
        if (count <= 100){

        }else{

        }
    }
}
class Test{
    public static void main(String[] args) {
        ArrayTwo arrayTwo = new ArrayTwo(10,10);

//        for (int i = 0;i< arrayTwo.allRoom.length;i++){
//            for (int i1 = 0;i< arrayTwo.allRoom[i].length;i1++){
//                System.out.println(arrayTwo.allRoom[i][i1]);
//            }
//        }

    }
}