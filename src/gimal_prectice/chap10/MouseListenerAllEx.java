package gimal_prectice.chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseListenerAllEx extends JFrame {
    private JLabel la = new JLabel("No Mouse Event");

    public MouseListenerAllEx(){
        setTitle("MouseListenerAllEx");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        MyMouseListener listener = new MyMouseListener();
        c.addMouseListener(listener);
        c.addMouseMotionListener(listener);
        c.add(la);

        setSize(300, 200);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener, MouseMotionListener{
        public void mousePressed(MouseEvent e){ // 마우스 눌렀을 때
            la.setText("mousePressed (" + e.getX() + ", " + e.getY() + ")");
        }
        public void mouseReleased(MouseEvent e){ // 마우스 땠을 때
            la.setText("mouseReleased (" + e.getX() + ", " + e.getY() + ")");
        }
        public void mouseClicked(MouseEvent e){}
        public void mouseEntered(MouseEvent e){
            Component cp = (Component)e.getSource();
            cp.setBackground(Color.CYAN);
        }
        public void mouseExited(MouseEvent e){
            Component cp = (Component)e.getSource();
            cp.setBackground(Color.YELLOW);
        }
        public void mouseDragged(MouseEvent e) {
            la.setText("MouseDragged ("+e.getX()+","+e.getY()+")");
        }
        public void mouseMoved(MouseEvent e) {
            la.setText("MouseMoved ("+e.getX()+","+e.getY()+")");
        }
    }

    public static void main(String[] args) {
        new MouseListenerAllEx();
    }
}
