package text.editor.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JScrollPane scrollPane;
    public TextEditor(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Text Editor");
        this.setSize(700, 600);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);

        textArea=new JTextArea();
        //textArea.setPreferredSize(new Dimension(650,550));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Arial",Font.PLAIN,20));

        scrollPane=new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(650, 550));
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        this.add(scrollPane);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){}
}
