package Array.Work01;

import jdk.jfr.Description;

/**
 * @ClassName Array
 * @Description TODO     酒店管理系统
 * **********************一维数组模拟每一层楼的房间
 * @Author ZhouJIan
 * @Date 2020/11/11
 **/
public class Array {

    Object[] all = new Object[11];

    /**
     * 把每一个房间加入到楼层这个数组当中去，这里是形成一层
     *      注意到最后需要设置setter and getter方法
     */
    public void  setAll(){
//        房间号
        int room =0;
        all[room] = "楼层";
//         循环11次其中第一个元素楼层,也就是当room = 0的时候数组的一个元素就是楼层
        for( room = 0;room < all.length;room++){
            if(  room > 0 && room < all.length){
               all[room] = room;
            }
        }
    }
    /**
     *
     */
}

/**
 * 测试一维数组的元素是否为预设的元素
 */
//class TestOne{
//    public static void  main(String[] args) {
//
//        for(int i =0;i<a.all.length;i++){
//            System.out.println(a.all[i]);
//        }
//
//    }
//}

//**
//        * @ClassName ArrayFloor
//        * @Description TODO      酒店管系统
//        * ****************一维数模拟楼层实现酒店整个房间最终形成二维数组
//        * @Author
// * @Date 2020/11/11

 class ArrayFloor {

   Object[][] floor = new Object[10][11];


    /**
     * 把每一层加起来形成整个酒店楼层
     * 需要构写二维数组的遍历来展示酒店的楼层
     */
    public void setFloor(Object[] all){

//        以下是一个二维数组的遍历以及添加一维数组Array

        for(int i =0;i<floor.length;i++){
            all = floor[i];
        }

    }
}


class TestTwo{
    public static void main(String[] args) {
        Array a = new Array();
        a.setAll();
        ArrayFloor arrayFloor = new ArrayFloor();
        arrayFloor.setFloor(a.all);
        for (int i = 0; i< arrayFloor.floor.length;i++){
            for (int i1 = 0; i<arrayFloor.floor[i].length;i1++){
                System.out.println(arrayFloor.floor[i][i1]);
            }
        }

    }

}
