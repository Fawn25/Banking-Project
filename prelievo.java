
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;
public class prelievo extends JFrame {
    String path = new String();
    JPanel saldoJPanel= new JPanel();
    JLabel nome = new JLabel("Nome: ");
    JTextField nometxt = new JTextField();
    JLabel pin = new JLabel("Pin: ");
    JTextField pintxt = new JTextField();
    JLabel titolo = new JLabel("Prelievo");
    JTextField cognometxt = new JTextField();
    JLabel foto = new JLabel();
    Color buttoncolor = Color.RED.darker();
    Color textbuttoncolor = Color.BLACK.darker().darker();
    JLabel cognome = new JLabel("Cognome: ");
    JButton cerca = new JButton("Preleva");
    JButton exit = new JButton("Esci");
    String [] cast = new String[6];

    JLabel prelievo = new JLabel("Prelievo: ");
    JTextField prelievotxt = new JTextField();


    JLabel deposito1= new JLabel("Saldo residuo: ");
    JLabel deposito = new JLabel();






    public prelievo(){
        inserimento();

        setVisible(true);
    }   



    public void inserimento(){
        setBackground(Color.lightGray);
        setBounds(220, 200, 400, 400);
        setDefaultCloseOperation(3);
        setLayout(null);

        saldoJPanel.setBounds(0, 0, 400, 400);
        saldoJPanel.setLayout(null);
        saldoJPanel.setVisible(true);
        saldoJPanel.setBackground(Color.lightGray);
        add(saldoJPanel);

        System.out.println("Classe prelievo");

        foto.setIcon(new ImageIcon("Logo piccolo.png"));
        foto.setBounds(280, 0, 100, 30);
        saldoJPanel.add(foto);

        titolo.setBounds(0, 0, 400, 30);
        titolo.setBackground(Color.LIGHT_GRAY.darker().darker());
        titolo.setOpaque(true);
        titolo.setForeground(buttoncolor);
        titolo.setFont(new Font("Arial",Font.BOLD,22));
        titolo.setHorizontalAlignment(JLabel.LEFT);
        saldoJPanel.add(titolo);

        nome.setBounds(10,50, 140, 20);
        nome.setFont(new Font("Arial",Font.BOLD,16));
        nome.setForeground(textbuttoncolor);
        saldoJPanel.add(nome);

        nometxt.setBounds(160,50,140,20);
        nometxt.setForeground(buttoncolor);
        nometxt.setFont(new Font("Arial",Font.BOLD,16));
        nometxt.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        nometxt.addKeyListener(new AscoltoKey1());
        saldoJPanel.add(nometxt);


        cognome.setBounds(10,85, 140, 20);
        cognome.setFont(new Font("Arial",Font.BOLD,16));
        cognome.setForeground(textbuttoncolor);
        saldoJPanel.add(cognome);

        cognometxt.setBounds(160,85,140,20);
        cognometxt.setForeground(buttoncolor);
        cognometxt.setFont(new Font("Arial",Font.BOLD,16));
        cognometxt.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        cognometxt.addKeyListener(new AscoltoKey1());
        saldoJPanel.add(cognometxt);


        pin.setBounds(10,120, 140, 20);
        pin.setFont(new Font("Arial",Font.BOLD,16));
        pin.setForeground(textbuttoncolor);
        saldoJPanel.add(pin);


        pintxt.setBounds(160, 120, 140, 20);
        pintxt.setBackground(Color.WHITE);
        pintxt.setOpaque(true);
        pintxt.setForeground(buttoncolor);
        pintxt.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        pintxt.setFont(new Font("Arial",Font.BOLD,16));
        pintxt.addKeyListener(new AscoltoKey());
        saldoJPanel.add(pintxt);


        

        deposito1.setBounds(90, 240, 200, 30);
        deposito1.setBackground(buttoncolor);
        deposito1.setOpaque(true);
        deposito1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        deposito1.setForeground(Color.BLACK);
        deposito1.setFont(new Font("Arial",Font.BOLD,17));
        deposito1.setHorizontalAlignment(JLabel.CENTER);
        deposito1.setVisible(false);
        saldoJPanel.add(deposito1);

        deposito.setBounds(90, 270, 200, 30);
        deposito.setBackground(buttoncolor);
        deposito.setOpaque(true);
        deposito.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        deposito.setForeground(Color.BLACK);
        deposito.setFont(new Font("Arial",Font.BOLD,17));
        deposito.setHorizontalAlignment(JLabel.CENTER);
        deposito.setVisible(false);
        saldoJPanel.add(deposito);



        prelievo.setBounds(10,160 ,140, 20);
        prelievo.setFont(new Font("Arial",Font.BOLD,16));
        prelievo.setForeground(textbuttoncolor);
        saldoJPanel.add(prelievo);

        prelievotxt.setBounds(160, 160, 140, 20);
        prelievotxt.setBackground(Color.WHITE);
        prelievotxt.setOpaque(true);
        prelievotxt.setForeground(buttoncolor);
        prelievotxt.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        prelievotxt.setFont(new Font("Arial",Font.BOLD,16));
        prelievotxt.addKeyListener(new AscoltoKey());
        saldoJPanel.add(prelievotxt);

        cerca.setBounds(70, 190, 100, 30);
        cerca.setBackground(buttoncolor);
        cerca.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        cerca.setForeground(Color.BLACK);
        cerca.setFont(new Font("Arial",Font.BOLD,22));
        cerca.addActionListener(new Ascolto());
        saldoJPanel.add(cerca);

        exit.setBounds(200, 190, 100, 30);
        exit.setBackground(buttoncolor);
        exit.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        exit.setForeground(Color.BLACK);
        exit.setFont(new Font("Arial",Font.BOLD,22));
        exit.addActionListener(new Ascolto());
        saldoJPanel.add(exit);



    }
    public static void main(String[] args) {
        new prelievo();
    }
    public void prelievob(){
        System.out.println("dentro cerca");
        String nomestr = new String();
        String cognomestr = new String();
        String pinstg = new String();
        
        String codice= new String();
        String prelievosString= new String();
        nomestr= nometxt.getText();
        cognomestr= cognometxt.getText();
        pinstg=pintxt.getText();
        prelievosString=prelievotxt.getText();
        Integer valore;
        int depositoint;
        path="File utenti/"+nomestr+cognomestr+pinstg+".txt";
        try {
            FileReader reader = new FileReader(path);
            try {
                int data = reader.read();
                char data1;
                while(data != -1){
                    data1=(char)data;
                    codice=codice+data1;
                    data = reader.read();
                }
                reader.close();
                
            }catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            deposito.setText("Utente non trovato");
            deposito.setVisible(true);
        }
        cast=codice.split(";");


        

        depositoint=Integer.parseInt(cast[4]);
        valore=Integer.parseInt(prelievosString);
        depositoint=depositoint-valore;
        System.out.println(depositoint);

        if(depositoint<0){
            deposito.setText("Credito Insufficente");
            deposito.setVisible(true);
            depositoint=depositoint+valore;
            cast[4]=String.valueOf(depositoint);
            //System.out.println(depositoint);
            rewrite();
        }else{
            deposito.setText(depositoint+"€");
            deposito.setVisible(true);
            deposito1.setVisible(true);
            cast[4]=String.valueOf(depositoint);
            rewrite();
        }
        
        









    }


    public void rewrite(){
        int i=0;
       try {
        FileWriter writer = new FileWriter(path);
        while(i<6){
            writer.append(cast[i]+";");
            i=i+1;
        }
        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

    }
    class Ascolto implements ActionListener{
    	
    	public void actionPerformed(ActionEvent ev){
            Object ob =ev.getSource();
            if (ob==cerca){
                prelievob();
                
                exit.setVisible(true);
            }   
            if(ob==exit){
                dispose();
            }
        }
    }
    class AscoltoKey implements KeyListener{//ascolto sul buffer di tastiera
    	public void keyTyped(KeyEvent t){
    		char ch=t.getKeyChar();
    			
    		if( ( (ch>='0')&& (ch<='9') ) ||(ch=='.'))
    			t.setKeyChar(ch);
    		else 
    				t.consume();
    	}
    	public void keyPressed(KeyEvent t){
    		
    	}
    	public void keyReleased(KeyEvent t){
    		
    		
    	}
    }
    
    class AscoltoKey1 implements KeyListener{//ascolto sul buffer di tastiera
    	public void keyTyped(KeyEvent t){
    		char ch=t.getKeyChar();
    			
    		if( ( (ch>='0')&& (ch<='9') ) ||(ch=='.'))
    			t.consume();
    		else 
                t.setKeyChar(ch);
    	}
    	public void keyPressed(KeyEvent t){
    		
    	}
    	public void keyReleased(KeyEvent t){
    		
    		
    	}
    }


}