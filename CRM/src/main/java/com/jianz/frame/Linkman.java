package com.jianz.frame;

import javax.swing.*;

/**
 * @ClassName Linkman
 * @Description TODO
 * @Author
 * @Date 2020/12/28
 **/
public class Linkman extends JFrame {
    public Linkman(){
        setBounds(200,200,1200,860);
        setTitle("linkMan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Linkman();
    }
}
