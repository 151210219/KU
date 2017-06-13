package yy1;
import java.awt.*;
import javax.swing.*;
import java.awt.Container;
public class zz1
{
public static void main(String args[])
{
	JFrame frame=new JFrame("背景图设计");//设计窗口和标题
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设计一个窗口的退出
	
	ImageIcon img=new ImageIcon("C:\\Users\\徐大大\\Desktop\\tt.jpg");//实例化一个图片对象
	JLabel imgLabel=new JLabel(img);//把图片先添到标签上
	
	frame.getLayeredPane().add(imgLabel,new Integer(Integer.MIN_VALUE));//把图片标签放到LayeredPane层次面板,通过窗口来访问
	imgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());//设计图片也就是标签的位置
	
	Container cp=frame.getContentPane();//通过获取窗口的内容面板传给cp,container类是一个公共的抽象基类
	cp.setLayout(new FlowLayout());//cp布局
	
	JButton but=new JButton("按钮");
	cp.add(but,"West");//此种情况下添加按钮的方法对添加图片没有影响,将按钮添加入窗口的内容面板 
	
	((JPanel)cp).setOpaque(false);//注意这里，将内容面板设为透明。这样LayeredPane面板中的背景才能显示出来。  
	
	frame.setSize(500,300);
	frame.setVisible(true);
	}
}