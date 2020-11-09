package prueba1;
// El archivo está en un package ( subdivisión del
// proyecto Prueba).

public class /*La clase coincide con el nombre del archivo.java*/  Prueba1 
{

	public static void main(String[] args) 
	{// Inicío del main
		
		
		/***********TIPOS DE VARIABLES PRINT PRINTLN*******/
		System.out.println("Prueba hoy"); // Mostrar un mensaje por consola 
		
		byte a=3,b=4,c=-2;
		//Definido tres variables númericas enteras de tipo 
		//byte
		
		System.out.println("Valores: "+a+" "+b+" "+c);
		/* Decimos: escribe (literalmente) "Valores"
		   escribe el valor de a
		   escribe un espacio
		   escribe el valor de b...
        */

		System.out.print("Mensaje1"); 
		// Mostrar el mensaje sin terminar con cambio de línea
		
		System.out.println("Mensaje2");
		//Mostrar el mensaje terminado con cambio de linea
		
		System.out.println("Seguido de cambio de línea\nfin línea");
		System.out.println("a\tb\tc\td");
		// Cambio de línea:  \n y tabulación: \t
		
		//Variables enteras:
		byte by=127;
		by = -128;
		short s = 32767;
		int i = 33332727;
		long lo = 876543210;
		
		//Variables numéricas con decimales:
		float f = -1.34F;
		double d = 22.34;
		double d1;
		 
		System.out.println("Números: "+by+" "+s+" "+i+" "+lo);
		System.out.println("\t"+f+" "+d);
		
		d1 = 35.5;
		System.out.println("\t"+d1);
		
		String palabras = "Mensaje de hoy"; // Cadena de carácteres 
		char letra ='!';
		
		System.out.println(palabras+"\t"+letra);
		
		System.out.print("Palabra1");
		//print: no termina en cambio de línea
		
		System.out.print("Palabra2");
		System.out.println("Palabra3");
		//println: sí termina en cambio de línea
		
		System.out.println("Palabra4");
		
		/***********OPERADORES ARITMÉTICOS*****/
		
		System.out.println("Valores:"+ a+ " "+ b +" "+ c);
		
		//Suma:
	    c = (byte)(a + b); 
	    System.out.println("c: "+c);
	    //El resultado que hay a la derecha del igual pasa a 
	    //la izquierda.
	    
		//Resta:
	    c = (byte)(a - b);
	    System.out.println("c: "+c);
	    
	    //Multiplicación
	    c = (byte)(a * b);
	    System.out.println("c: "+c);
	    
	    //División
	    a = 40;
	    b = 10;
	    System.out.println("Valores:"+ a+ " "+ b +" "+ c);
		c = (byte)(a / b);
		System.out.println("c: "+c);
		
		
		
		
		
		

	}

}
