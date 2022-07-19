import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class registrazione extends JFrame {
    JPanel regisJPanel= new JPanel();
    JLabel titolo = new JLabel("Registrazione Conto");
    JLabel nome = new JLabel("Nome: ");
    JLabel cognome = new JLabel("Cognome: ");
    JLabel data = new JLabel("Data di nascita: ");
    JLabel sesso = new JLabel("Sesso: ");
    JLabel pin = new JLabel("Pin generato: ");
    JLabel depositoiniziale = new JLabel("Deposito Iniziale: ");
    JLabel slash = new JLabel("\\");
    JLabel slash1 = new JLabel("\\");
    JLabel valuta = new JLabel("€");
    
    
    
    JTextField nometxt = new JTextField();
    JTextField cognometxt = new JTextField();
    JTextField datatxt1 = new JTextField();
    JTextField datatxt2 = new JTextField();
    JTextField datatxt3 = new JTextField();
    JRadioButton sesso1 = new JRadioButton("Uomo");
    JRadioButton sesso2 =new JRadioButton("Donna");
    ButtonGroup sessogroup = new ButtonGroup();
    JLabel pintxt = new JLabel();
    JTextField depositoinizialetxt = new JTextField();

    JButton crea = new JButton("Crea");
    JButton exit = new JButton("Esci");



    JLabel foto = new JLabel();
    Color buttoncolor = Color.RED.darker();
    Color textbuttoncolor = Color.BLACK.darker().darker();
    Color textFieldColor = Color.RED;
    Color textFieldColorError = Color.BLACK;
    int controllo=0;
    public registrazione(){
        inserimento();






        setVisible(true);
    }


    public void inserimento(){
        setBounds(220, 200, 400, 400);
        setDefaultCloseOperation(3);
        setLayout(null);
        

        regisJPanel.setBounds(0, 0, 400, 400);
        regisJPanel.setLayout(null);
        regisJPanel.setVisible(true);
        regisJPanel.setBackground(Color.lightGray);
        add(regisJPanel);
        
        //foto.setIcon(new ImageIcon("Logo piccolo.png"));
        //foto.setBounds(280, 0, 100, 30);
        //regisJPanel.add(foto);

        titolo.setBounds(0, 0, 400, 30);
        titolo.setBackground(Color.LIGHT_GRAY.darker().darker());
        titolo.setOpaque(true);
        titolo.setForeground(buttoncolor);
        titolo.setFont(new Font("Arial",Font.BOLD,22));
        titolo.setHorizontalAlignment(JLabel.CENTER);
        regisJPanel.add(titolo);

        nome.setBounds(10,50, 140, 20);
        nome.setFont(new Font("Arial",Font.BOLD,16));
        nome.setForeground(textbuttoncolor);
        regisJPanel.add(nome);

        cognome.setBounds(10,85, 140, 20);
        cognome.setFont(new Font("Arial",Font.BOLD,16));
        cognome.setForeground(textbuttoncolor);
        regisJPanel.add(cognome);

        data.setBounds(10,120, 140, 20);
        data.setFont(new Font("Arial",Font.BOLD,16));
        data.setForeground(textbuttoncolor);
        regisJPanel.add(data);

        sesso.setBounds(10,155, 140, 20);
        sesso.setFont(new Font("Arial",Font.BOLD,16));
        sesso.setForeground(textbuttoncolor);
        regisJPanel.add(sesso);


        depositoiniziale.setBounds(10,190, 140, 20);
        depositoiniziale.setFont(new Font("Arial",Font.BOLD,16));
        depositoiniziale.setForeground(textbuttoncolor);
        regisJPanel.add(depositoiniziale);


        pin.setBounds(10,225, 140, 20);
        pin.setFont(new Font("Arial",Font.BOLD,16));
        pin.setForeground(textbuttoncolor);
        regisJPanel.add(pin);
        
    
        nometxt.setBounds(160,50,140,20);
        nometxt.setForeground(textFieldColor);
        nometxt.setFont(new Font("Arial",Font.BOLD,16));
        nometxt.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        nometxt.addKeyListener(new AscoltoKey1());
        regisJPanel.add(nometxt);

        cognometxt.setBounds(160,85,140,20);
        cognometxt.setForeground(textFieldColor);
        cognometxt.setFont(new Font("Arial",Font.BOLD,16));
        cognometxt.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        cognometxt.addKeyListener(new AscoltoKey1());
        regisJPanel.add(cognometxt);
        
        datatxt1.setBounds(160,120,50,20); 
        datatxt1.setForeground(textFieldColor);
        datatxt1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        datatxt1.addKeyListener(new AscoltoKey());
        datatxt1.setFont(new Font("Arial",Font.BOLD,16));

        slash.setBounds(215,120,20,20 );
        slash.setFont(new Font("Arial",Font.BOLD,20));
        regisJPanel.add(slash);

        datatxt2.setBounds(230,120,50,20); 
        datatxt2.setForeground(textFieldColor);
        datatxt2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        datatxt2.addKeyListener(new AscoltoKey());
        datatxt2.setFont(new Font("Arial",Font.BOLD,16));

        slash1.setBounds(285,120,20,20 );
        slash1.setFont(new Font("Arial",Font.BOLD,20));
        regisJPanel.add(slash1);

        datatxt3.setBounds(300,120,50,20); 
        datatxt3.setForeground(textFieldColor);
        datatxt3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        datatxt3.addKeyListener(new AscoltoKey());
        datatxt3.setFont(new Font("Arial",Font.BOLD,16));

        regisJPanel.add(datatxt1);
        regisJPanel.add(datatxt2);
        regisJPanel.add(datatxt3);



        sesso1.setBounds(160, 155, 88, 22);
        sesso1.setOpaque(false);
        sesso1.setForeground(buttoncolor);
        sesso1.setActionCommand("Uomo");
        sesso1.setFont(new Font("Arial",Font.BOLD,16));
        regisJPanel.add(sesso1);
        sesso2.setBounds(260, 155, 88, 22);
        sesso2.setOpaque(false);
        sesso2.setForeground(buttoncolor);
        sesso2.setActionCommand("Donna");
        sesso2.setFont(new Font("Arial",Font.BOLD,16));
        regisJPanel.add(sesso2);
        sessogroup.add(sesso1);
        sessogroup.add(sesso2);
        sesso1.setSelected(true);

        depositoinizialetxt.setBounds(160, 190, 140, 20);
        depositoinizialetxt.setFont(new Font("Arial",Font.BOLD,16));
        depositoinizialetxt.setForeground(textFieldColor);
        depositoinizialetxt.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        depositoinizialetxt.addKeyListener(new AscoltoKey());
        valuta.setBounds(305,190,20,20);
        valuta.setFont(new Font("Arial",Font.BOLD,16));
        regisJPanel.add(valuta);
        regisJPanel.add(depositoinizialetxt);

        pintxt.setBounds(160, 225, 140, 20);
        pintxt.setBackground(Color.WHITE);
        pintxt.setOpaque(true);
        pintxt.setForeground(buttoncolor);
        pintxt.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        pintxt.setFont(new Font("Arial",Font.BOLD,16));
        regisJPanel.add(pintxt);

        crea.setBounds(130, 280, 100, 30);
        crea.setBackground(buttoncolor);
        crea.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        crea.setForeground(Color.BLACK);
        crea.setFont(new Font("Arial",Font.BOLD,22));
        crea.addActionListener(new Ascolto());
        regisJPanel.add(crea);

        exit.setBounds(130, 320, 100, 30);
        exit.setBackground(buttoncolor);
        exit.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        exit.setForeground(Color.BLACK);
        exit.setFont(new Font("Arial",Font.BOLD,22));
        exit.addActionListener(new Ascolto());
        regisJPanel.add(exit);



    }
    public void controllo(){
        String data1str = new String();
        String data2str = new String();
        String data3str = new String();
        String depositostg= new String();
        String nomestr = new String();
        String cognomestr = new String();

        nomestr=nometxt.getText();
        cognomestr=cognometxt.getText();
        data1str=datatxt1.getText();
        data2str=datatxt2.getText();
        data3str=datatxt3.getText();
        depositostg=depositoinizialetxt.getText();

        Integer data1Int=Integer.parseInt(data1str);
        Integer data2Int=Integer.parseInt(data2str);
        Integer data3Int=Integer.parseInt(data3str);
        Integer depositoInt=Integer.parseInt(depositostg);
        boolean nomeInt=nomestr.isEmpty();
        boolean cognomeInt=cognomestr.isEmpty();


        if(nomeInt==true){
            nometxt.setBackground(Color.red);
            nometxt.setText("");
            nometxt.setForeground(textFieldColorError);
            controllo=1;
        }
    		
    	if(cognomeInt==true){
            cognometxt.setBackground(Color.red);
            cognometxt.setText("");
            cognometxt.setForeground(textFieldColorError);
            controllo=1;
        }
    		
        if(data1Int>31 || data1Int<=0){
            datatxt1.setBackground(Color.red);
            datatxt1.setText("");
            datatxt1.setForeground(textFieldColorError);
            controllo=1;
        }

        if(data2Int>12 || data2Int<=0){
            datatxt2.setBackground(Color.red);
            datatxt2.setText("");
            datatxt2.setForeground(textFieldColorError);
            controllo=1;
        }
        
        if(data3Int<1940 || data3Int>2022){
            datatxt3.setBackground(Color.red);
            datatxt3.setText("");
            datatxt3.setForeground(textFieldColorError);
            controllo=1;
        }

        if(depositoInt<=0){
            depositoinizialetxt.setBackground(Color.red);
            depositoinizialetxt.setText("0");
            depositoinizialetxt.setForeground(textFieldColorError);
            controllo=1;
        }

    }
    public void crea(){
        
        String nomestr = new String();
        String cognomestr = new String();
        String datastr = new String();
        String data1str = new String();
        String data2str = new String();
        String data3str = new String();
        String sessostr = new String();
        String depositostg= new String();
        String pinstg = new String();
        int pinint=0;
        
        
        nomestr= nometxt.getText();
        cognomestr= cognometxt.getText();
        data1str=datatxt1.getText();
        data2str=datatxt2.getText();
        data3str=datatxt3.getText();
        datastr=data1str+"/"+data2str+"/"+data3str;
        sessostr=sessogroup.getSelection().getActionCommand();
        depositostg= depositoinizialetxt.getText();

        int i=0;
        while(i<6){//Creazione Pin
    
            pinint=(int)(Math.random()*10);
            pinstg=pinstg+pinint;
            i++; 

        }
        i=0;
        pintxt.setText(pinstg);
        System.out.println("Nome: "+nomestr+"\nCognome: "+cognomestr+"\nData di nascita: "+datastr+"\nSesso: "+sessostr+"\nDeposito iniziale: "+depositostg+"\nPin: "+pinstg);


        try {
            FileWriter writer = new FileWriter("File utenti/"+nomestr+cognomestr+pinstg+".txt");
            writer.append(nomestr+";");writer.append(cognomestr+";");writer.append(datastr+";");writer.append(sessostr+";");writer.append(depositostg+";");writer.append(pinstg+";");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        

    }
    public static void main(String[] args) {
        new registrazione();
    }

    class Ascolto implements ActionListener{
    	
    	public void actionPerformed(ActionEvent ev){
            Object ob =ev.getSource();
            if (ob==crea){
                controllo();
                if(controllo==0){
                    crea();
                    controllo=0;
                }
                controllo=0;
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
