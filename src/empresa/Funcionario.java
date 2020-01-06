
package empresa;



public class Funcionario {
    //Propriedades
    String nome;
    double salario;
    
    //Métodos - com retorno
    double recSal(double bonus, double decAdc){
        this.salario = this.salario - (this.salario*0.1);
        return this.salario+bonus - decAdc;
    }
    
    //Métodos - sem retorno
    /*void recSal(){
        this.salario = this.salario - (this.salario*0.1);
        System.out.println(this.salario);
    }*/

    
    
}
