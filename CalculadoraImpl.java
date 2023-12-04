import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImpl extends UnicastRemoteObject implements ServicioCalculadora {
    public CalculadoraImpl() throws RemoteException {
        super();
    }

    public double sumar(double num1, double num2) throws RemoteException {
        return num1 + num2;
    }

    public double restar(double num1, double num2) throws RemoteException {
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2) throws RemoteException {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) throws RemoteException {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new RemoteException("No se puede dividir por cero.");
        }
    }
}

