package Tema9.ArrayList.Relacion2.Ejer06;

public class Empleado implements Comparable<Empleado> {
	private String nombre;
    private String apellido;
    private int edad;
    private double salario;
     
    public static double PLUS=300;
 
    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }
 
    public Empleado(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
         
    }
     
    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getApellido() {
        return apellido;
    }
 
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
 
    public int getEdad() {
        return edad;
    }
 
    public void setEdad(int edad) {
        this.edad = edad;
    }
 
    public double getSalario() {
        return salario;
    }
 
    public void setSalario(double salario) {
        this.salario = salario;
    }
 
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario + '}';
    }
 
    public boolean plus() {
        boolean aumento = false;
        if (edad > 40) {
            salario += PLUS;
            aumento = true;
        }
        return aumento;
    }
     
    @Override
    public int compareTo(Empleado e){
        if(e.getSalario()>salario){
            return -1;
        }else if(e.getSalario()==salario){
            return 0;
        }else{
            return 1;
        }
    }
}
