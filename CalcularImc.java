package imc_232;

public class CalcularImc {

    //variaveis de instancia
    private double peso;
    private double altura;
    private char sexo;
    private double imc;
    private String classificacao;

    //Construtor
    public void CalcularImc() {
        limpar();
    }

    public void limpar() {
        this.peso = 0;
        this.altura = 0;
        this.sexo = 'M';
        this.imc = 0;
        this.classificacao = "";
    }
    //metodos acessores/ modificadores
    //set's/get's

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getSexo() {
        return this.sexo;
    }

    public double getImc() {
        return this.imc;
    }

    public String getClassificacao() {
        return this.classificacao;
    }
    //metodos de negocio

    public void calcular_o_Imc() {
        this.imc = this.peso
                / Math.pow(this.altura, 2.0);
    }

    public void classificar_o_Imc() {
        if (this.sexo == 'M') {
            //masculino
            if (this.imc <= 20.7) {
                this.classificacao = "Abaixo do peso";

            } else if (this.imc <= 26.4) {
                this.classificacao = "Peso ideal";

            } else if (this.imc <= 27.8) {
                this.classificacao = "Pouco acima do peso";

            } else if (this.imc <= 31.1) {
                this.classificacao = "Acima do peso";
            } else {
                this.classificacao = "obesidade";
            }
        } else {

            //feminino
            if (this.imc <= 19.1) {
                this.classificacao = "Abaixo do peso";

            } else if (this.imc <= 25.8) {
                this.classificacao = "Peso ideal";

            } else if (this.imc <= 27.3) {
                this.classificacao = "Pouco acima do peso";

            } else if (this.imc <= 32.3) {
                this.classificacao = "Acima do peso";
            } else {
                this.classificacao = "obesidade";
            }

        }
    }
}
