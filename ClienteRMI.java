import java.rmi.Naming;

public class ClienteRMI {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Por favor, ingrese dos números");
            return;
        }

        try {
            ServicioCalculadora calculadora = (ServicioCalculadora) Naming.lookup("rmi://localhost/Calculadora");

            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            double suma = calculadora.sumar(num1, num2);
            double resta = calculadora.restar(num1, num2);
            double multiplicacion = calculadora.multiplicar(num1, num2);
            double division = calculadora.dividir(num1, num2);

            System.out.printf("Suma: %.2f %n",suma);
            System.out.printf("Resta: %.2f %n ",resta);
            System.out.printf("Multiplicación: %.2f %n" ,multiplicacion);
            System.out.printf("División: %.2f %n",division);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


