
public class SentenciaIfElseNumDiaMes {
    private final int año;
    private final int mes;
    private int dias;

    private SentenciaIfElseNumDiaMes(int mes, int año) {
        this.mes = mes;
        this.año = año;
    }

    private int mes() {
        return this.mes;
    }

    private int dis() {
        return this.dias;
    }

    private int año() {
        return this.año;
    }

    /**
     * Metodo compara si el mes digita en viciesto o no
     * @return Boleano 
     */
    public boolean calcularDiaTienesMes() {
        int mes = mes();
        int[] viciestos = {2, 6, 11};

        /*
         * busca si el mes digita es viciesto
         *opte por un bucle for-each 
         TODO: r esta manera ya hacer varios mes == 1 y susesivamente no es buena practica y se ve muy feo 
        */
        for (int vici : viciestos) {
            if(mes == vici) {
                return false;
            }
        }

         return mes >= 1 && mes <= 12;
    }

    public void IdentificarMes() {
        boolean mes = calcularDiaTienesMes();

        if(mes) {
            this.dias = 30;
        } else {
            this.dias = 28;
        }
    }

    public boolean extracionDivicsor() {
        boolean resulatdo = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
        if(resulatdo) {
            return  true;
        }

        return false;
    }

    public boolean calcularAñoVi() {
        boolean resulatdo = extracionDivicsor();
        boolean añoSiViciesto = false;

        if(resulatdo) {
            añoSiViciesto = true;
            return añoSiViciesto;
        }
        return añoSiViciesto;
    }

    public String IdentificarAño() {
        IdentificarMes();
        boolean calculoFinal = calcularAñoVi();
        String resuString = "";

        if(!calculoFinal) {
            resuString = año() + " Es ano no es viciesto tiene " + dis() + " Dias";
        }

        resuString = año() + " Es ano es viciesto y tiene " + dis() + " Dias";

        return resuString;
    }

    
 
    public static void main(String[] args) {
        int mes = 9;
        int año = 2024; 
        SentenciaIfElseNumDiaMes meses = new SentenciaIfElseNumDiaMes(mes, año);

        String calculoViciesto = meses.IdentificarAño();
        System.out.println(calculoViciesto);
    }
}
