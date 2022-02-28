import javax.swing.*;
import java.awt.*;

public class Programme {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel mainPan = new JPanel();
        BorderLayout borderLayout = new BorderLayout();
        borderLayout.setHgap(10);
        borderLayout.setVgap(30);
        mainPan.setLayout(borderLayout);

        mainPan.add(new JButton("North"),BorderLayout.NORTH);
        mainPan.add(new JButton("South"),BorderLayout.SOUTH);
        mainPan.add(new JButton("East"),BorderLayout.EAST);
        mainPan.add(new JButton("West"),BorderLayout.WEST);
        mainPan.add(new JButton("Center"),BorderLayout.CENTER);


        frame.setContentPane(mainPan);

    }
}
