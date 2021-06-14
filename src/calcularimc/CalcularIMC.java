package calcularimc;
import static java.lang.Math.*;

public class CalcularIMC {

    public static double RetornaIMC(double peso, double altura)
    {
        return (peso/pow(altura,2));
    }
    
    public static void main(String[] args) 
    {
        double resultado = RetornaIMC(1000, 1.60);
       
        System.out.println("IMC: "+resultado);
        
        if(resultado<18.5)
            System.out.println("Abaixo do peso");
        else if(18.5<=resultado && resultado<=25)
            System.out.println("Peso Normal");
        else if(25<resultado && resultado<=30)
            System.out.println("Acima do Peso");
        else
            System.out.println("obeso");
    }
    
    
    
}
