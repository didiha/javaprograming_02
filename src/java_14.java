import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class java_14 {
    public class Chapter14_6 extends JFrame{
        JLabel result;
        JTextField tf1=new JTextField(10), tf2=new JTextField(10);

        class MyDialog extends JDialog{
            public MyDialog(JFrame frame, String title) {
                super(frame, title);
                setLayout(new GridLayout(4,1));
                JLabel label=new JLabel("두 수를 더합니다.");
                JButton button=new JButton("Add");

                add(label);
                add(tf1);
                add(tf2);

                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int num1, num2;
                        num1=Integer.parseInt(tf1.getText());
                        num2=Integer.parseInt(tf2.getText());

                        result.setText(Integer.toString(num1+num2));

                        setVisible(false);
                    }
                });

                add(button);

                setSize(200,100);
            }
        }

        Chapter14_6(){
            setSize(400, 300);
            setTitle("오디오 시작 중단 연습");
            setLayout(new FlowLayout());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            MyDialog dialog=new MyDialog(this, "Test Dialog");

            JButton cal=new JButton("Calculator");
            cal.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    dialog.setVisible(true);
                }
            });

            result=new JLabel("계산 결과 출력");
            result.setOpaque(true);
            result.setBackground(Color.GREEN);

            add(cal);
            add(result);

            setVisible(true);
        }


        public void main(String[] args) {
            new Chapter14_6();
        }
    }
}
