
package Dominio;

public class Empleado {
    private String nombre;
    private Fecha fechaN;
    private Fecha fechaI;
    

    public Empleado(String nombre, Fecha fechaN, Fecha fechaI) {
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.fechaI = fechaI;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaN() {
        return fechaN;
    }

    public Fecha getFechaI() {
        return fechaI;
    }
    public void verDatos(){ //Método para imprimir la fecha de nacimiento de la persona
        System.out.println("\nNombre: "+this.nombre); //Ingreso del nombre de la persona
        System.out.println("Fecha de nacimiento: Año Mes Dia");
        System.out.println("                     "+fechaN.getAnio()+" "+fechaN.getMes()+"  "+fechaN.getDia());//Imprime los datoa ingresados 
        
    }
    
    public void verDatos1(){ // Método para ver la fecha cuando ingreso a la Empresa
        System.out.println("\nFecha de Ingreso a la Empresa:  Año Mes Dia ");
        System.out.println("                               "+fechaI.getAnio()+"  "+fechaI.getMes()+"   "+fechaI.getDia());//Imprime los datoa ingresados
    } 
    
}