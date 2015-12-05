/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nrosromanos;

/**
 *
 * @author nahyol.celis
 */
public class NrosRomanos {

  
    public String convertir(int numero)
	{
		String [] Unidades={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};  
		String [] Decenas={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String [] Centenas={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		int unidad, decena, centena;
		String cadena = "";
		
	    if(numero==1000){
	    	cadena = cadena + "M";
	    }
	            
	    else if(numero>=100)
	    {
	            unidad= numero % 10;
	            decena=Math.round(numero/10)%10;  
	            centena=Math.round(numero/100);
	            cadena = cadena + Centenas[centena]+Decenas[decena]+Unidades[unidad];
	    }
	    else
	    {
	            if(numero>=10)
	            {
	                unidad= numero % 10;
	                decena=Math.round(numero/10)%10;
	                cadena = cadena + Decenas[decena]+Unidades[unidad];
	            }
	            else
	            {
	                unidad= numero % 10;
                	cadena = cadena + Unidades[numero];
	            }
	    }
	    return cadena;
	}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // TODO code application logic here
    }
    
}
