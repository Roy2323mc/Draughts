import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

public class Board{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setVisible(true);
	    frame.setTitle("Draughts");
	    frame.setSize(800, 800);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout(8, 8));
        int type=0;
        
        for (int i = 0; i < 8; i++) {
            for (int o = 0; o < 8; o++) {
                ImageIcon x = new ImageIcon("/home/lancs/lich1/hdrive/scc110/Lent Term final/pieces/empty2.png");
                JButton button = new JButton(x);
                panel.add(button);
            }
        }



    }


}