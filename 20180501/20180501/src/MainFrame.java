import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton jbtnAdd2=new JButton("==>");
    private JButton jbtnAdd1=new JButton("<==");
    private JLabel jbutton3=new JLabel(">0<");
    private JTextField jtf = new JTextField();
    private int x=50;
    public MainFrame(){
        init();
    }
    private void init(){
        //////////////////////////////////////////////////////////////////////
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocation(100,50);
        this.setSize(800,600);
        this.add(jbtnAdd1);
        this.add(jbtnAdd2);
        this.add(jbutton3);
        this.add(jtf);
        //////////////////////////////////////////////////////////////////////
        jbutton3.setBounds(x,300,100,100);

        jtf.setBounds(360,30,100,100);

        jbtnAdd1.setSize(100,50);
        jbtnAdd1.setLocation(120,30);

        jbtnAdd2.setSize(100,50);
        jbtnAdd2.setLocation(240,30);

        jbtnAdd1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x-=Integer.parseInt(jtf.getText());
                jbutton3.setLocation(x,300);
            }
        });
        jbtnAdd2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x+=Integer.parseInt(jtf.getText());
                jbutton3.setLocation(x,300);
            }
        });
    }
}
