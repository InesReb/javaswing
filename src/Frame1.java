import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame1 extends JFrame implements ActionListener{
    private  JTextField text_nom;
    private  JTextField text_prenom;
    private  JTextField text_email;
    private  JTextField text_nump;
    private  JTextField text_numf;
    private  JTextField text_adresse;
    private  JTextField text_classe;
    private  JTextField text_niveau;
    private JLabel nom;
    private JLabel prenom;
    private JLabel email;
    private JLabel nump;
    private JLabel numf;
    private JLabel adresse;
    private JLabel classe;
    private JLabel niveau;
    private JButton btn_ok;
    private JButton btn_annuler;


    public Frame1() {
        text_nom = new JTextField();
        text_prenom = new JTextField();
        text_email = new JTextField();
        text_nump = new JTextField();
        text_numf = new JTextField();
        text_adresse = new JTextField();
        text_classe = new JTextField();
        text_niveau = new JTextField();
        nom = new JLabel("Nom");
        btn_ok = new JButton("OK");
        btn_annuler = new JButton("Annuler");

        JFrame myFrame = new JFrame("frame 1");
        myFrame.setLayout(new BorderLayout(5,5));
        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 4,5,5)); //any rows, 2 cols

        myPanel.add(nom);
        myPanel.add(text_nom);

        myPanel.add(prenom);
        myPanel.add(text_prenom);

        myPanel.add(email);
        myPanel.add(text_email);

        myPanel.add(nump);
        myPanel.add(text_nump);

        myPanel.add(classe);
        myPanel.add(text_classe);

        myPanel.add(adresse);
        myPanel.add(text_adresse);

        myPanel.add(numf);
        myPanel.add(text_numf);

        myPanel.add(niveau);
        myPanel.add(text_niveau);

        myPanel.add(new JLabel("*champ obligatoire"));

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

        btn_ok.addActionListener(this);
        btn_annuler.addActionListener(this);
        myPanel.add(btn_ok);
        myPanel.add(btn_annuler);

    }


    public void actionPerformed (ActionEvent e){

        if(e.getActionCommand().equals("OK")){
            if (text_nom.getText().length() == 0 || text_prenom.getText().length() == 0 || text_email.getText().length() == 0 || text_adresse.getText().length() == 0 || text_numf.getText().length() == 0 || text_nump.getText().length() == 0 || text_classe.getText().length() == 0 || text_niveau.getText().length() == 0)
            {
               JOptionPane.showMessageDialog(null, "Veuillez remplir le champ" + nom.getText());
            }
        }

       if(e.getActionCommand().equals("Annuler")){
           text_nom.setText("");
           text_prenom.setText("");
           text_adresse.setText("");
           text_classe.setText("");
           text_niveau.setText("");
           text_numf.setText("");
           text_nump.setText("");
           text_email.setText("");
       }
    }
}

