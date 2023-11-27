import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class MainFrame extends JFrame {
final private Font mainFont = new Font("Arial", Font.BOLD, 18) ;
JTextField tfFrecuencia, tfElementos;
JLabel lbCalculo0, lbCalculo1, lbCalculo2, lbCalculo3, lbCalculo4, lbCalculo5,lbCalculo6,lbCalculo7,lbCalculo8,lbCalculo9;

    public void initialize() {
        /******** Form Panel *********/
        JLabel lbFrecuencia = new JLabel("Frecuencia (MHz)");
        lbFrecuencia.setFont(mainFont);

        tfFrecuencia = new JTextField();
        tfFrecuencia.setFont(mainFont);

        JLabel lbElementos = new JLabel("Ganancia");
        lbElementos.setFont(mainFont);
        

        tfElementos = new JTextField();
        tfElementos.setFont(mainFont);
        tfElementos.setText("13.4");  // 
        tfElementos.setEditable(false);

        
        /******** PANEL DE TEXTO*********/
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 60, 30, 50));
        formPanel.add(lbFrecuencia);
        formPanel.add(tfFrecuencia);
        formPanel.add(lbElementos);
        formPanel.add(tfElementos);
        

        lbCalculo0 = new JLabel();
        lbCalculo0.setFont(mainFont);

        lbCalculo1 = new JLabel();
        lbCalculo1.setFont(mainFont);

        lbCalculo2 = new JLabel();
        lbCalculo2.setFont(mainFont);

        lbCalculo3 = new JLabel();
        lbCalculo3.setFont(mainFont);

        lbCalculo4 = new JLabel();
        lbCalculo4.setFont(mainFont);

        lbCalculo5 = new JLabel();
        lbCalculo5.setFont(mainFont);

        lbCalculo6 = new JLabel();
        lbCalculo6.setFont(mainFont);

        lbCalculo7 = new JLabel();
        lbCalculo7.setFont(mainFont);

        lbCalculo8 = new JLabel();
        lbCalculo8.setFont(mainFont);

        lbCalculo9 = new JLabel();
        lbCalculo9.setFont(mainFont);

        JButton btnOK = new JButton("Calcular");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double Frecuencia = Double.parseDouble(tfFrecuencia.getText());
                double Elementos = Double.parseDouble(tfElementos.getText());
                double L;
                double Lr;
                double Ld ;
                double Ld2 ;
                double Ld3 ;
                double d ;
                double D ;
                double longOnda ;

                longOnda = 300/ Frecuencia; 
                d = 8.5 * longOnda;
                L = 0.95*50 * longOnda ; 
                Lr = 0.482*100 * longOnda ; 
                Ld = 0.428*100 * longOnda ;   
                Ld2 = 0.420*100 * longOnda ;    
                Ld3 = 0.407*100 * longOnda ;                      
                D = 0.20*100 * longOnda ;           
 
 

                lbCalculo0.setText("Frecuencia: "+ Frecuencia + " MHz");
                lbCalculo1.setText("Elementos: "+ Elementos);
                lbCalculo2.setText("Longitud (L): "+ L + " cm" );
                lbCalculo3.setText("Longitud reflector (Lr): "+ Lr+ "cm");
                lbCalculo4.setText("Longitud director 1 (Ld1): "+ Ld+ "cm");
                lbCalculo5.setText("Longitud director 2 (Ld2): "+ Ld2+ " cm");
                lbCalculo9.setText("Longitud director 3 (Ld2): "+ Ld3+ " cm");
                lbCalculo6.setText("Longitud de onda (λ): "+ longOnda + " m");
                lbCalculo7.setText("Diametro de la varilla (d): "+ d + " mm");
                lbCalculo8.setText("Distancia entre elementos (d): "+ D + " mm");                  

                
            }

        });
        /******** PANEL DE BOTON *********/
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setBorder(BorderFactory.createEmptyBorder(25, 100, 25, 100));
        buttonsPanel.setLayout(new GridLayout(1,2,5,5));
        buttonsPanel.add(btnOK);

        /******** PANEL DE CALCULOS *********/

        
        JPanel CalculoPanel = new JPanel();
        CalculoPanel.setBorder(BorderFactory.createEmptyBorder(25, 10, 25, 10));
        CalculoPanel.setBackground(new Color(156, 156, 156));
        CalculoPanel.setLayout(new GridLayout(10, 1, 5, 5));
        CalculoPanel.add(lbCalculo0);
        CalculoPanel.add(lbCalculo1);
        CalculoPanel.add(lbCalculo6);
        CalculoPanel.add(lbCalculo7);
        CalculoPanel.add(lbCalculo2);
        CalculoPanel.add(lbCalculo3);
        CalculoPanel.add(lbCalculo4);
        CalculoPanel.add(lbCalculo5);
        CalculoPanel.add(lbCalculo9);            
        CalculoPanel.add(lbCalculo8);        



        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.add(formPanel, BorderLayout.NORTH); 
        mainPanel.add(CalculoPanel, BorderLayout.CENTER); 
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH); 
        
        add(mainPanel);
        
        setTitle("Diseño Antena Yagui - Chaski II");
        setSize(500,600);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }

   public static void main(String[] args) {
    MainFrame myFrame = new MainFrame();
    myFrame.initialize();
   }
}
