import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*ejercicio1(); */
			/* ejercicio3(); */
		/*ejercicio4();*/
		/* ejercicio5(); */
		ejercicio6(500,9.81,20);
		ejercicio7(300,600,500);
	
	}
		  public static void ejercicio1(){ 
			  int alumnos=5; String estudiante1="Darwin Lopez"; 
			  System.out.println("el numero de alumnos del grupo 1 es de"
		  +alumnos+"y el nomvre de uno de ellos es"+estudiante1); } 
	
		  public static void ejercicio2() {
			  boolean matriculado = true; 
		  float notabasico = 9.5f; 
		  int añospromedio = 26; 
		  String nombreGrupo = "Uno";
		  System.out.println("el nombre del grupo es"+ nombreGrupo);
		  
		  } public static void ejercicio3() { //String [] nombres = new String[5];
		  String nombres [];
		  Scanner sc = new Scanner(System.in);
		    System.out.println("digite el numero de estudiantes del curso");
		   int numEstudiantes=sc.nextInt();
		  
		  for (int i = 0 ; i > numEstudiantes;i++) {
			  System.out.println("El estudiante numero 1 es"+i);
		  }
		  
		  //sc.nextLine(); //sc.close(); //System.out.println(i);
		  
		  
		  
		  }
		  public static void ejercicio4() {
			  Scanner sc = new Scanner(System.in);
			  System.out.println("Digite un numero de estudiantes");
			  int estudiantes = sc.nextInt();
			  sc.nextLine();
			  String nombres [] = new String [estudiantes];
			  for(int i = 0 ; i<estudiantes;i++) {
				 
				  System.out.println("digite el nombre del estudiante"+(i+1)+":");
				  String nombre = sc.nextLine();
				  nombres[i] = nombre;
				  
				  
				  
			  }
			  System.out.println("nombres de los estudiantes ");
			  for(int i =0; i<nombres.length;i++) {
				  System.out.println(nombres[i]);
			  }
			  sc.close();
		  }
		  public static void ejercicio5() {
			  int a = 5;
			  int b = 4;
			  int [] myarray= {1,2,3,4,5,6};
			  if (a > b) {
				  System.out.println("A es mayor que B");
				  
			  }else if(a==b) {
					  System.out.println("a es igual que b");
			  }else {
				  System.out.println("A es menor que B");
			  }
				  
			  
		  }
		  double masa = 500;
			 double gravedad =9.81;
			 double altura = 20;
		  public static void ejercicio6(double masa,double gravedad,double altura) {
			
			 Double energia = masa * gravedad *altura;
			 System.out.println("La energia potencial es igual a: " + energia);
			 
		  }
		  double temini = 300;
		   double temfin = 600;
		   double alfa = 500;
		  public static void ejercicio7(double temini,double temfin,double alfa) {
			  double voltaje = alfa *(temfin-temini);
			  System.out.println("El voltaje es: "+voltaje);
			  
		  }
		 
	}

