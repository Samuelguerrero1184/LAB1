import java.util.Scanner;
public class lab2
{
	
	/*Declaracion de constantes*/
	private final static int CADENACHAR = 1;
	private final static int LENGTH = 2;
	private final static int CONNECT = 3;
	private final static int CHARACTER = 4;
	private final static int INSERTWO = 5;
	private final static int DIVISIONTWO = 6;
	private final static int DIVISIONINT = 7;
	private final static int INTARRAYS = 8;
	private final static int SHOWARRAYS = 9;
	private final static int AVERAGE = 10;
	private final static int GREATERTHAN = 11;
	private final static int ARRAYORDER = 12;
	
	private final static int EXIT = 0;
	static Scanner sc;
	static int option;
	static String[]characteres;
	static int[]array1;
	static int[]array2;
	static int[]array3;
	static double a;
	static double b;
	
	//Metodo para inicializar
	public static void initialize(){
		sc = new Scanner(System.in);
		option = 0;
		characteres = new String[0];
		array1=new int[0];
		array2=new int[0];
		array3=new int[0];
		a = 0.0;
		b = 0.0;
	}
	
	/**
	Create an array that consists of three elements, and re filled by the user<br>
	<b>pre:</b> Insert only strings, not any other type<br>
	<b>post:</b> In characteres the three strings are saved 
	@param characteres Array of strings that are submmited by the user. characteres !=null && characteres !="".
	*/

	//Metodo para leer cadenas
	
	public static void cadenaChar(){
		characteres = new String[3];
		for (int i = 0; i<characteres.length; i++){
			System.out.println("Porfavor, ingrese la cadena #:"+(i+1));
			characteres[i] = sc.next();
			sc.nextLine();
		}
	}
	
	/**
	Reads the length of each string contained in the array characteres<br>
	<b>pre:</b> The arrays must exist and be full with data<br>
	<b>post:</b> The lenght of each string is shown on screen with numbers
	@param characteres Array of strings that are submmited by the user. characteres !=null && characteres !="".
	*/
	
	//Metodo para desplegar la longitud de las cadenas ingresadas
	public static void length(){
		if(characteres.length>0){
		for (int i = 0; i < characteres.length; i++){
				System.out.println(characteres[i].length());
		}
		}
		else{
			System.out.println("Porfavor ingresar las cadenas primero");
			cadenaChar();
			length();
	}
	}
	
	/**
	This method prints all three strings in one line <br>
	<b>pre:</b> The array characteres must exist and be filled with data<br>
	<b>post:</b> All three string will be shown together as a frase 
	@param characteres Array of strings that are submmited by the user. characteres !=null && characteres !="".
	*/
	
	//Metodo para unir las cadenas
	public static void connect(){
		if(characteres.length>0){
			System.out.println(characteres[0]+" "+characteres[1]+" "+characteres[2]);
		}
		else{
			System.out.println("Porfavor ingresar las cadenas primero");
			cadenaChar();
			connect();
	}
	}
	
	/**
	This method uses an index defined by the user to search for a character un that position<br>
	<b>pre:</b> The array characteres must exist and be filled with data<br>
	<b>post:</b> The method will print the caracter the user chose
	@param characteres Array of strings that are submmited by the user. characteres !=null && characteres !="".
	*/
	
	//Metodo para elejir un caracter en una posicion que el usuario desee
	public static void character(){
		if(characteres.length>0){
		System.out.println("Ingrese la posicion de caracter que deseas en forma de entero");
		int indice = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i<characteres.length; i++){
			System.out.println("El caracter elegido de la cadena #"+(i+1)+" es:"+characteres[i].charAt(indice-1));
		}
		}
		else{
			System.out.println("Porfavor ingresar las cadenas primero");
			cadenaChar();
			character();
		}
	}
	
	/**
	This method asks for two numbers greater than 0, and stores them as a and b<br>
	<b>pre:</b> <br>
	<b>post:</b> It will asign twno new values for a and b
	@param a Number that will be stored as first. a !=null && a>0.
	@param b Number that will be stored as second. b !=null && b>0.
	*/
	
	//Metodo para ingresar dos numeros reales mayores que 0
	public static void inserTwo(){
	System.out.println("Porfavor, ingresar dos numeros reales mayores a 0");
		a = sc.nextDouble();
		sc.nextLine();
		b = sc.nextDouble();
		sc.nextLine();
	}
	
	/**
	This method uses a & b and then divides them<br>
	<b>pre:</b> a & b have to be greater than 0 <br>
	<b>post:</b> a will be divided by b and printed
	@param a Number that will be stored as first. a !=null && a>0.
	@param b Number that will be stored as second. b !=null && b>0.
	*/
	
	//Metodo para dividir dos numeros reales mayores a cero
	public static void divisionTwo(){
		if(a>0 && b>0){
		double r = a/b;
		System.out.println("La division entre "+a+" y "+b+" es igual a :"+r);
		}
		else {
		System.out.println("Ingresaste numeros menor o iguales a 0, o ninguno, intenta de nuevo");	
	inserTwo();
	divisionTwo();
		}
	}
	
	/**
	This method uses a & b and first converts them into integers and then divides them and operates module<br>
	<b>pre:</b> a & b have to be greater than 0 <br>
	<b>post:</b> a & b will be converted into there integer form, then divide a by b, as take the residual, and noth will be printed
	@param a Number that will be stored as first. a !=null && a>0.
	@param b Number that will be stored as second. b !=null && b>0.
	*/
	
	//Metodo para dividir y sacar residuo de dos numeros reales mayores a cero convertidos a enteros
	public static void divisionInt(){
		System.out.println("Sus numeros seran convertidos en enteros, despues divididos y sacar residuo");
		if(a>0 && b>0){
			int c = (int) a;
			int d = (int) b;
			double div = c/d;
			int res = c%d;
			System.out.println("Las respectivas conversiones de : "+a+" y "+b+" son :"+c+" y "+d);
			System.out.println("La division es: "+div+"\n El residuo: "+res);
		}
		else{
			System.out.println("Ingresaste numeros menor o iguales a 0, o ninguno, intenta de nuevo");	
		inserTwo();
		divisionInt();
		}
	}
	
	/**
	This method will create three arrays of integer elements<br>
	<b>pre:</b> The three arrays must be definded <br>
	<b>post:</b> Three arrays wil be created array1, array2 and array3
	@param array1 First array of integers. array1 !=null
	@param array2 Second  array of integers. array2 !=null 
	@param array3 Third array of integers. array3 !=null 
	*/
	
	//Metodo para ingresar tres arreglos
	public static void intArrays(){
		System.out.println("Porfavor, ingresar el tamaño del arreglo numero 1");
		int first = sc.nextInt();
		sc.nextLine();
		array1 = new int[first];
		for (int i = 0; i<array1.length; i++){
			System.out.println("Ingrese el elemento #:"+(i+1));
			array1[i] = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Porfavor, ingresar el tamaño del arreglo numero 2");
		int second = sc.nextInt();
		sc.nextLine();
		array2 = new int[second];
		for (int i = 0; i<array2.length; i++){
			System.out.println("Ingrese el elemento #:"+(i+1));
			array2[i] = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Porfavor, ingresar el tamaño del arreglo numero 3");
		int third = sc.nextInt();
		sc.nextLine();
		array3 = new int[third];
		for (int i = 0; i<array3.length; i++){
			System.out.println("Ingrese el elemento #:"+(i+1));
			array3[i] = sc.nextInt();
			sc.nextLine();
		}
	}
	
	/**
	This method will print every element of every array<br>
	<b>pre:</b> The three arrays must exist and be full of data<br>
	<b>post:</b> Every element of array1, array2 and array3 will be printed
	@param array1 First array of integers. array1 !=null
	@param array2 Second array of integers. array2 !=null 
	@param array3 Third array of integers. array3 !=null 
	*/
	

	//Metodo para desplegar los previos arreglos en pantalla
	public static void showArrays(){
		if (array1.length>0){
		for (int i = 0; i<array1.length; i++){
			System.out.print("><><>("+array1[i]+")<><><");
		}
		}
		else{
			System.out.println("No haz ingresado el primer arreglo, porfavor ingresarlo");
		intArrays();
		showArrays();
		}
		if (array2.length>0){
		for (int i = 0; i<array2.length; i++){
			System.out.print("><><>("+array2[i]+")<><><");
		}
		}
		else 
			
		if (array3.length>0){
		for (int i = 0; i<array3.length; i++){
			System.out.print("><><>("+array3[i]+")<><><");
		}
		}	
	}
	
	/**
	This method will print the average value of any array<br>
	<b>pre:</b> The three arrays must exist and be full of data<br>
	<b>post:</b> It will calculate the average value of any array the user wishes
	@param array1 First array of integers. array1 !=null
	@param array2 Second array of integers. array2 !=null 
	@param array3 Third array of integers. array3 !=null 
	*/
	
	//Metodo para sacar promedio de un arreglo elegido
	public static void average(){
		if(array1.length>0&&array2.length>0&&array3.length>0){
		System.out.println("Elija cual de los tres arreglos previamente ingresados por usted desea calcularle el promedio");
		int numberArray = sc.nextInt();
		int sum = 0;
		double result = 0.0;
		if(numberArray==1){
		for(int i = 0; i<array1.length; i++){
			sum += array1[i];		
			}
			result = sum/array1.length;
		System.out.println("El promedio del arreglo numero: "+numberArray);
		}
		else if(numberArray==2){
		for(int i = 0; i<array1.length; i++){
			sum += array2[i];		
			}
			result = sum/array2.length;
		System.out.println("El promedio del arreglo numero: "+numberArray);
		}
		else if(numberArray==3){
		for(int i = 0; i<array3.length; i++){
			sum += array3[i];		
			}
			result = sum/array3.length;
		System.out.println("El promedio del arreglo numero: "+numberArray);
		}
		else if(numberArray>3)
			System.out.println("--ERROR--Porfavor elija entre los tres arreglos");
		average();
	}
	else{
		System.out.println("--ERROR--Porfavor cree los arreglos primero");
	intArrays();
	average();
	}
	}
	
	/**
	This method will print the greatest value of any array<br>
	<b>pre:</b> The three arrays must exist and be full of data<br>
	<b>post:</b> It will show the grates value of any array the user wishes
	@param array1 First array of integers. array1 !=null
	@param array2 second array of integers. array2 !=null 
	@param array3 Third array of integers. array3 !=null 
	*/
	
	//Metodo para obtener el mayor numero de un arreglo
	public static void greaterThan(){
		int max = 0;
		if(array1.length>0&&array2.length>0&&array3.length>0){
		System.out.println("Elija cual de los tres arreglos previamente ingresados por usted desea obtener el numero mayor");
		int numbArray = sc.nextInt();
		if(numbArray==1){
		for(int i = 0; i<array1.length; i++){
			if(array1[i]>max){
				max=array1[i];
				}
			}
		}
		else if(numbArray==2){
		for(int i = 0; i<array2.length; i++){
				if(array2[i]>max){
					max=array2[i];
				}
			}
		}
		else if(numbArray==3){
		for(int i = 0; i<array3.length; i++){
			if(array3[i]>max){
				max=array3[i];
				}
			}
		}
		else if (numbArray>3){
			System.out.println("--ERROR--Porfavor elija entre los tres arreglos");
		greaterThan();
		}
		System.out.println("El numero mas grande es:"+max);
		}
		else {
			System.out.println("--ERROR--Porfavor cree los arreglos primero");
			intArrays();
			greaterThan();
		}
	}
	/**
	This method will order any array the user wishes<br>
	<b>pre:</b> The three arrays must exist and be full of data<br>
	<b>post:</b> It will order any array the user wishes
	@param array1 First array of integers. array1 !=null
	@param array2 second array of integers. array2 !=null 
	@param array3 Third array of integers. array3 !=null 
	*/
	
	//Metodo para ordenar un arreglo
	public static void arrayOrder(){
		if(array1.length>0&&array2.length>0&&array3.length>0){
			System.out.println("Elija cual de los tres arreglos previamente ingresados por usted desea obtener el numero mayor");
			int numbArray = sc.nextInt();
			if(numbArray==1){
				for (int i = 0; i < array1.length; i++) {
					for (int j = 0; j < array1.length-i-1; j++) {
					if(array1[j] < array1[j+1]){
						int abc = array1[j+1];
						array1[j+1] = array1[j];
						array1[j] = abc;
					}
					}
				}
			}
			else if{
				for (int i = 0; i < array2.length; i++) {
					for (int j = 0; j < array2.length-i-1; j++) {
					if(array2[j] < array2[j+1]){
						int abc = array2[j+1];
						array2[j+1] = array2[j];
					array2[j] = abc;
					}
					}
				}
			}
			else if {
				for (int i = 0; i < array3.length; i++) {
					for (int j = 0; j < array3.length-i-1; j++) {
					if(array3[j] < array3[j+1]){
						int abc = array3[j+1];
						array3[j+1] = array3[j];
						array3[j] = abc;
					}
					}
				}
			}
		}		
	else {
		System.out.println("--ERROR--Porfavor cree los arreglos primero");
			intArrays();
			arrayOrder();
	}
		}
	}
	
	//Metodo para desplegar el menu
	public static void menu(){
		System.out.println("MENU DE OPCIONES \n(1) Ingresar tres palabras");
		System.out.println("(2) Desplegar longitud de cadena");
		System.out.println("(3) Concatenar cadenas");
		System.out.println("(4) Mostrar caracter en x posicion");
		System.out.println("(5) Ingresar dos numeros reales mayores a 0");
		System.out.println("(6) Mostrar la division entre dos numeros reales");
		System.out.println("(7) Mostrar la division y residuo entre la parte entera de dos numeros reales");
		System.out.println("(8) Ingresar tres arreglos con su tamaño elejible");
		System.out.println("(9) Desplegar los tres arreglos");
		System.out.println("(10) Sacar promedio de un arreglo");
		System.out.println("(11) Obtener el numero mas grande del arreglo");
		System.out.println("(12) Ordenar un arreglo elejido por el usuario");
		System.out.println("(0) EXIT");
		option = sc.nextInt();
		sc.nextLine();
		while(option!=EXIT){
		switch (option){
			case CADENACHAR:
				cadenaChar();
				break;
			case LENGTH:
				length();
				break;
			case CONNECT:
				connect();
				break;
			case CHARACTER:
				character();
				break;
			case INSERTWO:
				inserTwo();
				break;
			case DIVISIONTWO:
				divisionTwo();
				break;
			case DIVISIONINT:
				divisionInt();
				break;
			case INTARRAYS:
				intArrays();
				break;
			case SHOWARRAYS:
				showArrays();
				break;
			case AVERAGE:
				average();
				break;
			case GREATERTHAN:
				greaterThan();
				break;
			case ARRAYORDER:
				arrayOrder;
				break;
		}
		if(option > 12 || option < 0) {
        System.out.println("Ingrese una opción correcta");
        System.out.println("MENU DE OPCIONES \n(1) Ingresar tres palabras");
		System.out.println("(2) Desplegar longitud de cadena");
		System.out.println("(3) Concatenar cadenas");
		System.out.println("(4) Mostrar caracter en x posicion");
		System.out.println("(5) Ingresar dos numeros reales mayores a 0");
		System.out.println("(6) Mostrar la division entre dos numeros reales");
		System.out.println("(7) Mostrar la division y residuo entre la parte entera de dos numeros reales");
		System.out.println("(8) Ingresar tres arreglos con su tamaño elejible");
		System.out.println("(9) Desplegar los tres arreglos");
		System.out.println("(10) Sacar promedio de un arreglo");
		System.out.println("(11) Obtener el numero mas grande del arreglo");
		System.out.println("(12) Ordenar un arreglo elejido por el usuario");
		System.out.println("(0) EXIT");
		option = sc.nextInt();
		sc.nextLine();
      }
      else {
		System.out.println("MENU DE OPCIONES \n(1) Ingresar tres palabras");
		System.out.println("(2) Desplegar longitud de cadena");
		System.out.println("(3) Concatenar cadenas");
		System.out.println("(4) Mostrar caracter en x posicion");
		System.out.println("(5) Ingresar dos numeros reales mayores a 0");
		System.out.println("(6) Mostrar la division entre dos numeros reales");
		System.out.println("(7) Mostrar la division y residuo entre la parte entera de dos numeros reales");
		System.out.println("(8) Ingresar tres arreglos con su tamaño elejible");
		System.out.println("(9) Desplegar los tres arreglos");
		System.out.println("(10) Sacar promedio de un arreglo");
		System.out.println("(11) Obtener el numero mas grande del arreglo");
		System.out.println("(12) Ordenar un arreglo elejido por el usuario");
		System.out.println("(0) EXIT");
		option = sc.nextInt();
		sc.nextLine();
      }
	}
	}
	
	//Metodo main
	public static void main(String[]args){
		initialize();
		menu();
	}
}