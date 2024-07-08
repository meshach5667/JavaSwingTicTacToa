import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class xando extends JFrame implements ActionListener {
    private JButton[][] buttons = new JButton[3][3];
    private boolean playerX = true;

    public xando() {
        setTitle("X and O");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));

        initializeButtons();

        setVisible(true);
    }

    private void initializeButtons() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col] = new JButton("");
                buttons[row][col].setFont(new Font("roboto", Font.PLAIN, 80));
                buttons[row][col].setFocusPainted(false);
                buttons[row][col].addActionListener(this);
                add(buttons[row][col]);
            }
        }
    }

   
      
   
