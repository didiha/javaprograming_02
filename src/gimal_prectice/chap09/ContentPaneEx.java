package gimal_prectice.chap09;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
    public ContentPaneEx() {
        setTitle("ContentPane과 JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫을 때 프로그램을 종료하도록 설정

        Container contentPane = getContentPane(); // 컴포넌트 그룹화
        contentPane.setBackground(Color.ORANGE); // 배경색은 오렌지
        contentPane.setLayout(new FlowLayout()); // 레이아웃을 FlowLayout, 왼&위쪽 정렬

        // 컴포넌트 - 버튼
        contentPane.add(new JButton("OK"));
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("Ignore"));

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ContentPaneEx();
    }
}

