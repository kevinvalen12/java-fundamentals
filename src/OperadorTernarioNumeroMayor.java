import javax.swing.JOptionPane;

public class OperadorTernarioNumeroMayor {
    private int max;
    private int valorUno;
    private int valorDos;
    private int valorTres;

    private OperadorTernarioNumeroMayor(
        int valorUno,
        int valorDos,
        int valorTres,
        int max
    ) {
        this.valorUno = valorUno;
        this.valorDos = valorDos;
        this.valorTres = valorTres;
        this.max = max;
    }

    public int valorMax() {
        return this.max;
    }

    public int  unovalor() {
        return this.valorUno;
    }

    public int  dosvalor() {
        return this.valorDos;
    }

    public int  tresValor() {
        return this.valorTres;
    }

    public String datosDeEntrada() {
       return JOptionPane.showInputDialog("ingresa un algun valor");
    }

    public int comverInt() {
        String entrada = datosDeEntrada(); 
        int comvercion = Integer.parseInt(entrada);
        return comvercion;
    }

    public void cambiarDatos() {
        valorUno = comverInt();
        valorDos = comverInt();
        valorTres = comverInt();
    }

    public void numeroMay() {
        max = valorUno > valorDos ? valorUno : valorDos;
        max = max > valorTres ? max : valorTres; 
    }

    public void mensage() {
        cambiarDatos();
        numeroMay();
        System.out.println("valores: cambiado: " + valorMax());
    }

    public static void main(String[] args) {
        int valorUno = 0;
        int valorDos = 0;
        int valorTres = 0;
        int valorMaxinmo = 0;

        OperadorTernarioNumeroMayor maximo = new OperadorTernarioNumeroMayor(valorUno, valorDos, valorTres, valorMaxinmo);        

        maximo.mensage();
    }
}
