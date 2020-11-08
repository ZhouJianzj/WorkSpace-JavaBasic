package HelloWorldSwing;

import javax.swing.*;

/**
 * @ClassName HelloWorldSwing
 * @Description TODO
 * @Author
 * @Date 2020/11/8
 **/
public class HelloWorldSwing {
    private JPanel mainPanel;
    private JButton button3;
    private JButton button5;
    private JPanel topPanel;
    private JButton button1;
    private JButton button4;
    private JButton button6;
    private JButton button7;
    private JButton name;
    private JPanel leftPanel;
    private JButton check;
    private JButton weight;

    public HelloWorldSwing() {
        check.addActionListener(e -> {
            System.out.println("click");
            String nameText = name.getText();
            String weightText = weight.getText();
            

        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setContentPane(new HelloWorldSwing().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
