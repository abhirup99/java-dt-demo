import javax.swing.*;
class StudentFrame
{
JFrame fr;
JMenuBar mb;
JMenu file,edit;
JPanel pn;
JLabel fnm,lnm;
JTextField tnm,tlnm;
JButton sub,res;
public StudentFrame()
{
fr=new JFrame();
mb=new JMenuBar();
file=new JMenu("File");
edit=new JMenu("Edit");

pn=new JPanel();

fnm=new JLabel("First Name");
lnm=new JLabel("Last Name");
tnm=new JTextField(10);
tlnm=new JTextField(10);
sub=new JButton("Submit");
res=new JButton("Reset");


fr.setSize(300,300);
fr.setVisible(true);
fr.setTitle("Untitled-Notepad");
fr.setJMenuBar(mb);
fr.add(pn);
mb.add(file);
mb.add(edit);

pn.add(fnm);pn.add(tnm);
pn.add(lnm);pn.add(tlnm);
pn.add(sub);pn.add(res);

}

public static void main(String []ar)
{
StudentFrame obj=new StudentFrame();
}
}