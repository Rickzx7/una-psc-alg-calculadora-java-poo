public class calculadora {
    private double numeroUm;
    private double numeroDois;

    public calculadora(double numeroUm, double numeroDois) {
        this.numeroUm = numeroUm;
        this.numeroDois = numeroDois;
    }
    public double somar() {
        return numeroUm + numeroDois;
    }

    public double subtrair() {
        return numeroUm - numeroDois;
    }

    public double multiplicar() {
        return numeroUm * numeroDois;
    }

    public String dividir() {
        if (numeroDois == 0) {
            return "Impossível realizar uma divisão por zero.";
        }
        return String.valueOf(numeroUm / numeroDois);
    }

    public double potencia() {
        return Math.pow(numeroUm, numeroDois);
    }

    public String raizQuadrada() {
        if (numeroUm < 0) {
            return "Não existe raiz de número negativo.";
        }
        return String.valueOf(Math.sqrt(numeroUm));
    }
}