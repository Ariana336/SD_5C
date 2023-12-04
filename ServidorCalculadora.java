import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServidorCalculadora {
    public static void main(String[] args) {
        try {
            ServicioCalculadora calculadora = new CalculadoraImpl();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("Calculadora", calculadora);
            System.out.println("Servidor RMI de la calculadora iniciado.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

