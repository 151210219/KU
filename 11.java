package yy1;
import java.awt.*;
import javax.swing.*;
import java.awt.Container;
public class zz1
{
public static void main(String args[])
{
	JFrame frame=new JFrame("����ͼ���");//��ƴ��ںͱ���
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���һ�����ڵ��˳�
	
	ImageIcon img=new ImageIcon("C:\\Users\\����\\Desktop\\tt.jpg");//ʵ����һ��ͼƬ����
	JLabel imgLabel=new JLabel(img);//��ͼƬ������ǩ��
	
	frame.getLayeredPane().add(imgLabel,new Integer(Integer.MIN_VALUE));//��ͼƬ��ǩ�ŵ�LayeredPane������,ͨ������������
	imgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());//���ͼƬҲ���Ǳ�ǩ��λ��
	
	Container cp=frame.getContentPane();//ͨ����ȡ���ڵ�������崫��cp,container����һ�������ĳ������
	cp.setLayout(new FlowLayout());//cp����
	
	JButton but=new JButton("��ť");
	cp.add(but,"West");//�����������Ӱ�ť�ķ��������ͼƬû��Ӱ��,����ť����봰�ڵ�������� 
	
	((JPanel)cp).setOpaque(false);//ע����������������Ϊ͸��������LayeredPane����еı���������ʾ������  
	
	frame.setSize(500,300);
	frame.setVisible(true);
	}
}