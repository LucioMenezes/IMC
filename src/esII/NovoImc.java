package esII;

/**
 *
 * @author lucio
 */
public class NovoImc {
    private int idade;
    private double peso;
    private double altura;
    private double imc;

    public NovoImc() {
    }

    public NovoImc(int idade, double peso, double altura, double imc) {
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

     public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    
    public double Calculos(){
        imc = getPeso() / (Math.pow(getAltura(), 2));
        return imc;
    }
    
    public void Avalia(){
        System.out.print("Vocẽ está...");
        
        if(imc <= 17 ){
            System.out.print(" MUITO ABAIXO do peso, CUIDADO!!!\n");
        }else if(imc > 17 && imc <= 18.5){
            System.out.print(" ABAIXO do peso, ATENÇÃO!!!\n");
        } else if (imc > 18.5 && imc <= 25.0) {
            System.out.print(" no peso IDEAL, PARABÉNS!!!\n");
        } else if (imc > 25.0 && imc <= 30.0) {
            System.out.print( " ACIMA do peso, ATENÇÃO!!!\n");
        } else if (imc > 30.0 && imc <= 35) {
            System.out.print(" MUITO ACIMA do peso, com OBESIDADE (grau I).\n");
        } else if (imc > 35 && imc <= 40) {
            System.out.print(" MUITO ACIMA do peso, com OBESIDADE grau II -(SEVERA)!!!.\n");
        } else if (imc > 40) {
            System.out.print(" MUITO ACIMA do peso, com OBESIDADE grau III -(MÓRBIDA)!!!\n");
        }
              
    }
    
}