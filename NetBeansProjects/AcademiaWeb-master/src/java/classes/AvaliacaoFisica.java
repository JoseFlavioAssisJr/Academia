package classes;

public class AvaliacaoFisica{
    private Aluno aluno;
    private Funcionario funcionario;
    private float idade;
    private float gorduraCorporal;
    
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public float getIdade() {
        return idade;
    }

    public void setIdade(float idade) {
        this.idade = idade;
    }

    public float getGorduraCorporal() {
        return gorduraCorporal;
    }

    public void setGorduraCorporal(float gorduraCorporal) {
        this.gorduraCorporal = gorduraCorporal;
    }

    public String calcularAvaliacaoFisica(IAvaliacaoFisica Avaliacao){
        //float imc;
        String sexo = Avaliacao.getSexo();
        String resultado = null;
        this.setGorduraCorporal(Avaliacao.calcularAvaliacaoFisica());
        
        if(sexo.equals("masculino")){ //1
            if(this.getGorduraCorporal() < 5.3f){ //2
            resultado = ("Muito magro"); //3
            }
            else if(this.getGorduraCorporal() < 9.3f){ //4
                resultado = ("Magro"); //5
            }
            else if(this.getGorduraCorporal() < 14.02f){ //6
                resultado = ("Muito bom"); //7
            }
            else if(this.getGorduraCorporal() < 17.6f){ //8
                resultado = ("Saudável"); //9
            }
            else if(this.getGorduraCorporal() < 22.5f){ //10
                resultado = ("Sobrepeso"); //11
            }
            else if(this.getGorduraCorporal() < 29.3f){ //12
                resultado = ("Gordo"); //13
            }
            else { //14
                resultado = ("Muito gordo"); //15
            }
        }
        else{ //16
            if(this.getGorduraCorporal() < 10.8f){ //17
            resultado = ("Muito magro"); //18
            }
            else if(this.getGorduraCorporal() < 17.1f){ //19
                resultado = ("Magro"); //20
            }
            else if(this.getGorduraCorporal() < 20.6f){ //21
                resultado = ("Muito bom"); //22
            }
            else if(this.getGorduraCorporal() < 23.9){ //23
                resultado = ("Saudável"); //24
            }
            else if(this.getGorduraCorporal() < 27.7){ //25
                resultado = ("Sobrepeso"); //26
            }
            else if(this.getGorduraCorporal() < 35.6f){ //27
                resultado = ("Gordo"); //28
            }
            else { //29
                resultado = ("Muito gordo"); //30
            }
        }
        return resultado;//31
    }
    
//    public String calcularIMCJunit(){
//        String resultado;
//        imc = peso/(altura*altura);
//        
//        if (this.getAluno().getSexo().equals("feminino")){ //1
//            if(imc < 19.1) //2
//                resultado = "Abaixo do peso"; //3  
//            else if(imc < 25.8) //4
//                resultado = "Peso normal"; //5
//            else if(imc < 27.3) //6
//                resultado = "Marginalmente acima do peso";//7
//            else if(imc < 32.3) //8
//                resultado = "Acima do peso";//9
//            else 
//                resultado = "Obeso";//10
//        } else {       
//            if(imc < 20.7)//11
//                resultado = "Abaixo do peso";//12
//            else if(imc < 26.4)//13
//                resultado = "Peso normal";//14
//            else if(imc < 27.8)//15
//                resultado = "Marginalmente acima do peso";//16
//            else if(imc < 31.1)//17
//                resultado = "Acima do peso";//18
//            else 
//                resultado = "Obeso";//19
//        } 
//
//        return resultado;
//    }
    
//    public void cadastrarAvaliacaoFisica(Aluno aluno, Funcionario funcionario, float peso, float altura) {
//        this.setAluno(aluno);
//        this.setFuncionario(funcionario);
//        this.setAltura(altura);
//        this.setPeso(peso);
//        this.setImc(peso/(altura*altura));
//    }
//    
//    public void editarAvaliacaoFisica(Aluno aluno, Funcionario funcionario, float peso, float altura) {
//        this.setAluno(aluno);
//        this.setFuncionario(funcionario);
//        this.setAltura(altura);
//        this.setPeso(peso);
//        this.setImc(peso/(altura*altura));
//    }
    
}
