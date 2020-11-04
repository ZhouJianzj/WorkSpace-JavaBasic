package Object.Equals;

/**
 * @ClassName Text02
 * @Description TODO
 * @Author
 * @Date 2020/11/4
 **/
public class Text02 {
    public static void main(String[] args){
        String a = "你好";
        String b = "你好";
        Students students = new Students(123,"gaozhong");
        Students students1 = new Students(123,"gaozhong");
//        如下面的方法是去新建对象的时侯equals里面使用this.school == s.school;return的结果会是一个false
//      Students students = new Students(123,new String("gaozhong"));
//      Students students1 = new Students(123,new String("gaozhong"));

//        Students students1 = new Students();
//        Students students = new Students();

//      自己创建的类需要自己overRide equals method 如果自己没有overRide的话会是默认的比较内存地址
        System.out.println(students.equals(students1));
//      String 类里面是重写了equals method 也重写了toString method
        System.out.println(a.equals(b));
    }
}
class Students{
    int no;
    String school;
    public Students(){

    }
    public Students(int no, String school){
        this.no = no;
        this.school = school;
    }
    @Override
    public String toString(){
        return"学号" + this.no + "学校" + this.school;
    }
//    @Override
///**
// * 三大判断：
// *      1、是否为空 是不是同一类
// *      2、是否为一个内存地址
// *      3、是否里面的值相等
// */
//    public boolean equals(Object object){
//        if(object == null || !(object instanceof Students)) {
//            return false;
//        }
//        if(this == object){
//            return  true;
//        }
//        Students s = (Students)object;
////        下面的是关键  字符串的比较必须使用equals比较
////        return this.school.equals(s.school) && this.no == s.no;
////        如果是这样的话 在Stundents s = new Students(123, new String ("gaozhong"))
//        return this.school == s.school &&  this.no == s.no;
//    }

}
