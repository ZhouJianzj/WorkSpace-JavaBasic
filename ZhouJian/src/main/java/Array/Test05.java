package Array;


import jdk.nashorn.internal.ir.IfNode;

/**
 * @ClassName Test05
 * @Description TODO
 * ****************************数组中存储的是引用数据类型的时候
 * @Author ZhouJian
 * @Date 2020/11/8
 **/
public class Test05 {
    public static void main(String[] args) {

//        这里写的是一个直接new一个接口，然后使用匿名类方式实现的
//        Animals animals = new Animals() {
//            @Override
//            public void move() {
//                System.out.println("nihao!");
//            }
//        };
        Animals[] animals = {new Mouse("老鼠"),new Dog("小狗"),new Animals() {
            @Override
            public void doSome() {
                String name = "小猫";
                System.out.println(name + "小猫和小狗一起在捉老鼠！");
            }
        }};

        for (int i = 0;i< animals.length;i++){

            animals[i].doSome();
        }

    }
}





//interface Animals{
//    /**
//     * 动物的移动
//     */
//    public abstract void move();
//}
//class Mouse extends Animals {
//    @Override
//    public void  move(){
//        System.out.println("老鼠在偷偷的跑！");
//    }
//
//
//}

/**
 * 这里是一个抽象的类
 *      抽象的类当中可以有非抽象的方法，也可以有抽象的方法。
 *      接口就是一个全部都是抽象的方法类
 *
 * 这里也可以使用普通的Animals类使其为父类让下面的类去extends
 *
 * 也可以使用接口(实际的例子参见  小猫类
 *      注意在使用接口的时候或者是抽象类的时候可以使用匿名的类去直接new一个其实现类
 */
abstract  class Animals{
    /**
     * 动物的移动
     */
    public abstract void doSome();
}

class Mouse extends Animals{
    String name;
    public Mouse(){}
    public Mouse(String name){
        this.name = name;
    }

    @Override
    public void doSome() {
        System.out.print( this.name + "在疯狂的逃跑！");
    }
}
class Dog extends Animals{
    String name;
    public Dog(){

    }
    public Dog(String name){
        this.name = name;
    }
    @Override
    public void doSome() {
        System.out.println(this.name + "在捉老鼠！");
    }
}
