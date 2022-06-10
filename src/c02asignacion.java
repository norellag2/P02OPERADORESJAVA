public class c02asignacion {
    public static void main(String[] args) {
        //Asignación idem JavaScript
        // =
        // +=, -=, *=, /=, %=
        int a = 10;
        a += 5;
        System.out.println(a);
        //Expresion return value, utilizar paréntesis
        int b;
        int c;
        c = (b = 3); // primero asigna 3 a b y luego asigna b a c
        System.out.println(b);
        System.out.println(c);
    }
}
