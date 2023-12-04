import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class java_13 {
    public static class PieChartGraphics extends JFrame {
        private MyPanel panel = new MyPanel();
        private JTextField tf[] = new JTextField[4];
        private JLabel la[] = new JLabel[4];
        private String text[] = {"apple", "cherry", "strawberry", "prune"};
        private Color[] dcolor = {Color.RED, Color.BLUE, Color.MAGENTA, Color.ORANGE};
        static int getf[] = new int[4];
        static float sum = 0;

        public PieChartGraphics() {
            setTitle("파이 차트 그리기 - 2021E7040");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Container c = getContentPane();
            c.setLayout(new BorderLayout());

            c.add(new TopPanel(), BorderLayout.NORTH);
            c.add(panel, BorderLayout.CENTER);

            setSize(500, 350);
            setVisible(true);
        }

        class TopPanel extends JPanel {
            public TopPanel() {
                setBackground(Color.WHITE);
                for (int i = 0; i < text.length; i++) {
                    la[i] = new JLabel(text[i]);
                    add(la[i]);
                    tf[i] = new JTextField(4);
                    tf[i].addActionListener(new MyActionLIstener());
                    add(tf[i]);
                }
            }
        }

        class MyPanel extends JPanel {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                int startA = 90;
                int arcA;

                for (int i = 0; i < text.length; i++) {
                    g.setColor(dcolor[i]);
                    g.drawString(text[i] + " " + getf[i] + "%", 50 + i * 100, 20);
                }

                for (int i = 0; i < text.length; i++) {
                    arcA = (int) ((getf[i] / 100.0) * 360);
                    System.out.println("arc: " + arcA);
                    g.setColor(dcolor[i]);
                    g.fillArc(150, 50, 200, 200, startA, arcA);
                    startA += arcA;
                }
            }
        }

        class MyActionLIstener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                sum = 0;
                for (int i = 0; i < text.length; i++) {
                    getf[i] = Integer.parseInt(tf[i].getText());
                    sum += getf[i];
                }

                for (int i = 0; i < text.length; i++) {
                    getf[i] = (int) ((getf[i] / sum) * 100);
                }
                repaint();
            }
        }
    }
    public static void main(String[] args) {
        new PieChartGraphics();
    }
}