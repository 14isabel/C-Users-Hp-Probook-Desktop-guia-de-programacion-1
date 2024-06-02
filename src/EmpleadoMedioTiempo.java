public class EmpleadoMedioTiempo extends Empleado{

    private double salariporhora;
    private int horasTrabajadasporsemana;

    public  EmpleadoMedioTiempo (String nombre, String numeroIdentificacion, double salariporhora, int horasTrabajadasporsemana){

    super(nombre, numeroIdentificacion);
    this.salariporhora = salariporhora;
    this.horasTrabajadasporsemana = horasTrabajadasporsemana;

    }

    @Override
    public double calcularSalario(){
        return salariporhora * horasTrabajadasporsemana * 4 ; //salariomensual
        
    }

}

}