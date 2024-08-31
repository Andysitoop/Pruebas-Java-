/**
 *  Ejemplo de declaracion de la clase Precio
 *  double da() --> devuelve el valor almacenado en euros
 *  void pone( double x ) --> almacena valor en euros
 */
public class Precio {
    // Atributo o variable miembro
    public double Quetzales;
 
    // Metodos
    public double da() {
        return this.Quetzales;
    }
 
    public void pone(double x) {
        this.Quetzales = x;
    }
}