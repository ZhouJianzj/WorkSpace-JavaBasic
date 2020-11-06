package Javadaily.Day17;



    /**
     * @ClassName Computer
     * @Description 重点   ***********巧妙的地址传递**********
     * @Author ZhouJian
     * @Date 2020/11/1
     **/
    public class VarPassing{
        public static void main(String[] args){
//
            InsertDrawable mouses = new Mouses();
            InsertDrawable println = new Println();
            InsertDrawable display = new Display();
            InsertDrawable keyboard = new Keyboard();
            Computer user1 = new Computer(mouses);
            user1.Have();

//        Computer user1 = new Computer(mouses,println,display,keyboard);
//        user1.setUser("周健");
//        mouses.OnClick();
//        keyboard.Input();
//        println.pt();
//        display.Show();

        }
    }
     class Computer {
        private String user;


        /**
         *  下面的是关键 这里是一个引用型的属性
         *    利用构造方法来传达，详细的步骤是：
         *    1、才has a 的主语类当中设置一个接口类型的属性，巧妙的利用构造方法传地址
         *    2、构造函数里面的参数也是接口类型的
         *    3、在main方法里面new一个接口类的对象（涉及到多态的特性）
         *    InsertDrawable mouses = new InsertDrawable;
         *    4、new一个has a 主语的对象利用构造函数直接 new Computer(mouses)
         *    这时候的主语当中的接口类的属性就是刚刚new的接口实现对象的地址
         *    5、然后再看主语类当中的方法Have 就是接口类中的方法执行结果为OverRide之后的mouses类的方法（多态的体现）
         */

        private InsertDrawable PeiJian;

        public Computer(){
        }

        public Computer(InsertDrawable peiJian){
            this.PeiJian = peiJian;
        }
        public void Have(){
            PeiJian.Show();
            PeiJian.pt();
            PeiJian.Input();
            PeiJian.OnClick();
        }




        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public InsertDrawable getPeiJian() {
            return PeiJian;
        }

        public void setPeiJian(InsertDrawable peiJian) {
            PeiJian = peiJian;
        }
    }

    /**
     * 这是一个可插拔的接口
     */
    interface InsertDrawable{
        public abstract void OnClick();
        public abstract void Input();
        public abstract void pt();
        public abstract void Show();

    }

    /**
     * 鼠标
     */
    class Mouses implements InsertDrawable{
        @Override
        public void OnClick() {
            System.out.println("鼠标适配");
        }

        @Override
        public void Input() {

        }

        @Override
        public void pt() {

        }

        @Override
        public void Show() {

        }
    }

    /**
     * 键盘
     */
    class Keyboard implements InsertDrawable{

        @Override
        public void OnClick() {

        }

        @Override
        public void Input() {
            System.out.println("键盘适配");
        }

        @Override
        public void pt() {

        }

        @Override
        public void Show() {

        }
    }

    /**
     * 打印机
     */
    class Println implements InsertDrawable{

        @Override
        public void OnClick() {

        }

        @Override
        public void Input() {

        }

        @Override
        public void pt() {
            System.out.println("打印机适配");
        }

        @Override
        public void Show() {

        }
    }

    /**
     * 显示器
     */
    class Display implements InsertDrawable{

        @Override
        public void OnClick() {

        }

        @Override
        public void Input() {

        }

        @Override
        public void pt() {

        }

        @Override
        public void Show() {
            System.out.println("打印机适配");
        }
    }



