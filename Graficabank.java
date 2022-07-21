import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;    
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Graficabank extends JFrame{
    JFrame jf = new JFrame();
    Color buttoncolor = Color.RED.darker();
    Color textbuttoncolor = Color.BLACK.darker().darker();
    
    JLabel titolo = new JLabel("Cosa vuoi fare ");
    JButton Regis = new JButton("Registrazione");
    JButton Prelievo = new JButton("Prelievo");
    JButton Deposito = new JButton("Deposito");
    JButton Saldo = new JButton("Saldo");
    //Container c = getContentPane();
        
    


    JLabel foto = new JLabel();



    public Graficabank(){
        jf.setBounds(200, 200, 400, 400);    
        jf.setLayout(null);
        jf.setDefaultCloseOperation(3);

        
        titolo.setBounds(0, 105, 400, 30);
        titolo.setBackground(Color.BLACK.brighter());
        titolo.setOpaque(true);
        titolo.setForeground(buttoncolor);
        titolo.setFont(new Font("Arial",Font.BOLD,22));
        titolo.setHorizontalAlignment(JLabel.CENTER);
        jf.add(titolo);
        
        Regis.setBounds(110, 155, 150, 30);
        Regis.setBorderPainted(false);
        Regis.setBackground(buttoncolor);
        Regis.setFont(new Font("Arial",Font.BOLD,15));
        Regis.setForeground(textbuttoncolor);
        Regis.addActionListener(new Ascolto());
        jf.add(Regis);


        Saldo.setBounds(110, 205, 150, 30);
        Saldo.setBorderPainted(false);
        Saldo.setBackground(buttoncolor);
        Saldo.setFont(new Font("Arial",Font.BOLD,15));
        Saldo.setForeground(textbuttoncolor);
        Saldo.addActionListener(new Ascolto());
        jf.add(Saldo);


        Prelievo.setBounds(110, 255, 150, 30);
        Prelievo.setBorderPainted(false);
        Prelievo.setBackground(buttoncolor);
        Prelievo.setFont(new Font("Arial",Font.BOLD,15));
        Prelievo.setForeground(textbuttoncolor);
        Prelievo.addActionListener(new Ascolto());
        jf.add(Prelievo);

        Deposito.setBounds(110, 305, 150, 30);
        Deposito.setBorderPainted(false);
        Deposito.setBackground(buttoncolor);
        Deposito.setFont(new Font("Arial",Font.BOLD,15));
        Deposito.setForeground(textbuttoncolor);
        Deposito.addActionListener(new Ascolto());
        jf.add(Deposito);

        
    
        foto.setIcon(new ImageIcon("Logo grande.png"));
        foto.setBounds(32, 0, 333, 100);
        jf.add(foto);

        


        jf.setVisible(true);
    }
        public void regis(){
            //System.out.println("Registrazione: ");
            new registrazione();
        }

        public void prelievo(){
            System.out.println("Prelievo: ");
            new prelievo();
        }

        public void saldo(){
            System.out.println("Saldo: ");
            new saldo();

        }

        public void deposito(){
            System.out.println("Deposito: ");
            new deposito();
        }
    public static void main(String[] args) {
    
    //String pathCartellaName = "/Banking-Project-main";
    File cartella = new File("File Utenti");
    if(!cartella.isDirectory())
        cartella.mkdir();     

    new Graficabank();

    }

    public class Ascolto implements ActionListener{
        public void actionPerformed(ActionEvent ex){
            Object bj = ex.getSource();

            if(bj==Regis){
                regis();
                
            }
            if(bj==Deposito){
                deposito();
                
            }
            if(bj==Prelievo){
                prelievo();
                
            }
            if(bj==Saldo){
                saldo();
            }
        }
    }


}


