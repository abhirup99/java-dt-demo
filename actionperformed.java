import  java.awt.*;
import javax.swing.*;
public class ActionEventDemo extends JFrame implements ActionListner
{
JButton click;
JPanel panel;
JLabel message;

public ActionEventDemo()
{
super("ACTION EVENT DEMO");
click=new JButton("click");
panel=new JPannel();
message=new JLabel();

add(pannel);
panel.add(click);
panel.add(message);
setSize(300,300);
setVisible(true);
click.add(listner);
}
}
public void actionPerformed(ActionEvent e)
{
message.setText(" WELCOME TO EVENT HANDLING IN JAVA");

public static void main(String []arg)
{
ActionEventDemo obj = new ActionEventDemo();
}


