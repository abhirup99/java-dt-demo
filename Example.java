import java.awt.*;
import javax.swing.*;
class Example extends JFrame
{
JButton red,blue,green;
public Example()
{
red=new JButton("Red");
blue=new JButton("Blue");
green=new JButton("Green");
setVisible(true);
setSize(300,300);
setTitle("GridBag constraint");

setLayout(new GridBagLayout());
GridBagConstraints gc=new GridBagConstraints();

gc.gridx=0;
gc.gridy=0;
add(red,gc);



gc.gridx=1;
gc.gridy=1;
add(blue,gc);


gc.gridx=2;
gc.gridy=2;
add(green,gc);

}
public static void main(String []ar)
{
Example obj=new Example();
}
}
