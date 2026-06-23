public class OperadorTernario {
    private int valorUno;
    private int valorDos;
    private double matematicas;
    private double ciencia;
    private double historia;

    private OperadorTernario(
        int valorUno, 
        int valorDos, 
        double matematicas,
        double ciencia,
        double historia
    ) {
        this.valorUno = valorUno;
        this.valorDos = valorDos;
        this.matematicas = matematicas;
        this.ciencia = ciencia;
        this.matematicas = historia;
    }

    // ambigüedad es cuando hay dos cosas con el mismo nombre
    public int unoValor() {
        return this.valorUno;
    }

    public int dosValor() {
        return this.valorDos;
    }

    public double materiaMatematicas() {
        return this.matematicas;
    }
    public double materiaCiencia() {
        return this.ciencia;
    }

    public double materiaHistoria() {
        return this.historia;
    }

    public boolean ternarioIgual() {
        boolean resulado = unoValor() == dosValor();
        return resulado; 
    }

    /**
     * metodo para calcular el promedio
     * @return retorna el resulatdo del promedio
     */
    public double sumaMaterias() {
        return materiaMatematicas() + materiaCiencia() + materiaHistoria();
    }

    public double resulatadoPromedio() {
        double resuladoSuma = sumaMaterias();
        double resulatado= resuladoSuma / 3;
        return resulatado;
    }

    public double enviarPormedio() {
        return resulatadoPromedio();
    }

    public String nota() {
        String  estado = "";
        double promedio = enviarPormedio();
        estado = promedio > 5 ? "Aprobado" : "Reprobado";
        return estado;
    }

    public String enviaNota() {
        return nota();
    }

    // Objetce permite pasar algun tido de balor  
    public void mensage(String mensage, Object datosResulatod) {
        System.out.println(mensage + datosResulatod);
        
    }

    public static void main(String[] args) {
        // instancia o creacion de objeto
        OperadorTernario ternariosDos = new OperadorTernario(0, 0, 9.7, 9.8, 9.7);
        double promedioDos = ternariosDos.enviarPormedio();
        String infoMenssageDos = "prmedio ";
        ternariosDos.mensage(infoMenssageDos, promedioDos);

        OperadorTernario ternarios = new OperadorTernario(5, 5, 0, 0,0);
        String nota = ternarios.enviaNota();
        String infoMenssage = "nota: ";
        ternarios.mensage(infoMenssage, nota);

    }
}
