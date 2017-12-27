package View;

import Common.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JFrame implements ActionListener{

    JMenuBar jmb;
    JMenu menu1,menu2,menu3;
    JMenuItem item1_m1,item2_m1;
    JMenuItem item1_m2,item2_m2,item3_m2,item4_m2;
    JMenuItem item1_m3,item2_m3,item3_m3,item4_m3,item5_m3;

    public MainView(User u)
    {
        jmb = new JMenuBar();
        menu1 = new JMenu("�˻�����");
        menu2 = new JMenu("��ѯ");
        menu3 = new JMenu("�������");

        item1_m1 = new JMenuItem("�û�����");
//        item2_m1 = new JMenuItem("�����û�");
        item1_m1.addActionListener(this);
//        item2_m1.addActionListener(this);

        item1_m2 = new JMenuItem("�洢��ѯ");
        item2_m2 = new JMenuItem("��Ӧ�̲�ѯ");
        item3_m2 = new JMenuItem("�ͻ���ѯ");
        item4_m2 = new JMenuItem("�ֿ��ѯ");
        item1_m2.addActionListener(this);
        item2_m2.addActionListener(this);
        item3_m2.addActionListener(this);
        item4_m2.addActionListener(this);


        item1_m3 = new JMenuItem("������");
        item2_m3 = new JMenuItem("�������");
        item3_m3 = new JMenuItem("��Ӧ�̹���");
        item4_m3 = new JMenuItem("�ͻ�����");
        item5_m3 = new JMenuItem("�ֿ����");
        item1_m3.addActionListener(this);
        item2_m3.addActionListener(this);
        item3_m3.addActionListener(this);
        item4_m3.addActionListener(this);
        item5_m3.addActionListener(this);

        if(u.getType() == 1)
        {
            menu1.add(item1_m1);
            menu1.add(item2_m1);
            jmb.add(menu1);
        }

        menu2.add(item1_m2);
        menu2.add(item2_m2);
        menu2.add(item3_m2);
        menu2.add(item4_m2);
        jmb.add(menu2);

        if(u.getType() == 1 || u.getType() == 2)
        {
            menu3.add(item1_m3);
            menu3.add(item2_m3);
            menu3.add(item3_m3);
            menu3.add(item4_m3);
            menu3.add(item5_m3);
            jmb.add(menu3);
        }



        this.setJMenuBar(jmb);
        this.setSize(1000,600);
        this.setTitle("�ֿ����ϵͳ");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String [] args)
    {
        User u = new User();
        u.setType(1);
       new MainView(u);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == item1_m1)
        {

        }
    }
}