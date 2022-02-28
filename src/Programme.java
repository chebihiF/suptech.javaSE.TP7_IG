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
        borderLayout.setVgap(10);
        mainPan.setLayout(borderLayout);

        JPanel northPanel = new JPanel();
        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setHgap(20);
        flowLayout.setAlignment(FlowLayout.LEFT);
        northPanel.setLayout(flowLayout);
        northPanel.add(new JLabel("Pseudo : Killer"));
        northPanel.add(new Checkbox("enable"));

        JPanel centerPanel = new JPanel();
        GridLayout gridLayout = new GridLayout(2,2);
        JLabel nom_lbl = new JLabel("Nom :");
        nom_lbl.setFont(new Font("Arial",Font.BOLD,20));
        centerPanel.add(nom_lbl);
        centerPanel.add(new JTextField());
        JLabel prenom_lbl = new JLabel("Prenom :");
        prenom_lbl.setFont(new Font("Arial",Font.BOLD,20));
        centerPanel.add(prenom_lbl);
        centerPanel.add(new JTextField());

        mainPan.add(northPanel,BorderLayout.NORTH);
        mainPan.add(new JButton("South"),BorderLayout.SOUTH);
        mainPan.add(new JButton("East"),BorderLayout.EAST);
        mainPan.add(new JButton("West"),BorderLayout.WEST);
        mainPan.add(centerPanel,BorderLayout.CENTER);


        frame.setContentPane(mainPan);

    }
}
