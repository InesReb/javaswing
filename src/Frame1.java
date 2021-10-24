import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame1 extends JFrame {
    public Frame1(){

            JButton btn_annuler = new JButton("Annuler");
            btn_annuler.setBounds(150,310,100,40);
            JTextField text_nom = new JTextField();
            text_nom.setBounds(10,10,365,290);
            add(btn_annuler);
            add(text_nom);

            btn_annuler.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    text_nom.setText("");
                }
            });
    }

    public static void main(String[] args) {
        JTextField text_nom = new JTextField();
        JTextField text_prenom = new JTextField();
        JTextField text_email = new JTextField();
        JTextField text_nump = new JTextField();
        JTextField text_numf = new JTextField();
        JTextField text_adresse = new JTextField();
        JTextField text_classe = new JTextField();
        JTextField text_niveau = new JTextField();
        JButton btn_ok = new JButton("OK");
        JButton btn_annuler = new JButton("Annuler");

        JFrame myFrame = new JFrame("frame 1");
        myFrame.setLayout(new BorderLayout(5,5));
        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 4,5,5)); //any rows, 2 cols
        myPanel.add(new JLabel("Nom"));
        myPanel.add(text_nom);
        myPanel.add(new JLabel("Prenom"));
        myPanel.add(text_prenom);
        myPanel.add(new JLabel("Email"));
        myPanel.add(text_email);
        myPanel.add(new JLabel("Numéro portable"));
        myPanel.add(text_nump);
        myPanel.add(new JLabel("classe"));
        myPanel.add(text_classe);
        myPanel.add(new JLabel("Adresse"));
        myPanel.add(text_adresse);
        myPanel.add(new JLabel("Numéro fixe"));
        myPanel.add(text_numf);
        myPanel.add(new JLabel("Niveau"));
        myPanel.add(text_niveau);
        myPanel.add(new JLabel("*champ obligatoire"));
        myPanel.add(btn_ok);
        myPanel.add(btn_annuler);
        myFrame.add(myPanel, BorderLayout.NORTH);
        myFrame.pack();
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel myPan1 = new JPanel();
        myPan1.setBackground(Color.ORANGE);
        myFrame.add(myPan1, BorderLayout.SOUTH);

        JPanel myPan2 = new JPanel();
        myPan2.setLayout(new GridLayout(0, 4,5,5));
        myPan2.setBackground(Color.GREEN);
        myFrame.add(myPan2, BorderLayout.WEST);

        JPanel myPan3 = new JPanel();
        myPan3.setLayout(new GridLayout(0, 4,5,5));
        myPan3.setBackground(Color.BLUE);
        myFrame.add(myPan3, BorderLayout.EAST);

        JPanel myPan4 = new JPanel();
        myPan4.setLayout(new GridLayout(0, 4,5,5));
        myPan4.setBackground(Color.RED);
        myFrame.add(myPan4, BorderLayout.CENTER);

        new Frame1();
    }
}

