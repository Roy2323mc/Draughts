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
        panel.setLayout(null);
        frame.add(panel);
        int type=0;
        int r=0;
        int c=0;
        JButton[][] button = new JButton[8][8];    
        for(int o=0; o < 8; o++){
            for(int i=0; i < 8; i++){
                button[i][o] = new JButton("Hi");
                button[i][o].setSize(100,100);
                button[i][o].setLocation(r,c);
                panel.add(button[i][o]);
                r=r+100;
                
            }
            r=0;
            c=c+100; 
        }



    }


}