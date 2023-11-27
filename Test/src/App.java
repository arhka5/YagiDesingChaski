import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame implements ActionListener {
    private JLabel label1, label2, label3;
    private JTextField textfield1, textfield2, textfield3;
    private JButton boton;
    private Container contenedor;
    private int resultado;

    public App() {
        super("Suma de números");
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());

        label1 = new JLabel("Número 1:");
        contenedor.add(label1);
        textfield1 = new JTextField(10);
        contenedor.add(textfield1);

        label2 = new JLabel("Número 2:");
        contenedor.add(label2);
        textfield2 = new JTextField(10);
        contenedor.add(textfield2);

        boton = new JButton("Sumar");
        contenedor.add(boton);
        boton.addActionListener(this);

        label3 = new JLabel("Resultado:");
        contenedor.add(label3);
        textfield3 = new JTextField(10);
        textfield3.setEditable(false);
        contenedor.add(textfield3);

        setSize(200, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent evento) {
        int num1 = Integer.parseInt(textfield1.getText());
        int num2 = Integer.parseInt(textfield2.getText());
        resultado = num1 + num2;
        textfield3.setText(Integer.toString(resultado));
    }

    public static void main(String[] args) {
        App suma = new App();
        suma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
