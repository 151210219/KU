package xx1;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class zz1 extends JFrame 
{

 public zz1()
 {
  JFrame jf = new JFrame();
  Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\����\\Desktop\\1.jpg");//ͼƬ��Դ
  // Image icon =jf.getToolkit().getImage("C:\\Users\\����\\Desktop\\1.jpg");���߿��Զһ�
  jf.setIconImage(icon);//��ͼƬ����JFrame
  jf.setSize(400,200);
  jf.setVisible(true);
  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public static void main(String[] args)
 {
	 new zz1();
 }

}