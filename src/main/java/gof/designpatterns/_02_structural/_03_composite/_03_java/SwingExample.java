package gof.designpatterns._02_structural._03_composite._03_java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample {

  public static void main(String[] args) {
    // Swing의 Component 인터페이스가 Component에 해당

    // JFrame이 Composite에 해당
    JFrame frame = new JFrame();

    // JTextField는 Leaf에 해당
    JTextField textField = new JTextField();
    textField.setBounds(200, 200, 200, 40);
    frame.add(textField);

    // JButton은 Leaf에 해당
    JButton button = new JButton("click");
    button.setBounds(200, 100, 60, 40);
    button.addActionListener(e -> textField.setText("Hello Swing"));

    frame.add(button);
    frame.setSize(600, 400);
    frame.setLayout(null);
    frame.setVisible(true );
  }
}
