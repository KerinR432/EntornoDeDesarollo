package src;

public class OperadorAritmetico {
   /**
    * Esto es un codigo para sacar operaciones Aritmeticas utilizando 2 funciones.
    * @code suma.
    * @code division.
    * donde devuelve un resultado o una exception.
    * @param a un parametro que utilizaremos para realizar las operaciones.
    * @param b otro parametro que utilizamos para realizas operaciones.
    * @param suma este metodo iguala dos numeros que pasemos por parametro.
    * @return devuelve un resultado.
    * @param division este metodo como el anterior divide dos numeros que pasemos por parametro.
    * @return devuelve un resultado.
    * @author pepe.
    * */
    public static int suma(int a, int b) {
        return a + b;
    }
    public static int division(int a, int b) throws Exception {
        if(b==0) {
            throw new Exception();
        }
        return a / b;
    }
}

