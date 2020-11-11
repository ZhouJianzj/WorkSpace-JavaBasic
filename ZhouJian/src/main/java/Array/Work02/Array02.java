package Array.Work02;

import java.util.concurrent.ForkJoinPool;

/**
 * @ClassName Array02
 * @Description TODO
 * @Author                                     酒店的每一层
 * @Date 2020/11/11
 **/
public class Array02 implements ArrayMethod {
    int index ;
    int[] oneFloor  = new int[10];
    @Override
    public void push() {
        int room;
        for ( room =1;room <= oneFloor.length;room++){
            oneFloor[room] = room;
            index++;
        }
    }

    @Override
    public void pop() {

    }
}
