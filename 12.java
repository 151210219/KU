package xx1;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class zz1 extends JFrame 
{

 public zz1()
 {
  JFrame jf = new JFrame();
  Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\徐大大\\Desktop\\1.jpg");//图片来源
  // Image icon =jf.getToolkit().getImage("C:\\Users\\徐大大\\Desktop\\1.jpg");两者可以兑换
  jf.setIconImage(icon);//将图片插入JFrame
  jf.setSize(400,200);
  jf.setVisible(true);
  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public static void main(String[] args)
 {
	 new zz1();
 }

}