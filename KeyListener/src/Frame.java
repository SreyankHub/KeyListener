import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Frame extends JFrame implements KeyListener {

    JLabel label;
    JLabel label1;


    Frame() {


        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.GREEN);
        label.setOpaque(true);

        label1 = new JLabel();
        label1.setBounds(385,0,100,100);
        label1.setBackground(Color.BLACK);
        label1.setOpaque(true);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        this.add(label);
        this.add(label1);
        this.addKeyListener(this);
        this.setVisible(true);

    }



    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()) {
            case 'w': label.setLocation(label.getX(),label.getY()-10);
        break;
            case 'a': label.setLocation(label.getX()-10,label.getY());
        break;
            case 's': label.setLocation(label.getX(),label.getY()+10);
        break;
            case 'd': label.setLocation(label.getX()+10,label.getY());
        break;



        }

    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch(e.getKeyCode()) {
            case 38 : label1.setLocation(label1.getX(),label1.getY()-10);
                break;
            case 37 : label1.setLocation(label1.getX()-10,label1.getY());
                break;
            case 40 : label1.setLocation(label1.getX(),label1.getY()+10);
                break;
            case 39 : label1.setLocation(label1.getX()+10,label1.getY());
                break;



        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

        System.out.println("The KeyCode Is:"+e.getKeyCode());
        System.out.println("The KeyChar Is:"+e.getKeyChar());
    }
}
