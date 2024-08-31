/**
 * Ejemplo de uso de la clase Precio
 */
public class PruebaPrecio {
    public static void main (String []args ) {
        Precio p;           // Crea una referencia de la clase Precio
        p = new Precio();   // Crea el objeto de la clase Precio
        p.pone(100);       // Llamada al metodo pone
                            // que asigna 56.8 al atributo Quetzales
        // Llamada al metodo da que devuelve el valor de Quetzales
        System.out.println("Valor = " + p.da());
        Precio q = new Precio();  // Crea una referencia y el objeto
        q.Quetzales=75.6;             // Asigna 75.6 al atributo Quetzales
        System.out.println("Valor = " + q.Quetzales);
		System.out.println("Valor q.quet = " + q.Quetzales + "  Valor da.quet = " + q.da());
		System.out.println("Valor p.quet = " + p.Quetzales + "  Valor da.quet = " + q.da());
    }
}