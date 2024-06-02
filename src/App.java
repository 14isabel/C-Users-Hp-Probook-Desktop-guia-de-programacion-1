public class App {
    public static void main(String[] args) throws Exception {
   
    Empleado[] empleados = new Empleado[2];
    empleados[0] = new EmpleadoTiempoCompleto("Isabel", "54225", 2080);
    empleados[1] = new EmpleadoMedioTiempo("Javier", "13598", 10020,9);

    for (Empleado  empleado:empleados){
        System.out.println("Empleado: " + empleado.getNombre() + "Salario Mensual: $" + empleado.calcularSalario());//

        System.out.println("Deseas realizar un aumento de salario? (s/n): ");
        char opcion = input.nextline().charAt(0);

        if (opcion == 's') {
            System.out.println("Ingrese el porcentaje que se aumentara: ");
            double por = input.nextDouble();
            input.nextline();
            System.out.println("El salario total de: " +empleado.getNombre() + "es de C$" + empleado.aumentarSalario(por)+"\n");
            
        }
    }
    }
}
