import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

public class Square{
    public void createSquare(int type, int x, int y){

        switch(type){
            case 0: {
            ImageIcon i = new ImageIcon("/home/lancs/lich1/hdrive/scc110/Lent Term final/pieces/empty.png");
            JButton button = new JButton(i);
            break;     
            }
            case 1: {
            ImageIcon i = new ImageIcon("/home/lancs/lich1/hdrive/scc110/Lent Term final/pieces/empty2.png");
            JButton button = new JButton(i);
            break;  
            }

        }


    }



    
}