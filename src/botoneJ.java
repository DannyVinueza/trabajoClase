import javax.swing.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;
import java.util.Hashtable;

public class botoneJ {

     static Hashtable<String,String> Colores = new Hashtable<String,String>();
    private JButton button1;
    private JCheckBox checkBox1;
    private JComboBox jcombobox;
    private JList lista1;
    private JLabel salida;
    private JPanel botoneJ;


    public botoneJ() {
        String week[]= { "Monday","Tuesday","Wednesday",
                "Thursday","Friday","Saturday","Sunday"};
        lista1.setListData(week);

        jcombobox.addItem("Rojo");
        jcombobox.addItem("AzSul");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salida.setText((button1.getText()));
            }
        });
        checkBox1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

                salida.setText((checkBox1.getText()));
            }
        });



       jcombobox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                salida.setText((String)(jcombobox.getSelectedItem()));

            }
        });

        lista1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                salida.setText((String)(lista1.getSelectedValue()));





            }
        });
    }

    public static void main(String[] args) {
        JFrame frame =new JFrame("botoneJ");

        frame.setContentPane(new botoneJ().botoneJ);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.pack();
        frame.setVisible(true);
    }


}
