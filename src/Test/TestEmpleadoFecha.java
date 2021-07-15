
package Test;

import Dominio.Empleado;
import Dominio.Fecha;
import java.util.Scanner;


public class TestEmpleadoFecha {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Fecha fNacimiento;
        Fecha fIngreso; 
        Empleado empleado1;
        
        int anio, mes, dia;

        String nombre;
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = entrada.nextLine();
        System.out.println("Fecha de Nacimiento: ");
        System.out.print("Año: ");
        anio=entrada.nextInt();
        System.out.print("Mes: ");
        mes = entrada.nextInt();
        System.out.print("Dia: ");
        dia = entrada.nextInt();
        fNacimiento = new Fecha(anio,mes,dia); 
        
        
        
        System.out.println("Fecha de Ingreso a la Empresa: ");
        System.out.print("Año: ");
        anio=entrada.nextInt();
        System.out.print("Mes: ");
        mes = entrada.nextInt();
        System.out.print("Dia: ");
        dia = entrada.nextInt();
        fIngreso = new Fecha(anio,mes,dia);
        empleado1 = new Empleado(nombre, fNacimiento, fIngreso);
        

        
        empleado1.verDatos(); //Llamado del metodo para imprimir la decha de nacimiento 
        fNacimiento.calcularEdad();//Llamado del metodo para imprimir la Edad Actual de la persona 
        empleado1.verDatos1();//Llamado del metodo para imprimir la fecha de ingreso a la empresa
        fIngreso.calcularTiempo();//Llamado del metodo paa imprimir el tiempo que lleva en la empresa
             
}
}
