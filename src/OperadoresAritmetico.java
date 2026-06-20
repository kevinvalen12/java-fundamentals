import javax.swing.JOptionPane;

public class OperadoresAritmetico {
    public int i; 
    public int j;

    public OperadoresAritmetico(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int sumaTtotal(int i, int j) {
        int resultado = i + j;
        return resultado;
    }

    public int restaTotal(int i, int j) {
        int resulatdo =  i - j;
        return resulatdo;
    }

    public int multiplicacionTotal(int i, int j) {
        int resulatdo = i * j;
        return resulatdo;
    }

    public float divisionesTotal(int i, int j) {
        float floatI = (float)i;
        float floatJ = (float)j;
        float resulatdo = floatI / floatJ;
        return resulatdo;
    }

    public int restoTotal(int sumaTtotal, int j) {
        int resultado = i % j;
        return resultado;
    }

    public void validarNumeroPrimo(int valroDIgital, int resto) {
        boolean restoIf = resto == 0;

        if (!restoIf) {
            System.out.println(valroDIgital + " no es un numero primo");

        } else {
            System.out.println(valroDIgital + " es un numero primo");
        }
    }

    public static void main(String[] args) {
        int i = 56, j = 6;
        
        OperadoresAritmetico valor = new OperadoresAritmetico(i, j);
        
        int suma = valor.sumaTtotal(45, 5);
        System.out.println("resultado de la suma: " + suma);

        int resta = valor.sumaTtotal(i, j);
        System.out.println("resultado de la resta: " + resta);

        int multiplicacion = valor.multiplicacionTotal(i, j);
        System.out.println("resultado de la multilicación: " + multiplicacion);

        float division = valor.divisionesTotal(i, j);
        System.out.println("resultado de laa division: " + division);

        int valorDigital = Integer.parseInt(JOptionPane.showInputDialog("escribe el valor"));
        int resto = valor.restoTotal(valorDigital, j);
        System.out.println("resultado de laa reesto de la división: " + resto);
        

        valor.validarNumeroPrimo(valorDigital, resto);

    }
    

}
