import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EmpresaEstructurada {
    public static void main(String[] args) {
        String nombre, cargo;
        double salario, total = 0, mayorSalario, menorSalario;
        int posicion = 0;

        // Definición de las estructuras de almacenamiento
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Double> salarios = new ArrayList<>();
        ArrayList<String> cargos = new ArrayList<>();

        // Solicitar la cantidad de empleados
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de empleados"));

        for (int emp = 0; emp < cantidad; emp++) {
            // Lectura de los datos de cada empleado
            nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado");
            salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario del empleado"));
            cargo = JOptionPane.showInputDialog(null, "Ingrese el cargo del empleado");

            // Almacenamiento de los datos
            nombres.add(nombre);
            salarios.add(salario);
            cargos.add(cargo);
        }

        // Número de empleados
        System.out.println("El número total de empleados es: " + cantidad);

        // Nombre y salario de cada empleado
        System.out.println("Los nombres y salarios de los empleados son:");
        for (int emp = 0; emp < cantidad; emp++) {
            System.out.println("Nombre: " + nombres.get(emp) + " Salario: " + salarios.get(emp));
        }

        // Total de dinero pagado por los salarios de todos los empleados
        for (int emp = 0; emp < cantidad; emp++) {
            total += salarios.get(emp);
        }
        System.out.println("Total de dinero pagado a todos los empleados: " + total);

        // Empleado que más dinero gana
        System.out.println("El empleado que más dinero gana es:");
        mayorSalario = salarios.get(0);
        for (int emp = 1; emp < cantidad; emp++) {
            if (salarios.get(emp) > mayorSalario) {
                mayorSalario = salarios.get(emp);
                posicion = emp;
            }
        }
        System.out.println("Nombre: " + nombres.get(posicion) + " Cargo: " + cargos.get(posicion) + " Salario: " + salarios.get(posicion));

        // Empleado que menos dinero gana
        System.out.println("El empleado que menos dinero gana es:");
        menorSalario = salarios.get(0);
        posicion = 0;
        for (int emp = 1; emp < cantidad; emp++) {
            if (salarios.get(emp) < menorSalario) {
                menorSalario = salarios.get(emp);
                posicion = emp;
            }
        }
        System.out.println("Nombre: " + nombres.get(posicion) + " Cargo: " + cargos.get(posicion) + " Salario: " + salarios.get(posicion));
    }
}