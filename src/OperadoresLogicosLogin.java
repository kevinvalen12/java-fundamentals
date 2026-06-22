import javax.swing.JOptionPane;

public class OperadoresLogicosLogin {
    public String usuario;
    public String contrasena;
    public boolean esAutenticado;
    public String users;
    public String password;

    public OperadoresLogicosLogin(
        String usuario, 
        String contrasena, 
        boolean esAutenticado, 
        String users,
        String password
    ) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.esAutenticado = esAutenticado;
        this.users = users;
        this.password = password;
    }

    public String obtenerUser() {
        return this.users;
    }

    public String obtenerPassword() {
        return this.password;
    }

    public boolean seccion() {
       return this.esAutenticado;
    }

    public boolean cambiarSeccion() {
        this.esAutenticado = !this.esAutenticado;
        return this.esAutenticado;
    }

    /*
        ? Validaciones
    */
    
    /**
     * Obtiene el nombre del usuario para hacer la comparacion entre
     * el nombre gudadado y el nombre digitado por el usuario
     * @return retorna un booleano True si son iguales o false si son diferentes
    */
    public boolean validateUsuario() { 
        String usersObtenido = obtenerUser();
        boolean compararUser = usuario.equalsIgnoreCase(usersObtenido);
        return compararUser;
    }

    /**
     * Obtiene el password del usuario para hacer la comparacion entre
     * la contraseña gudadada y el password digitado por el usuario
     * @return retorna un booleano, True si son iguales o false si son diferentes
    */
    public boolean validatePassword() {
        String passwordOnbtener = obtenerPassword();
        boolean compararPassword = contrasena.equals(passwordOnbtener);
        return compararPassword;
    }

    /**
     * valida que el usuario y la contraseña sean correcta 
     * @return retorna un booleano par validas si ingreso correctamente
     */
    public boolean esvalidacion() {
        return validateUsuario() && validatePassword();
    }

    /**
     * valida si el usuario y contraseña son correctos inica seccion
     * @return retorna un booleano si se ingreso los datos correctos cambia el estado esAutenticado
     */
    // ! no se esta utilizando
    public boolean verificacionDeAuntenticacion() {
        if(esvalidacion()) {
            this.esAutenticado = true;
            return true;
        }

        return false;
    }

    public void mensage() {
        if (!seccion()) {
            if (esvalidacion()) {
                System.out.println("Usuario ingrese corectamente");
                System.out.println("Usuario ingresado " + this.users);
            } else {
                System.out.println("usuario o contraseña incorrecta");
            }
        }

    } 

    public static void main(String[] args) {
        String usuarioLogin = "kevin";
        String users = JOptionPane.showInputDialog("Ingresa tu usuario");
        String usuarioPasssword = "12345";
        String password = JOptionPane.showInputDialog("Ingresa tu contraseña");
        boolean esAutenticado = false; 

        OperadoresLogicosLogin data = new OperadoresLogicosLogin(
            usuarioLogin, 
            usuarioPasssword,
            esAutenticado,
            users,
            password
        );
        
        // envia el usuario para pasarlo al metodo validar()
        data.mensage();
    }
}
