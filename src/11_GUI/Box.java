package jb11.ManajemenLayout;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Box extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JPanel mPanel;
    
    public Box(){
        mPanel = new JPanel();
        mPanel.setLayout(new BoxLayout(mPanel, BoxLayout.Y_AXIS));
        mPanel.add(new JButton("1"));
        mPanel.add(new JButton("2"));
        mPanel.add(new JButton("3"));
        mPanel.add(new JButton("4"));
        mPanel.add(new JButton("5"));
        
        add(mPanel);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Box Layout Demo");
    }
}
