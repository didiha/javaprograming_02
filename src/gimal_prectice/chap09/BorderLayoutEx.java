package gimal_prectice.chap09;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
    public BorderLayoutEx(){
        setTitle("BorderLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();

        // 가로 간격 30, 세로 간격 20
        c.setLayout(new BorderLayout(30, 20));
        c.add(new JButton("Calculate"), BorderLayout.CENTER);
        c.add(new JButton("add"), BorderLayout.NORTH);
        c.add(new JButton("sub"), BorderLayout.SOUTH);
        c.add(new JButton("div"), BorderLayout.WEST);
        c.add(new JButton("mul"), BorderLayout.EAST);

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutEx();
    }
}
