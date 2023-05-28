import javax.swing.*;
import java.awt.*;
import java.awt.font.*;
public class billing extends JFrame {
       Font f1=new Font("Arial",Font.BOLD,20);
      billing(){
          //Labels
          JLabel j1=new JLabel("Item Name");
          j1.setBounds(50,50,100,40);
          j1.setFont(f1);
          add(j1);
          JLabel j2=new JLabel("Item Code");
          j2.setBounds(50,100,100,40);
          j2.setFont(f1);
          add(j2);
          JLabel j3=new JLabel("Item Price");
          j3.setBounds(50,150,100,40);
          j3.setFont(f1);
          add(j3);
          JLabel j4=new JLabel("Quantity");
          j4.setBounds(50,200,100,40);
          j4.setFont(f1);
          add(j4);
          JLabel j5=new JLabel("Payment");
          j5.setBounds(50,250,100,40);
          j5.setFont(f1);
          add(j5);
          JLabel total=new JLabel("Total");
          total.setBounds(50,350,100,40);
          total.setFont(f1);
          add(total);
          JLabel bal=new JLabel("Balance");
          bal.setBounds(50,400,100,40);
          bal.setFont(f1);
          add(bal);

       //text fields
          JTextArea t1=new JTextArea();
          t1.setBounds(160,50,200,30);
          t1.setFont(f1);
          add(t1);
          JTextArea t2=new JTextArea();
          t2.setBounds(160,100,200,30);
          t2.setFont(f1);
          add(t2);
          JTextArea t3=new JTextArea();
          t3.setBounds(160,150,200,30);
          t3.setFont(f1);
          add(t3);
          JTextArea t4=new JTextArea();
          t4.setBounds(160,200,200,30);
          t4.setFont(f1);
          add(t4);
          JTextArea t5=new JTextArea();
          t5.setBounds(160,250,200,30);
          t5.setFont(f1);
          add(t5);
          JLabel to=new JLabel("00.00");
          to.setBounds(160,350,200,30);
          to.setFont(f1);
          add(to);
          JLabel ba=new JLabel("00.00");
          ba.setBounds(160,400,200,30);
          ba.setFont(f1);
          add(ba);

          setSize(1000,600);
          setLayout(null);
          setVisible(true);
          setDefaultCloseOperation(EXIT_ON_CLOSE);
          setResizable(false);
      }
      public static void main(String []args){
          new billing();
      }
}
