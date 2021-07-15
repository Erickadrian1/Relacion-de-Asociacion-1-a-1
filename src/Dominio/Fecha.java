package Dominio;

import java.util.Calendar;
import java.util.GregorianCalendar;



public class Fecha {
    private int anio;
    private int mes; 
    private int dia; 
    int mesResultado, diaResultado, anioResultado;

    public Fecha(int anio, int mes, int dia) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }
    public void calcularEdad(){ //Método para calcular la edad actual de la persona 
          
        Calendar cal = new GregorianCalendar(); 
        //declaro las variables
        int diaActual = cal.get(Calendar.DAY_OF_MONTH); 
        int mesActual= 1;
        mesActual+=cal.get(Calendar.MONTH);
        int anioActual = cal.get(Calendar.YEAR);
        int edad = anioActual-anio;
        if(mesActual<=mes){
		if(mesActual==mes){
			if(dia>diaActual){
                          
				edad--;
			}
		}else{
			edad--;
		}
	}
    
        diaResultado= Math.abs(diaActual-dia);
        mesResultado = Math.abs(mesActual-mes);
        anioResultado=Math.abs(edad);
        
        System.out.println("Tienes "+anioResultado+" años " + ", "+mesResultado+" meses "+ " y "+diaResultado+" dias");//Imprime la edad actual que tiene la persona 
       
    }
    public void calcularTiempo(){ //Método para calcular el tiempo que la persona lleva en la empresa
        
        Calendar cal = new GregorianCalendar(); 
        //Declaro las variables
        int diaActual = cal.get(Calendar.DAY_OF_MONTH); 
        int mesActual= 1;
        mesActual+=cal.get(Calendar.MONTH);
        int anioActual = cal.get(Calendar.YEAR);
        int edad = anioActual-anio;
        if(mesActual<=mes){
		if(mesActual==mes){
			if(dia>diaActual){
                          
				edad--;
			}
		}else{
			edad--;
		}
	}
    
        diaResultado= Math.abs(diaActual-dia);
        mesResultado = Math.abs(mesActual-mes);
        anioResultado=Math.abs(edad);
        
        System.out.println("LLevas en la Empresa "+anioResultado+" años " + ", "+mesResultado+" meses "+ " y "+diaResultado+" dias");//Imprime el tiempo que lleva 
    }                                                                                                                                // en la empresa la persona
}


