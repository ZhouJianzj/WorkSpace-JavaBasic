package JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import Entity.login;
import Service.ImplementLoginService;

/**
 * @ClassName Test02
 * @Description TODO
 *                      springLayout 弹簧
 * @Author
 * @Date 2020/12/30
 **/
public class Login extends JFrame {
    JLabel title = new JLabel("CRM-实训项目");
   SpringLayout springLayout = new SpringLayout();
    JPanel jp = new JPanel(springLayout);
    JLabel jLabeluserName = new JLabel("用户:");
    JTextField jTextFielduserName = new JTextField(15);
    JLabel jLabelpassword = new JLabel("密码:");
    JPasswordField jPasswordFieldpassword = new JPasswordField(15);
    JButton jButton1 = new JButton("重置");
    JButton jButton2 = new JButton("登录");
    TrayIcon trayIcon;
    SystemTray systemTray;

    public Login(){
      setTitle("小熊");
      setLocationRelativeTo(null);
        Container contentPane = getContentPane();
        setSize(430,300);
        contentPane.add(jp);
//        jp.setBackground(Color.BLACK);
        setResizable(false);
        jLabeluserName.setFont(new Font("楷体",Font.BOLD,15));
        jLabelpassword.setFont(new Font("楷体",Font.BOLD,15));
//        设置log图标
        URL pic = Login.class.getClassLoader().getResource("pic1.jpg");
        Image pic1 = new ImageIcon(pic).getImage();
        setIconImage(pic1);
//       设置登录面板的背景
//        BufferedImage image = null;
//        URL pic2 = Login.class.getClassLoader().getResource("pic2.jpg");
//        try {
//            image = ImageIO.read(pic2);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Graphics g = image.getGraphics();
//        jp.paintComponents(g);
        jp.add(title);
        title.setFont(new Font("华文楷体",Font.CENTER_BASELINE,22 ));
        SpringLayout.Constraints ctitle = springLayout.getConstraints(title);
        ctitle.setX(Spring.constant(130));
        jp.add(jLabeluserName);
//        获取弹簧的约束的user标签约束
        SpringLayout.Constraints cLabelUser = springLayout.getConstraints(jLabeluserName);
//        设置user标签的位置，里面是一个常数
        cLabelUser.setX(Spring.constant(80));
        cLabelUser.setY(Spring.constant(60));

        jp.add(jTextFielduserName);
        SpringLayout.Constraints cTUserName = springLayout.getConstraints(jTextFielduserName);
//      获取user标签的弹簧约束的东边的值
        Spring jLEast = cLabelUser.getConstraint(SpringLayout.EAST);
//        需要的参数是组件的起始位置,和参照上一个组件的位子的常数
        cTUserName.setConstraint(SpringLayout.WEST,Spring.sum(jLEast, Spring.constant(10)));
//        一组件在使用弹簧的时候需要两个位置的约束,
        cTUserName.setConstraint(SpringLayout.NORTH,cLabelUser.getConstraint(SpringLayout.NORTH));

        jp.add(jLabelpassword);
        SpringLayout.Constraints cLPassword = springLayout.getConstraints(jLabelpassword);
//        获取user的标签南面的位置
        Spring userLable = cLabelUser.getConstraint(SpringLayout.SOUTH);
        cLPassword.setConstraint(SpringLayout.NORTH,Spring.sum(userLable,Spring.constant(20)));
//        设置password标签的x轴位置,参照user标签
        cLPassword.setConstraint(SpringLayout.WEST,cLabelUser.getConstraint(SpringLayout.WEST));

        jp.add(jPasswordFieldpassword);
        SpringLayout.Constraints cpt = springLayout.getConstraints(jPasswordFieldpassword);
        cpt.setConstraint(SpringLayout.WEST,Spring.sum(cLPassword.getConstraint(SpringLayout.EAST),Spring.constant(10)));
        cpt.setConstraint(SpringLayout.SOUTH,cLPassword.getConstraint(SpringLayout.SOUTH));

//  按钮的载入
        jp.add(jButton1);
        SpringLayout.Constraints cbutton1 = springLayout.getConstraints(jButton1);
//        获取密码框的西边值
        Spring  pt = cpt.getConstraint(SpringLayout.WEST);
//        设置重置的按钮的西边值
        cbutton1.setConstraint(SpringLayout.WEST,pt);
//        设置重置按钮北边值
        Spring cps = cpt.getConstraint(SpringLayout.SOUTH);
        cbutton1.setConstraint(SpringLayout.NORTH,Spring.sum(cps, Spring.constant(20)));

        jp.add(jButton2);
        SpringLayout.Constraints cbutton2 = springLayout.getConstraints(jButton2);
//        设置东边
        Spring cpteast = cpt.getConstraint(SpringLayout.EAST);
        cbutton2.setConstraint(SpringLayout.EAST,cpteast);
        cbutton2.setConstraint(SpringLayout.NORTH,Spring.sum(cps, Spring.constant(20)));

//        对按钮添加事件监听
//        登录
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login login = new login();
                String text = jTextFielduserName.getText();
                char[] password1 = jPasswordFieldpassword.getPassword();
                String password = String.valueOf(password1);
//                设置login实体的参数
                login.setUserName(text);
                login.setPassWord(password);
                if(text == null || password == null){
                    JOptionPane.showMessageDialog(jp,"请输入用户名和密码！");
                }

//                这里的测试只是简单的规定的没有连接数据库的账户密码登陆测试

                if (new ImplementLoginService().checkedLogin(login)){
                    switch (login.getType()){
                        case "0" :
                            new adminFrame();
                            dispose();
                            break;
                        case "1":
                            new LinkmanFrame();
                            dispose();
                            break;
                        case "2":
                            new ClientFrame();
                            dispose();
                            break;
                    }

                }else{
                    JOptionPane.showMessageDialog(jp,"输入的账号或者密码错误");
                }


            }
        });
//        重置
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextFielduserName.setText("");
                jPasswordFieldpassword.setText("");
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
//        添加系统托盘 tray
        if (SystemTray.isSupported()){
            systemTray = SystemTray.getSystemTray();
//            系统托盘图标的大小是16 * 16 的
            URL resource = Login.class.getClassLoader().getResource("pic3.jpg");
            trayIcon = new TrayIcon(new ImageIcon(resource).getImage());
            try {
                systemTray.add(trayIcon);
            } catch (AWTException e) {
                e.printStackTrace();
            }
/**
 * 最小化的时候销毁资源
 */
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowIconified(WindowEvent e) {
                Login.this.dispose();
            }
        });
        trayIcon.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int clickCount = e.getClickCount();
                if (clickCount == 1){
                    Login.this.setExtendedState(JFrame.NORMAL);
                }
                Login.this.setVisible(true);
            }
        });
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
