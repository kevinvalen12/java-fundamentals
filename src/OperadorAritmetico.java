public class OperadorAritmetico {
    public int i; 
    public int j;

    public OperadorAritmetico(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int sumaTtotal(int i, int j) {

        int resultado = i + j;
        return resultado;
    }

    public int restaTotal(int i, int j) {
        int resulatdo = i -j;
        return resulatdo;
    }

    public static void main(String[] args) {
        int i = 4, j = 6;
        
        OperadorAritmetico valor = new OperadorAritmetico(i, j);
        
        int suma = valor.sumaTtotal(45, 5);
        System.out.println("resultado de la suma" + suma);

        int resta = valor.sumaTtotal(i, j);
        System.out.println("resultado de la resta" + resta);

    }
    

}
