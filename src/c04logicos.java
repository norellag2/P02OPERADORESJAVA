public class c04logicos {
    public static void main(String[] args) {
        //parecido a JavaScript
        // & (AND logico) | (OR inclusivo) ^ (XOR exclusivo)
        //Comparaciones sobre boolean y version cortocircuito &&, ||, 
        boolean a = true;
        boolean b = true;
        System.out.println(a & b);
        System.out.println(a | b);
        b = false;
        System.out.println(a ^ b);
        // idem en version shortcircuit (más utilizado)
        //Operador unario ! idem JavaScript
        boolean esMayorEdad = false;
        esMayorEdad = !esMayorEdad; // invierte el valor de un boolean
        //Ternario idem JavaScript
        int edad = 20;
        String exitoMensaje = "Bienvenid@";
        String falloMensaje = " Acceso denegado";
        String mensaje = edad >= 18 ? exitoMensaje : falloMensaje;
        System.out.println(mensaje);
    }
}
