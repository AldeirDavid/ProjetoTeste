
package empresa;


public class Empresa {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        
           f1.nome = "José";
           f1.salario = 5000;
      
           double salRec = f1.recSal(150,00);
           System.out.println("O salário do José é: "+(salRec+100));
           
           
        
    }
    
    
}
