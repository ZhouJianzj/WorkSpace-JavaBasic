package DuoTai;

/**
 * @ClassName OverRide
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/13
 **/
public class OverRide {
    public static void main(String[] args){
//        创建一个动物的类，不然一会里面的非静态方法不好调用
        Animal animal = new Animal();
        animal.move();

        Cat cat = new Cat();
        cat.move();

        Bird bird = new Bird();
        bird.move();
    }
}

/**类的继承*/
class Cat extends Animal{
    @Override
    public void move(){
//        方法的覆盖必须要和之前的那个父类的方法代码一样的
        System.out.println("猫在走");

    }
}

class Bird extends Animal{
    @Override
    public void move(){
        System.out.println("鸟在飞");
    }
}

class Animal{
    public void move(){
        System.out.println("在移动");
    }
}

