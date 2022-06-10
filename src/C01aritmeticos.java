public class C01aritmeticos {
    public static void main(String[] args) {
        //Como en Java tenemos tipos en las operaciones aritméticas se produce conversión implícita
        //"el tipo del resultado se convierte al más grande de los operadores siempre que el destino lo permita"
        int a = 3;
        double b = 0.40;
        double resultado = a * b;
        System.out.println(resultado);

        //También en Java tenemos el uso de + para concatenar strings
        String texto = "El resultado es ";
        String mensaje = texto + resultado;
        System.out.println(mensaje);
        //Disponemos del resto de operadores aritmétricos idem JavaScript. +, -, *, /, %
        // ++, --
    }
}
