import javax.swing.*;
import java.awt.*;

public class Board{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setVisible(true);
	    frame.setTitle("Draughts");
	    frame.setSize(800, 800);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8,8));
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        int type=0;
        JButton[][] button = new JButton[8][8];
        button[1][1] = new JButton("Hi");
        panel.add(button[1][1]);
        
        /*for (int o = 7; o > -1; o--) {
            for (int i = 0; i < 8; i++) {
                button[i][o].setSize(100,100);
                button[i][o] = new JButton("Hi");
                panel.add(button[i][o]);
            }
        }*/
    frame.add(panel);


    }


}