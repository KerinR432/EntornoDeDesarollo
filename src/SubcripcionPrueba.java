package src;

public class SubcripcionPrueba {
    public static void main(String[] args) {
        Subscripcion n1 = new Subscripcion(30,10);
        System.out.println(n1.precioPorMes());
        n1.cancel();
        System.out.println(n1.precioPorMes());
    }
}
