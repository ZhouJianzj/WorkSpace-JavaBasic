package Jbdc;

/**
 * @ClassName JavaProgrammer
 * @Description TODO
 * @Author
 * @Date 2020/11/15
 **/
public class JavaProgrammer {
    public static void main(String[] args) {
        InterfaceJDBC interfaceJDBC = new MySQL();
        interfaceJDBC.connection();
    }
}
