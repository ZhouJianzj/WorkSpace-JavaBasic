package Object.Equals;

import org.omg.CORBA.NO_IMPLEMENT;

/**
 * @ClassName Test03
 * @Description
 ******这个方法可以创建一个简单的账户登录的系统来判断输入和预先存的是否一样
 * ********************出现线程(thread)的问题
 *  解决了   在有参数的构造方法里没有 写this.name = name 和no ;
 * @Author ZhouJian
 * @Date 2020/11/5
 **/
public class Test03 {
    public static void main(String[] args) {
        Student s = new Student("周健",new No("11") );
        Student s1 = new Student("周健",new No("11") );
        System.out.println(s.equals(s1));
    }
}

    class Student {
        String name;
        No no;

        public Student() {

        }

        public Student(String name, No no) {
            this.name = name;
            this.no = no;
        }

        @Override
        public boolean equals(Object object) {
            if (object == null || !(object instanceof Student)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            Student s = (Student) object;
            return this.name.equals(s.name) && this.no.equals(s.no);

        }
    }

    class No {
        String no;

        public No() {

        }

        public No(String no) {
            this.no = no;

        }


        @Override
        public boolean equals(Object object){
           if (object ==null || !(object instanceof No)){
               return false;
           }
           if (this == object){
               return true;
           }
           No n = (No)object;
           return this.no.equals(n.no);
        }
    }
