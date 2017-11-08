package calculadoragui;

public class Operacoes {
    private String simbol;
    private double result1;
    private double result2;
    private double calculando;
    
    public double getCalculando(){        
        switch (this.simbol){
            case "+":
                this.calculando = this.result1+this.result2;
                break;
            case "-":
                this.calculando = this.result1-this.result2;
                break;
            case "/":
                this.calculando = this.result1/this.result2;
                break;
            case "*":
                this.calculando = this.result1*this.result2;
                break;
            default:
                this.calculando = 0;
                break;
        }
        return this.calculando;
    }
    
    public void setValor(String valor){
        String[] split = valor.split("\\"+this.simbol);
        this.result1 = Double.parseDouble(split[0]);
        this.result2 = Double.parseDouble(split[1]);
    }
    
    public void setSimbol(String simbol){
        this.simbol = simbol;        
    }
}