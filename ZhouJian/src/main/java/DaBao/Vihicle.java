package DaBao;

/**
 * @ClassName Vihicle
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/10/25
 **/
public class Vihicle {
    public static void main(String[] args) {
        Vihicle V = new Vihicle();
        V.move(20);
        V.speedUp(2);
        V.speedDown(200);

    }
    private int speed;
    private String size;

    public void move(int speed){
        this.speed = speed;
        System.out.println("原始速度为：" + this.speed);
    }

    /**
     * 加速
     * @param speed
     */
    public void speedUp(int speed){
       this.setSpeed( this.getSpeed() + speed );
        System.out.println("当前速度为：" + this.getSpeed());
    }

    /**
     * 减速
     * @param speed
     */
    public void speedDown(int speed){
        if (this.speed < speed){
            System.out.println("你已经减速停车了！");
        }else{
            this.setSpeed(this.speed - speed);
            System.out.println("当前速度为：" + this.getSpeed());
        }

    }
    public Vihicle(){

    }
    /**
     * SETTER AND GETTER METHODS
     */
    public int getSpeed() {
        return speed;
    }
//  设置speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

