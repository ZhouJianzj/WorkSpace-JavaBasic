package TextClass;

/**
 * @ClassName Text10
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/10/22
 **/
public class Text10 {
    public static void main(String[] args) {
        Book a  = new Book("java",1220);
        a.setPageNum(120);
        a.datail();
    }
}

class Book{
//    属性的私有化
    private String title;
//    同上
    private int pageNum;
//     无参构造器
    public Book(){

    }
//    创建一个有参构造器
    public Book(String title1, int pageNum1){
        if(pageNum1 < 200){
            pageNum1 = 200;
            this.title = title1;
            this.pageNum = pageNum1;
            System.out.println("你的页数少于200页默认赋值200页！");
            return;
        }
        this.title = title1;
        this.pageNum = pageNum1;
    }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getPageNum() {
            return pageNum;
        }

        public void setPageNum(int pageNum) {
            if(pageNum < 200){
                this.pageNum = 200;
                System.out.println( "你的页数少于200页默认赋值200页！");
                return;
            }else {
                this.pageNum = pageNum;
            }
        }
    public void datail(){
        System.out.println(title + "\n" + pageNum);
    }

}

