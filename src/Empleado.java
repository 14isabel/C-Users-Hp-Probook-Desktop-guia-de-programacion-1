abstract class Empleado {
    private String nombre;
    private String numerodeidentificacion;

    public Empleado (String nombre, String numeroIdentificacion){
        this.nombre = nombre;
        this.numerodeidentificacion = numeroIdentificacion;

    }
    public String getNombre(){
        return nombre;
    }

    public String getNumeroIdentificacion(){
        return numerodeidentificacion;
    }
    //Método abstracto
    public abstract double calcularSalario();

    public double aumentarSalario (double por){
    return calcularSalario() * (por/100) + calcularSalario();
}
}

