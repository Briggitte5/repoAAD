package prueba1;
// El archivo est� en un package ( subdivisi�n del
// proyecto Prueba).

public class /*La clase coincide con el nombre del archivo.java*/  Prueba1 
{

	public static void main(String[] args) 
	{// Inic�o del main
		
		
		/***********TIPOS DE VARIABLES PRINT PRINTLN*******/
		System.out.println("Prueba hoy"); // Mostrar un mensaje por consola 
		
		byte a=3,b=4,c=-2;
		//Definido tres variables n�mericas enteras de tipo 
		//byte
		
		System.out.println("Valores: "+a+" "+b+" "+c);
		/* Decimos: escribe (literalmente) "Valores"
		   escribe el valor de a
		   escribe un espacio
		   escribe el valor de b...
        */

		System.out.print("Mensaje1"); 
		// Mostrar el mensaje sin terminar con cambio de l�nea
		
		System.out.println("Mensaje2");
		//Mostrar el mensaje terminado con cambio de linea
		
		System.out.println("Seguido de cambio de l�nea\nfin l�nea");
		System.out.println("a\tb\tc\td");
		// Cambio de l�nea:  \n y tabulaci�n: \t
		
		//Variables enteras:
		byte by=127;
		by = -128;
		short s = 32767;
		int i = 33332727;
		long lo = 876543210;
		
		//Variables num�ricas con decimales:
		float f = -1.34F;
		double d = 22.34;
		double d1;
		 
		System.out.println("N�meros: "+by+" "+s+" "+i+" "+lo);
		System.out.println("\t"+f+" "+d);
		
		d1 = 35.5;
		System.out.println("\t"+d1);
		
		String palabras = "Mensaje de hoy"; // Cadena de car�cteres 
		char letra ='!';
		
		System.out.println(palabras+"\t"+letra);
		
		System.out.print("Palabra1");
		//print: no termina en cambio de l�nea
		
		System.out.print("Palabra2");
		System.out.println("Palabra3");
		//println: s� termina en cambio de l�nea
		
		System.out.println("Palabra4");
		
		/***********OPERADORES ARITM�TICOS*****/
		
		System.out.println("Valores:"+ a+ " "+ b +" "+ c);
		
		//Suma:
	    c = (byte)(a + b); 
	    System.out.println("c: "+c);
	    //El resultado que hay a la derecha del igual pasa a 
	    //la izquierda.
	    
		//Resta:
	    c = (byte)(a - b);
	    System.out.println("c: "+c);
	    
	    //Multiplicaci�n
	    c = (byte)(a * b);
	    System.out.println("c: "+c);
	    
	    //Divisi�n
	    a = 40;
	    b = 10;
	    System.out.println("Valores:"+ a+ " "+ b +" "+ c);
		c = (byte)(a / b);
		System.out.println("c: "+c);
		
		
		
		
		
		

	}

}
