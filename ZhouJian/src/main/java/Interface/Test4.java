package Interface;

/**
 * @ClassName Test4
 * @Description    关于 接口的使用 以及Has a 后 is a 的思想用法
 * @Author ZhouJian
 * @Date 2020/10/31
 **/
public class Test4 {

}
interface FoodMenu{
    public abstract void xiHongShiChaoJiDan();
    public abstract void yuXiangRouSi();
}
class Cooker implements FoodMenu{
    @Override
    public void xiHongShiChaoJiDan() {
        System.out.println("西红柿炒鸡蛋");
    }

    @Override
    public void yuXiangRouSi() {
        System.out.println("鱼香肉丝");
    }
}
class Customers{
    /**
     * 这里是 Customer Has a FoodMenu 所以是Customer的一个属性
      */
    public static void main(String[] args) {
        FoodMenu f = new Cooker();
        f.yuXiangRouSi();
        f.xiHongShiChaoJiDan();
    }

}