package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Selamat datang, " + name + " di Bolain Ajah");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. Apabila bisa menjawab 10 pertanyaan ini, kamu tersertifikasi pundit" + "<br><br>" +
                "2. Jawab dalam jangka waktu yang diberikan" + "<br><br>" +
                "3. Terdapat pilihan 50-50 apabila merasa kesusahan dalam menjawab" + "<br><br>" +
                "4. Jangan panik" + "<br><br>" +
                "5. Dilarang bertanya pada teman" + "<br><br>" +
                "6. Dipersilakan mengerjakan sambil makan dan minum" + "<br><br>" +
                "7. Tetap semangat dan jangan menyerah" + "<br><br>" +
                "8. Selamat mengerjakan" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Kembali");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Mulai");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
