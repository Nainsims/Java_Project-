import javax.swing.*;
import java.awt.event.*;
public class Awt_EvenOdd {
    public static void main(String[] args) {
         Gui1 screen = new Gui1();
         screen.initComponent();;
    }
}
class Gui1 implements ActionListener{
    private JFrame frame;
    private JLabel l1,l2;
    private JTextField t1;
    private JButton b1;
    public void initComponent(){
        frame = new JFrame();
        frame.setSize(700,700);

        frame.setLayout(null);
        setComponent();
        frame.add(l1);
        frame.add(t1);
        frame.add(b1);
        frame.add(l2);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void setComponent(){
        l1 = new JLabel();
        l1.setText("Enter Number:");
        l1.setBounds(50,50,150,40);

        l2 = new JLabel();
        l2.setBounds(150,250,150,40);

        t1 = new JTextField();
        t1.setBounds(150,50,150,40);

        b1 = new JButton("Click Me");
        b1.setBounds(100, 150, 200, 70);
        b1.addActionListener(this);
    }

    public void Even_Odd(){
        int a = Integer.parseInt(t1.getText());
        if(a%2==0){
            l2.setText(a+" is Even");
        }
        else{
            l2.setText(a+" is Odd");
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Even_Odd();
    }
    
}
