package calculoadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventana extends JFrame {

    JPanel panelInicio = new JPanel();
    JTextField txtvalor1 = new JTextField();
    JTextField txtvalor2 = new JTextField();
    JLabel lblresultado = new JLabel("total");
    int valor1 = 0;

    public ventana() {
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void insertarPanel() {
        this.getContentPane().add(panelInicio);
        panelInicio.setLayout(null);
    }

    public void insertarEtiquetas() {
        JLabel lblvalor1 = new JLabel("ingrese el primer valor");
        lblvalor1.setBounds(20, 10, 200, 15);
        panelInicio.add(lblvalor1);

        JLabel lblvalor2 = new JLabel("ingrese el segundo valor");
        lblvalor2.setBounds(20, 80, 200, 15);
        panelInicio.add(lblvalor2);

        lblresultado.setBounds(20, 180, 200, 25);
        panelInicio.add(lblresultado);
    }

    public void insertarTexto() {

        txtvalor1.setBounds(190, 10, 150, 25);
        panelInicio.add(txtvalor1);
        txtvalor1.repaint();

        txtvalor2.setBounds(190, 80, 150, 25);
        panelInicio.add(txtvalor2);
        txtvalor2.repaint();

    }

    public void insertarBotones() {
        JButton btnsumar = new JButton("sumar");
        btnsumar.setBounds(120, 130, 80, 30);
        panelInicio.add(btnsumar);
        btnsumar.repaint();

        ActionListener sumando = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valor1 = txtvalor1.getText();
                String valor2 = txtvalor2.getText();

                if (valor1.equals("") || valor2.equals("")) {
                    JOptionPane.showMessageDialog(null, "debe llenar todos los campos");
                } else {
                    int resultadosum = Integer.parseInt(valor1) + Integer.parseInt(valor2);

                    lblresultado.setText(String.valueOf(resultadosum));
                }
            }
        };
        btnsumar.addActionListener(sumando);
        JButton btnsum = new JButton("+");
        btnsum.setBounds(230, 130, 60, 30);
        panelInicio.add(btnsum);
        btnsum.repaint();
        ActionListener suma2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtvalor1.getText().equals("")) {
                   JOptionPane.showMessageDialog(null, "ingrese el valor");
                }else{
                    valor1+=  Integer.parseInt(txtvalor1.getText());
                    txtvalor1.setText("");
            }
        }
    };
        btnsum.addActionListener(suma2);
        JButton btnig = new JButton("=");
        panelInicio.add(btnig);
        btnig.setBounds(300,130,60,30);
                ActionListener resul= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtvalor1.setText(String.valueOf(valor1));
            }
        } ;
       btnig.addActionListener(resul);


    JButton btn1 = new JButton("1");
    btn1.setBounds (120, 180, 50, 30);
    panelInicio.add (btn1);
    btn1.repaint ();
    ActionListener agregar1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String union = txtvalor1.getText() + "1";
            txtvalor1.setText(union);
        }
    };

    btn1.addActionListener (agregar1);

    JButton btn2 = new JButton("2");

    btn2.setBounds (

    180, 180, 50, 30);
    panelInicio.add (btn2);

    btn2.repaint ();
    ActionListener agregar2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String union = txtvalor1.getText() + "2";
            txtvalor1.setText(union);
        }

    };

    btn2.addActionListener (agregar2);

    
}

}
