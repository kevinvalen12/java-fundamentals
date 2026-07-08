import javax.swing.JOptionPane;

public class SentenciaSwitchCase {
    private int digitado;

    private SentenciaSwitchCase(int digitado) {
        this.digitado = digitado;
    }

    private int getDigitado() {
        return this.digitado;
    }

    /**
     * Metodo para comparar si el numoro esat entre 1 y 12
     * @return retorna True si el valor digtada, Fale si no se encuentra en el rango
     */
    public boolean validar() {
        int valor = getDigitado();
        boolean comparacion = valor >= 1 && valor <= 12;
        if(comparacion) {
            return true;
        }

        return false;
    }

    /**
     * metodo para retornar el mes 
     * @param posicion es la posicion del mes que se requiere
     * @return retonar el mes que se requiere
    */
    public String mesArray(int posicion) {
        String[] mesesArray = {
            "Enero",
            "Febrero",
            "Marzo",
            "Abril",
            "Mayo",
            "Junio",
            "Julio",
            "Agosto",
            "Septiembre",
            "Octubre",
            "Noviembre",
            "Diciembre"
        };

        return mesesArray[posicion];
    }

    /**
     * Metodo para para mostrar el mes digitado por el usuario
     * @param valor es el valor digitado por el usuario
     * @return retorna el mes dependiendo el numero digitado por el usaurio
     */
    public String validarS(int valor) {
        String mes = "";
        switch (valor) {
            case 1:
                int posicion = 0;
                mes = mesArray(posicion);
                break;
            case 2:
                int posicionUno = 1;
                mes = mesArray(posicionUno);
                break;
            case 3:
                int posicionDos = 2;
                mes = mesArray(posicionDos);
                break;
            case 4:
                int posicionTres = 3;
                mes = mesArray(posicionTres);
                break;
            case 5:
                int posicionCuatro = 4;
                mes = mesArray(posicionCuatro);
                break;
            case 6:
                int posicionCinco = 5;
                mes = mesArray(posicionCinco);
                break;
            case 7:
                int posicionSeis = 6;
                mes = mesArray(posicionSeis);
                break;
            case 8:
                int posicionSiete = 7;
                mes = mesArray(posicionSiete);
                break;
            case 9:
                int posicionOcho = 8;
                mes = mesArray(posicionOcho);
                break;
            case 10:
                int posicionDies = 9;
                mes = mesArray(posicionDies);
                break;
            case 11:
                int posicionOnce = 10;
                mes = mesArray(posicionOnce);
                break;
            case 12:
                int posicionDoce = 11;
                mes = mesArray(posicionDoce);
                break;
            default:
                break;
        }

        return mes;
    }

    /**
     * metedo para validar si el usuario digito el numero en el rango adecuado
     * @return retorna un mensaje si esta en el rango meustra el mes digitado sino el mensaje donde  el numero no esta en el rango 
     */
    public String sentencia() {
        boolean validarSwitch = validar();
        int valor = getDigitado();
        
        if (validarSwitch) {
            String mesDigitado = "mes digitado " + validarS(valor);
            return mesDigitado;
        }

        return "el valor no esta en el rango de";
    }

    /**
     * metod para imprimir el mensja en el metdod main
     */
    public void mensage() {
        System.out.println(sentencia());
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "digite un numero entre 1 a 12");
        String digi = JOptionPane.showInputDialog("Digite un numero");
        int digitado = Integer.parseInt(digi);

        SentenciaSwitchCase sentenciSwitch = new SentenciaSwitchCase(digitado); 

        sentenciSwitch.mensage();
    }
}
