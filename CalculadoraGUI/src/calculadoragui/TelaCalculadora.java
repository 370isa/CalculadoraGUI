package calculadoragui;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaCalculadora extends JFrame implements WindowListener, ActionListener
{
    //Definir Atributos
    protected Button cmdLimparTela, cmdDivi, cmdMult, cmdApaga, cmdSubt, cmdSoma, cmdIgual;
    protected JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, jb0, jbVirgula;
    protected TextArea txtTela;
    protected Dimension dFrame, dText, dButtonUP, dButtonLimpa, dButtonRight, dButtonIgual, dJButtonNum, dJButtonNumZero;
    protected Operacoes mOperacoes;
    
    public TelaCalculadora(){
        mOperacoes = new Operacoes();
        dFrame = new Dimension(360, 510);
        dText = new Dimension(320, 100);
        dButtonUP = new Dimension(75, 45);
        dButtonLimpa = new Dimension(160, 45);
        dButtonRight = new Dimension(75, 75);
        dButtonIgual = new Dimension(75, 117);
        dJButtonNum = new Dimension(75, 65);
        dJButtonNumZero = new Dimension(160, 65);
        
        this.setTitle("Calculadora"); //Titulo janela
        this.setResizable(false); //não redimensioar janela
        this.setSize(dFrame); //Definir o tamanho
        this.setLocation(500, 100); //Localização da janela
        this.setLayout(null); //Resp. prog. definir onde vao os objetos
        
        //Elementos da Tela        
        //---------------------------TELA---------------------------------------
        txtTela = new TextArea(null);
        txtTela.setSize(dText);
        txtTela.setLocation(20 ,10);
        this.add(txtTela);
        addWindowListener(this);
        //----------------------------1ª Coluna---------------------------------
        //Divisão '/'
        cmdDivi = new Button("/");
        cmdDivi.setSize(dButtonUP);
        cmdDivi.setLocation(15,120);
        this.add(cmdDivi);
        cmdDivi.addActionListener(this);
        
        //Numero Sete '7'
        jb7 = new JButton("7");
        jb7.setSize(dJButtonNum);
        jb7.setLocation(15,175);
        this.add(jb7);
        jb7.addActionListener(this);
        
        //Numero Quatro '4'
        jb4 = new JButton("4");
        jb4.setSize(dJButtonNum);
        jb4.setLocation(15,250);
        this.add(jb4);
        jb4.addActionListener(this);
        
        //Numero Um '1'
        jb1 = new JButton("1");
        jb1.setSize(dJButtonNum);
        jb1.setLocation(15,325);
        this.add(jb1);
        jb1.addActionListener(this);
        //----------------------------2ª Coluna---------------------------------
        //Multiplicação '*'
        cmdMult = new Button("*");
        cmdMult.setSize(dButtonUP);
        cmdMult.setLocation(100,120);
        this.add(cmdMult);
        cmdMult.addActionListener(this);
        
        //Numero Oito '8'
        jb8 = new JButton("8");
        jb8.setSize(dJButtonNum);
        jb8.setLocation(100,175);
        this.add(jb8);
        jb8.addActionListener(this);
        
        //Numero Cinco '5'
        jb5 = new JButton("5");
        jb5.setSize(dJButtonNum);
        jb5.setLocation(100,250);
        this.add(jb5);
        jb5.addActionListener(this);
        
        //Numero Dois '2'
        jb2 = new JButton("2");
        jb2.setSize(dJButtonNum);
        jb2.setLocation(100,325);
        this.add(jb2);
        jb2.addActionListener(this);
        
        //Numero Zero '0'
        jb0 = new JButton("0");
        jb0.setSize(dJButtonNumZero);
        jb0.setLocation(15,400);
        this.add(jb0);
        jb0.addActionListener(this);
        //----------------------------3ª Coluna---------------------------------
        //Limpar Tela 'C'
        cmdLimparTela = new Button("C");
        cmdLimparTela.setSize(dButtonLimpa);
        cmdLimparTela.setLocation(185,120);
        this.add(cmdLimparTela);
        cmdLimparTela.addActionListener(this);
        
        //Numero Nove '9'
        jb9 = new JButton("9");
        jb9.setSize(dJButtonNum);
        jb9.setLocation(185,175);
        this.add(jb9);
        jb9.addActionListener(this);
        
        //Numero Seis '6'
        jb6 = new JButton("6");
        jb6.setSize(dJButtonNum);
        jb6.setLocation(185,250);
        this.add(jb6);
        jb6.addActionListener(this);
        
        //Numero Tres '3'
        jb3 = new JButton("3");
        jb3.setSize(dJButtonNum);
        jb3.setLocation(185,325);
        this.add(jb3);
        jb3.addActionListener(this);
        
        //Numero Virgula ','
        jbVirgula = new JButton(",");
        jbVirgula.setSize(dJButtonNum);
        jbVirgula.setLocation(185,400);
        this.add(jbVirgula);
        jbVirgula.addActionListener(this);
        //----------------------------4ª Coluna---------------------------------
        //Subtração '-'
        cmdSubt = new Button("-");
        cmdSubt.setSize(dButtonRight);
        cmdSubt.setLocation(270,175);
        this.add(cmdSubt);
        cmdSubt.addActionListener(this);
        
        //Adição '+'
        cmdSoma = new Button("+");
        cmdSoma.setSize(dButtonRight);
        cmdSoma.setLocation(270,260);
        this.add(cmdSoma);
        cmdSoma.addActionListener(this);
        
        //Igual '='
        cmdIgual = new Button("=");
        cmdIgual.setSize(dButtonIgual);
        cmdIgual.setLocation(270,345);
        this.add(cmdIgual);
        cmdIgual.addActionListener(this);
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
        
    }
    @Override
    public void windowClosing(WindowEvent e) {
        //Depois da janela fechada
        System.exit(0); //Encerra o programa.
    }
    @Override
    public void windowClosed(WindowEvent e) {
        
    }
    @Override
    public void windowIconified(WindowEvent e) {
        
    }
    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }
    @Override
    public void windowActivated(WindowEvent e) {
        
    }
    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String valor;
        String simbol;
        double result;
        while(e.getSource() != cmdIgual)
        {
            if(e.getSource()==cmdLimparTela){
                txtTela.setText(null);
                return;
            }
            if(e.getSource()==jb0){
                int retorno = 0;
                txtTela.append(retorno + "");
                return;
            }
            if(e.getSource()==jb1){
                int retorno = 1;
                txtTela.append(retorno + "");
                return;
            }
            if(e.getSource()==jb2){
                int retorno = 2;
                txtTela.append(retorno + "");
                return;
            }
            if(e.getSource()==jb3){
                int retorno = 3;
                txtTela.append(retorno + "");
                return;
            }
            if(e.getSource()==jb4){
                int retorno = 4;
                txtTela.append(retorno + "");
                return;
            }
            if(e.getSource()==jb5){
                int retorno = 5;
                txtTela.append(retorno + "");
                return;
            }
            if(e.getSource()==jb6){
                int retorno = 6;
                txtTela.append(retorno + "");
                return;
            }
            if(e.getSource()==jb7){
                int retorno = 7;
                txtTela.append(retorno + "");
                return;
            }
            if(e.getSource()==jb8){
                int retorno = 8;
                txtTela.append(retorno + "");
                return;
            }
            if(e.getSource()==jb9){
                int retorno = 9;
                txtTela.append(retorno + "");
                return;
            }
            if(e.getSource()==jbVirgula){
                String retorno = ".";
                txtTela.append(retorno + "");
                return;
            }
            if(e.getSource()==cmdSoma){
                simbol = "+";
                txtTela.append(simbol);
                mOperacoes.setSimbol(simbol);
                return;
            }
            if(e.getSource()==cmdSubt){
                simbol = "-";
                txtTela.append(simbol);
                mOperacoes.setSimbol(simbol);
                return;
            }
            if(e.getSource()==cmdDivi){
                simbol = "/";
                txtTela.append(simbol);
                mOperacoes.setSimbol(simbol);
                return;
            }
            if(e.getSource()==cmdMult){
                simbol = "*";
                txtTela.append(simbol);
                mOperacoes.setSimbol(simbol);
                return;
            }
        }//fim do enquanto
        valor = txtTela.getText();
        mOperacoes.setValor(valor);
        txtTela.setText(null);
        result = mOperacoes.getCalculando();
        txtTela.append("= " + result);
    }

    private void setFont(String arial, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}