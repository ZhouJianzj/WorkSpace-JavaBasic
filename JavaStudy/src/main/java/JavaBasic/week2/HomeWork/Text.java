package JavaBasic.week2.HomeWork;

/**
 * @ClassName Text
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/10/17
 **/
public class Text {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        cpu.setSpeed(2200);
        HardDisk disk = new HardDisk();
        disk.setAmount(200);
        PC pc = new PC();
        pc.setCup(cpu);
        pc.setHD(disk);
//        System.out.println(cpu.getSpeed());
//        System.out.println(disk.getAmount());
        Show.Show(cpu.getSpeed(),disk.getAmount());
    }
}

class Show{
    public void Show(){

    }
    public static void Show(int speed,int amount){
        System.out.println("cpu的速度" + speed + "HardDisk的容量" + amount);
    }
}
