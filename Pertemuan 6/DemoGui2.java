package pertemuan.pkg6;
import javax.swing.*;
import java.awt.*;

public class DemoGui2 extends JFrame {
    JPanel jp = new JPanel();
    JTextField jt = new JTextField();
    JLabel jl = new JLabel("Contoh Label");
    
    public DemoGui2() {
        add(jl);
        add(jt);
        add(jp);
        jl.setBounds(15,20,80,25);
        jt.setBounds(120,20,80,25);
    }
    public static void main(String[] args) {
        DemoGui2 demo2 = new DemoGui2();
        
        demo2.setTitle("Form Dengan Label dan Textfield");
        demo2.setSize(300, 300);
        demo2.setVisible(true);
    }
}
