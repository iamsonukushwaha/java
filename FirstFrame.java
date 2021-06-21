import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class FirstFrame extends JFrame{

    static JButton b;
    FirstFrame() {

        this.setSize(600, 500);
        this.setTitle("First Frame");

        this.setLayout(null);
        // this.setLayout(new FlowLayout(FlowLayout.RIGHT));

        b = new JButton("Click Me");
        // b.setBounds(x, y, width, height);
        b.setBounds(200, 200, 200, 60);
        this.add(b);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FirstFrame();
    }
}