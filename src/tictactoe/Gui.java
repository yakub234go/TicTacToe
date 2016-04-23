package tictactoe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Ken Masters
 */
public class Gui implements ActionListener
{
    TicTacToe main;
    static JFrame gui;
    static JPanel jpanel, jpanel2;
    static JButton jbtn1, jbtn2 ,jbtn3, jbtn4, jbtn5, jbtn6, jbtn7, jbtn8, jbtn9, jresetbtn;
    static JLabel jscorex, jscoreo;
    static ImageIcon ximg, oimg;

    public Gui()
    {
        ximg = new ImageIcon("src\\Icons\\x.png");
        oimg = new ImageIcon("src\\Icons\\o.png");
        main = new TicTacToe();
        gui = new JFrame();
        gui.setLayout(new GridLayout(2,1));
        jpanel = new JPanel();
        jpanel.setLayout(new GridLayout(3,3));
        jpanel2 = new JPanel();
        jpanel2.setLayout(new FlowLayout());

        jbtn1 = new JButton("");
        jpanel.add(jbtn1);
        jbtn2 = new JButton("");
        jpanel.add(jbtn2);
        jbtn3 = new JButton("");
        jpanel.add(jbtn3);
        jbtn4 = new JButton("");
        jpanel.add(jbtn4);
        jbtn5 = new JButton("");
        jpanel.add(jbtn5);
        jbtn6 = new JButton("");
        jpanel.add(jbtn6);
        jbtn7 = new JButton("");
        jpanel.add(jbtn7);
        jbtn8 = new JButton("");
        jpanel.add(jbtn8);
        jbtn9 = new JButton("");
        jpanel.add(jbtn9);
        gui.add(jpanel);
        jscorex = new JLabel("X : 0");
        jpanel2.add(jscorex);
        jresetbtn= new JButton("Reset");
        jpanel2.add(jresetbtn);
        jscoreo = new JLabel("O : 0");
        jpanel2.add(jscoreo);
        gui.add(jpanel2);

        addbtnaction();
        
        gui.setTitle("TicTacToe");
        gui.setSize(400, 400);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    private void addbtnaction()
    {
        jbtn1.addActionListener(this);
        jbtn2.addActionListener(this);
        jbtn3.addActionListener(this);
        jbtn4.addActionListener(this);
        jbtn5.addActionListener(this);
        jbtn6.addActionListener(this);
        jbtn7.addActionListener(this);
        jbtn8.addActionListener(this);
        jbtn9.addActionListener(this);
        jresetbtn.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()!= jresetbtn)
        {
            //((JButton)e.getSource()).setBackground(Color.red);
            ((JButton)e.getSource()).setText(main.set_text());
            ((JButton)e.getSource()).setIcon(TicTacToe.icon);
            ((JButton)e.getSource()).setEnabled(false);
        }
        else if (e.getSource() == jresetbtn)
        {
            main.fullreset();
        }
        else
        {
            System.out.println(e.getSource());
        }
        main.pattern();
        main.check();
    }
}
