package Salud;

public class Empleado extends Persona {

    //atributos propios de la subclase
    private String cargo;
    private double valorHora;
    private int horasTrabajadas;
    private String departamentos;

    //creamos el metodo contructor de la subclase y trajimos los atributos de la superclase
    public Empleado(String tipoDoc,int documento,String nombre,String apellido,double peso,double 
    estatura,int edad,String sexo,String cargo, double valorHora, int horasTrabajadas, String departamentos){
        super(tipoDoc,documento,nombre,apellido,peso,estatura);
        
        this.cargo=cargo;
        this.valorHora=valorHora;
        this.horasTrabajadas=horasTrabajadas;
        this.departamentos=departamentos;
    }

    public Empleado(String tipoDoc, int documento, String nombre, String apellido, String cargo2, double valorHora2,
            int horasTrabajadas2, String departamento) {
    }

    //metodos propios de subclase
    public double calcularHonorarios(){
        double honorarios = valorHora * horasTrabajadas;
        double reteica = honorarios*0.00966;
        return honorarios - reteica;

    }

    public void imprimirDatos(){
        System.out.println("Tipo y Numero de documento:" + getTipoDoc()+ "" + getDocumento());
        System.out.println("Nombres y Apellidos:" + getNombre() + "" + getApellido());
        System.out.println("Cargo: " + cargo);
        System.out.println("Horas Trabjadas: " + horasTrabajadas);
        System.out.println("Valor por Hora: " + valorHora);
        System.out.println("departamento: " +departamentos);
        System.out.println("Total a pagar: " + calcularHonorarios());
    }


    
}
