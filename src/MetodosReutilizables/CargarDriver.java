
package MetodosReutilizables;


public class CargarDriver {
   
    
    public static void cargar(String drv) throws ClassNotFoundException
    {
        Class.forName(drv);

    }

    
    
}
