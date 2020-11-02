package JavaBasic.week5.Work;

/**
 * @ClassName PutAwayException
 * @Description TODO
 * @Author Zhoujian
 * @Date 2020/11/2
 **/
public class PutAwayException extends Exception  {
    private String Information;
    public PutAwayException(){
        super();
    }
    public PutAwayException(String information){
        this.Information =information;
    }

    public String getInformation() {
        return Information;
    }
}
