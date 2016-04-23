package tictactoe;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Ken Masters
 */
public class TicTacToe
{
    public static int ctr, score_x, score_o;
    static String color;
    static ImageIcon icon;
    
    public TicTacToe()
    {
        ctr = score_x = score_o = 0;
    }
    
    public String set_text()
    {
        if(ctr == 0)
        {
            ctr++;
            icon=Gui.ximg;
            return null;
        }
        else if(ctr % 2 == 0)
        {
            ctr++;
            icon=Gui.ximg;
            return null;
        }
        else
        {
            ctr++;
            icon=Gui.oimg;
            return null;
        }
    }
    
    public void fullreset()
    {
        for(Component c : Gui.gui.getContentPane().getComponents())
        {
            if (c == Gui.jpanel)
            {
                for (Component b : ((JPanel)c).getComponents())
                {
                    ((JButton)b).setText(null);
                    ((JButton)b).setIcon(null);
                    ((JButton)b).setBackground(null);
                    ((JButton)b).setEnabled(true);
                }
            }
            Gui.jscorex.setText("X : 0");
            Gui.jscoreo.setText("O : 0");
        }
        ctr = 0;
        score_x = 0;
        score_o = 0;
    }
    
    public void reset()
    {
        ctr = 0;
        for(Component c : Gui.gui.getContentPane().getComponents())
        {
            if (c == Gui.jpanel)
            {
                for (Component b : ((JPanel)c).getComponents())
                {
                    ((JButton)b).setText(null);
                    ((JButton)b).setIcon(null);
                    ((JButton)b).setBackground(null);
                    ((JButton)b).setEnabled(true);
                }
            }
        }
    }
    
    public void check()
    {
        if (Gui.jbtn1.isEnabled()== false && Gui.jbtn2.isEnabled()== false && Gui.jbtn3.isEnabled()== false && Gui.jbtn4.isEnabled()== false && Gui.jbtn5.isEnabled()== false && Gui.jbtn6.isEnabled()== false && Gui.jbtn7.isEnabled()== false && Gui.jbtn8.isEnabled()== false && Gui.jbtn9.isEnabled()== false)
        {
            reset();
        }
    }
    
    public void pattern_x()
    {
        System.out.println("X Wins");
        score_x++;
        Gui.jscorex.setText("X : " + Integer.toString(score_x));
        reset();
    }
    
    public void pattern_o()
    {
        System.out.println("O Wins");
        score_o++;
        Gui.jscoreo.setText("O : " + Integer.toString(score_o));
        reset();
    }
    
    public void pattern()
    {
        if (Gui.jbtn1.getIcon()==Gui.ximg && Gui.jbtn2.getIcon()==Gui.ximg && Gui.jbtn3.getIcon()==Gui.ximg)
        {
            pattern_x();
        }
        else if (Gui.jbtn4.getIcon()==Gui.ximg && Gui.jbtn5.getIcon()==Gui.ximg && Gui.jbtn6.getIcon()==Gui.ximg)
        {
            pattern_x();
        }
        else if (Gui.jbtn7.getIcon()==Gui.ximg && Gui.jbtn8.getIcon()==Gui.ximg && Gui.jbtn9.getIcon()==Gui.ximg)
        {
            pattern_x();
        }
        else if (Gui.jbtn1.getIcon()==Gui.ximg && Gui.jbtn4.getIcon()==Gui.ximg && Gui.jbtn7.getIcon()==Gui.ximg)
        {
            pattern_x();
        }
        else if (Gui.jbtn2.getIcon()==Gui.ximg && Gui.jbtn5.getIcon()==Gui.ximg && Gui.jbtn8.getIcon()==Gui.ximg)
        {
            pattern_x();
        }
        else if (Gui.jbtn3.getIcon()==Gui.ximg && Gui.jbtn6.getIcon()==Gui.ximg && Gui.jbtn9.getIcon()==Gui.ximg)
        {
            pattern_x();
        }
        else if (Gui.jbtn1.getIcon()==Gui.ximg && Gui.jbtn5.getIcon()==Gui.ximg && Gui.jbtn9.getIcon()==Gui.ximg)
        {
            pattern_x();
        }
        else if (Gui.jbtn3.getIcon()==Gui.ximg && Gui.jbtn5.getIcon()==Gui.ximg && Gui.jbtn7.getIcon()==Gui.ximg)
        {
            pattern_x();
        }
        else if (Gui.jbtn1.getIcon()==Gui.oimg && Gui.jbtn2.getIcon()==Gui.oimg && Gui.jbtn3.getIcon()==Gui.oimg)
        {
            pattern_o();
        }
        else if (Gui.jbtn4.getIcon()==Gui.oimg && Gui.jbtn5.getIcon()==Gui.oimg && Gui.jbtn6.getIcon()==Gui.oimg)
        {
            pattern_o();
        }
        else if (Gui.jbtn7.getIcon()==Gui.oimg && Gui.jbtn8.getIcon()==Gui.oimg && Gui.jbtn9.getIcon()==Gui.oimg)
        {
            pattern_o();
        }
        else if (Gui.jbtn1.getIcon()==Gui.oimg && Gui.jbtn4.getIcon()==Gui.oimg && Gui.jbtn7.getIcon()==Gui.oimg)
        {
            pattern_o();
        }
        else if (Gui.jbtn2.getIcon()==Gui.oimg && Gui.jbtn5.getIcon()==Gui.oimg && Gui.jbtn8.getIcon()==Gui.oimg)
        {
            pattern_o();
        }
        else if (Gui.jbtn3.getIcon()==Gui.oimg && Gui.jbtn6.getIcon()==Gui.oimg && Gui.jbtn9.getIcon()==Gui.oimg)
        {
            pattern_o();
        }
        else if (Gui.jbtn1.getIcon()==Gui.oimg && Gui.jbtn5.getIcon()==Gui.oimg && Gui.jbtn9.getIcon()==Gui.oimg)
        {
            pattern_o();
        }
        else if (Gui.jbtn3.getIcon()==Gui.oimg && Gui.jbtn5.getIcon()==Gui.oimg && Gui.jbtn7.getIcon()==Gui.oimg)
        {
            pattern_o();
        }
        else
        {
            System.out.println(String.format("ctr = {0}", ctr));
        }
    }
    
    public static void main(String[] args)
    {
        Gui gui = new Gui();
    }   
}
