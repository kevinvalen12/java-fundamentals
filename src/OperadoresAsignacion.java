public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 87;
        int j = 34 + 4;
        System.out.println("i =" + i);
        System.out.println("j =" + j);
        
        // i = i + 2;
        i += 2;
        System.out.println("i =" + i);

        // i = i + 5;
        i += 5;
        System.out.println("i =" + i);

        // j = j - 4;
        j -= 4;
        System.out.println("j =" + j);

        i *= 3;
        System.out.println("i =" + i);

        String sqlString = "SELECT * FROM clientes as c";
        sqlString += "where c.nombre = 'Andres'";
        sqlString += "and c.activo = 1";
        System.out.println("sqlString " + sqlString);
    }
}
