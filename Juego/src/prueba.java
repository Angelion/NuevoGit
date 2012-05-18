/*
 * prueba.java
	VIDEOJUEGO
	* Inicio
	* 	Preguntar nombre
	* 	leer nombre
	* 	repetir
	* 	mostrar personaje
	* 	mostrar menu opcion y validar
	* 	segun opcion
	* 		caso 1:
	* 			buscar enemigos
	* 		caso 2:
	* 			buscar tesoro
	* 		caso 3:
	* 			mejorar
	* 		caso 4: 
	* 			imprimir estado
	* 	fin segun
	* mientras (queramos seguir)
 
	BUSCAR ENEMIGOS
	* inicio
	* 	preparar nombre--NUEVO MODULO
	* 	luchar-----------NUEVO MODULO
	* 	actualizar estado-NUEVO MODULO
	* 	devolver (experiencia)
	* fin
	* 
	BUSCAR TESORO
	* inicio
	* 	realizar busqueda
	* 	cambiar opcion
	* fin
	
	MEJORAR
	* inicio
	* repetir
	* 	mostrar opciones-NUEVO MODULO
	* 	segun opcion
	* 		caso 1:
	* 			mejorar a
	* 		caso 2:
	* 			mejorar b
	* 		caso 3:
	* 			mejorar c
	* 	fin segun
	* 	preguntar si seguir
	* mientras (queramos seguir) 
	* devolver (dinero)
	* fin pp
	* 		
	
	PREPARAR NOMBRE
	* inicio
	* 	para (letra=0, letra menor que 8, letra ++)
	* 		realizar random
	* 		imprimir vocal o consonante
	* 	fin para
	* fin	
 
	LUCHAR
	* Inicio
	* 	generar enemigo
	* 	mientras(enemigo no muerto o protagonista no muerto)
	* 		Mostrar opcion de lucha--NUEVO MODULO
	* 		Realizar accion del enemigo
	* 	fin mientras
	* devolver experiencia
	* 
	
	OPCION DE LUCHA
	* inicio
	* 	repetir
	* 		escribir("LUCHAR, ESQUIVAR, DEFENDER")
	* 		leer opcion
	* 	mientras (eleccion no valida)
	* 	segun (opcion)
	* 		caso 1: 
	* 			realizar ataque
	* 			validar si se realizó--NUEVO MODULO
	* 		caso 2:
	* 			realizar esquivo
	* 			validar si se realizo
	* 		caso 3:
	* 			realizar resistir
	* 			validar si se realizo
	*	fin segun
	* fin pp
	
	VALIDAR SI REALIZADO
	* inicio
	* 	tirada aleatoria para protagonista
	* 	tirada aleatoria para pc
	* 	comparar cual es mayor
	* 	si gano protagonista
	* 		opcion=1
	* 	sino
	* 		opcion=2
	* devolver opcion
 */

import java.util.*;

public class prueba {
	static int buscarenemigos (int a, int b, int c, int d, int e,String f)//vida, ataque, defensa, agilidad, nivel y nombre
	{
		Random rnd=new Random();
		int nivelenemigo=0,experiencia=0; 
		imprimirnombre();
		nivelenemigo=rnd.nextInt(10)+e;
		experiencia=luchar(a,b,c,d,nivelenemigo,f,e); 
		return(experiencia);
		}
	
	static int buscartesoro ()
	{
		Random rnd=new Random();
		int pocion=0, suerte=0, dinero=1;
		pocion=rnd.nextInt(10);
		suerte=rnd.nextInt(10);
		if(pocion>suerte)
			{
			dinero=rnd.nextInt(100)+50;
			System.out.println("¡Felicidades! ¡Encontraste "+dinero+" de dinero");
			}
		else{
			System.out.println("Vaya!...No encontraste nada...");
			}
		return(dinero);		
		}
	
	static int mejorar (int a)//dinero	
	{
		int aux;
		aux=a;
		aux=aux*5/10;
		a=aux;
		return(a);
		}
		
	static void pintarenemigo ()
	{
		Random rnd=new Random ();
		int aux=0, i;
		for(i=0;i<3;i++)
		{
			aux=rnd.nextInt(5)+1;
			if(i==0)
				{
				switch(aux)
					{
					case 1:
							System.out.println("  \\|||/  ");
							System.out.println(" | @   @|");
							System.out.println(" |  || /");
							System.out.println("  \\_=_/");
							break;
					case 2:	
							System.out.println(" (_(_|_)_)  ");
							System.out.println(" / +   -\\");
							System.out.println(" \\  (0) /");
							System.out.println("  \\_ Y_/");
							break;
					case 3:
							System.out.println("  ______  ");
							System.out.println(" / 0   0\\");
							System.out.println(" \\  3  /");
							System.out.println("  \\_W_/");
							break;
					case 4:
							System.out.println("  ______  ");
							System.out.println(" / () ()\\");
							System.out.println(" \\  -  /");
							System.out.println("  \\_()/");
							break;
					case 5:
							System.out.println("  ______  ");
							System.out.println(" / -  __-\\");
							System.out.println(" \\   __)/");
							System.out.println("  \\__?_/");
							System.out.println("  /  /");
							System.out.println(" /  /");
							System.out.println("  \\__\\");
							break;

					}		
				}
				if(i==1)
				{
					switch(aux)
					{
					case 1:
							System.out.println(" | 11 | ");
							System.out.println(" \\ 11  \\");
							System.out.println("  | 11	|");
							System.out.println("  / 11 /");
							System.out.println(" / 11/	");
							System.out.println(" (11 )");
							break;
					case 2:	
							System.out.println(" |      |");
							System.out.println(" ( .) ( .)");
							System.out.println(" |      |");
							System.out.println(" |   o  |");
							break;
					case 3:
							System.out.println(" (  - - )");
							System.out.println(" [_.||._]");
							System.out.println("  \\ __ /");
							System.out.println("  | __ |");
							break;
					case 4:
							System.out.println("   ||");
							System.out.println("   ||");
							System.out.println("   ||");
							System.out.println("   ||");
							break;
					case 5:
							System.out.println(" | # @ #|");
							System.out.println(" | @ # @|");
							System.out.println(" | # @ #|");
							System.out.println(" | @ # @|");
							break;

					}		
				}
				if(i==2)
				{
					switch(aux)
					{
						case 1:
							System.out.println(" | | | |");
							System.out.println(" [ ] [ ]");
							System.out.println(" ( ) ( )");
							System.out.println("(__) (__)");
							break;
						case 2:
							System.out.println("  |___| ");
							System.out.println("   |_|_");
							System.out.println("  // | \\");
							System.out.println("  || O |");
							System.out.println("  \\\\___/");
							break;
						case 3:
							System.out.println(" | | | |");
							System.out.println(" [ ] [ ]");
							System.out.println(" ( ) \\ /");
							System.out.println("(__)  0");
							break;
						case 4:
							System.out.println(" |   |_______");
							System.out.println(" |           \\");
							System.out.println(" |            |");
							System.out.println(" |  |   |__|  |");
							System.out.println(" |__|___|  |__|");
							System.out.println("  V-V V-V   V-V");
							break;
						case 5:
							System.out.println(" 10010110101");
							System.out.println(" 01010 01010");
							System.out.println("  010   101");
							System.out.println("   10   01");
							System.out.println("   01    01");
							System.out.println(" 1001    10001");
							break;				
						}
					}	
		}
	System.out.print("\n");
	}	
	
	static void imprimirnombre	()
	{
		Random rnd=new Random ();
		int i, numero=0, opcion=1;
		System.out.print("Un ");
		for(i=0;i<4;i++)
			{
			if(opcion==1)
			 {
				 numero=rnd.nextInt(5);
				 switch(numero)
				 {
					case 0:
						System.out.print("a");
						break;
					case 1:
						System.out.print("e");
						break;
					case 2:
						System.out.print("i");
						break;
					case 3:
						System.out.print("o");
						break;
					case 4:
						System.out.print("u");
						break;			
				 }
				opcion=0; 
			}	
			if(opcion==0){	
			numero=rnd.nextInt(21);
			switch(numero)
				{
				case 0:
					System.out.print("b");
					break;
				case 1:
					System.out.print("c");
					break;
				case 2:
					System.out.print("d");
					break;
				case 3:
					System.out.print("f");
					break;
				case 4:
					System.out.print("g");
					break;
				case 5:
					System.out.print("h");
					break;
				case 6:
					System.out.print("j");
					break;
				case 7:
					System.out.print("k");
					break;
				case 8:
					System.out.print("l");
					break;
				case 9:
					System.out.print("m");
					break;
				case 10:
					System.out.print("n");
					break;
				case 11:
					System.out.print("p");
					break;
				case 12:
					System.out.print("q");
					break;				
				case 13:
					System.out.print("r");
					break;									
				case 14:
					System.out.print("s");
					break;
				case 15:
					System.out.print("t");
					break;
				case 16:
					System.out.print("v");
					break;
				case 17:
					System.out.print("w");
					break;
				case 18:
					System.out.print("x");
					break;
				case 19:
					System.out.print("y");
					break;
				case 20:
					System.out.print("z");
					break;							
				}
			opcion=1;
			}	
			}
		System.out.println(" aparecio!");	
		}
	
	static int luchar (int a, int b, int c, int d, int e, String nombre, int g )//vida, ataque, defensa, agilidad, nivel enemigo,nombre y nivel
	{
		Random rnd =new Random ();
		int vidaenemigo,aux,dano,experiencia=0;
		aux=rnd.nextInt(10)+1;
		vidaenemigo=aux*e+1;
		pintarenemigo();
		while((vidaenemigo>0) && (a>0))
			{
			imprimirestado(g,a,nombre);
			if(vidaenemigo>0)	
				System.out.println("VIDA DEL ENEMIGO:"+vidaenemigo);	
			dano=opciondelucha(b,c,d);
			if(dano>0)
				{
				vidaenemigo=vidaenemigo-dano;
				if(vidaenemigo>0)
					{
					dano=accionenemigo(e);
					a=a-dano;
					}
				}
			if(dano<0)
				{
				dano=dano*(-1);
				vidaenemigo=vidaenemigo+dano;
				if(vidaenemigo>0)
					{
					dano=accionenemigo(e);
					a=a-dano;
					}	
				}
			}
		if(a>0)	
			{
			experiencia=e*2;
			System.out.println("Conseguiste "+experiencia+" puntos de experiencia!");
			}
		else
			{
			experiencia=0;
			}
		return(experiencia);	
		}
	
	static int opciondelucha (int a, int b, int c)//ataque, defensa, agilidad
	{
		Random rnd =new Random ();
		Scanner teclado=new Scanner (System.in);
		int opcion,dano=0,accion,suerte;
		do{
		System.out.print("\tQue haras?\n1)LUCHAR\t2)ESQUIVAR\n\t3)DEFENDERME\nRESP:");
		opcion=teclado.nextInt();
		}while(opcion<1 || opcion>3);
		switch(opcion)
			{
			case 1:
				accion=rnd.nextInt(9);
				accion=a-accion;
				if(validaraccion())
					{
					dano=accion;
					System.out.println("Hiciste "+dano+" puntos de herida");	
					}
				break;
			case 2:
				accion=rnd.nextInt(c);
				suerte=rnd.nextInt(c);
				if(accion>suerte)
					{
					dano=0;
					System.out.println("Esquivaste el ataque!");
					}
				break;
			case 3:
				accion=rnd.nextInt(10)+b;
				suerte=rnd.nextInt(10)+b;
				if(accion>suerte)
					{
					dano=accion-suerte/10;
					System.out.println("Te defendiste del ataque! Realizaste "+dano+" puntos de herida");	
					}
				else
					{
					dano=suerte-accion;
					System.out.println("No sirvio defenderse! el enemigo recupero "+dano+" puntos de vida");	
					dano=dano*-1;
					}
				break;
			}
		return(dano);	
		}	
	
	static int accionenemigo (int a)//nivel enemigo, defensa
	{
		Random rnd=new Random ();
		int dano=0;
		dano=rnd.nextInt(2)*a;
		System.out.println("El enemigo te hizo "+dano+" puntos de herida");
		return(dano);
		}
	
	static boolean validaraccion ()//devolver si realizado o no
	{
		Random rnd=new Random ();
		boolean opcion=false;
		int suerte, suertepc;
		suerte=rnd.nextInt(20);
		suertepc=rnd.nextInt(10);
		if(suerte>suertepc)
			opcion=true;
		else
			System.out.println("Fallaste!");
		return(opcion);
		}
		
	static int menu ()
	{
		Scanner teclado=new Scanner (System.in);
		int resp;
		do{
		System.out.print("Que quieres hacer?\n1)BUSCAR ENEMIGOS!\t2)BUSCAR TESOROS\n3)MEJORAR\t\t4)ESTADO\n\t5)SALIR\nRESP:");
		resp=teclado.nextInt();
		}while(resp<1 || resp>5);
		return(resp);
		}
	
	static void limpiapantalla ()
	{
		int i;
		for(i=0;i<15;i++)
			{
			System.out.print("\n");	
			}
		}		
	
	static void imprimirestado (int a, int b, String c)//nivel, vida, nombre
	{
		System.out.print("Lv"+a+" "+c+"\tVIDA:");
		for(int i=0;i<b;i++)
			{
			System.out.print("\3");
			}
		System.out.print("\n");
		}		
		
	 static int calcularmejora (int a, int b) //contador de mejora, mejora
	 {
		 int total=0;
		 total=b*a*5;
		 return(total);
		 }	
		 
	static void pintar ()
	{
		System.out.println("    __             _____             _   ");
		System.out.println(" __|  |___ _ _ ___|     |_ _ ___ ___| |_ ");
		System.out.println("|  |  | .'| | | .'|  |  | | | -_|_ -|  _|");
		System.out.println("|_____|__,|\\_/|__,|__  _|___|___|___|_|  ");
		System.out.println("                     |__|                ");                                                                                    
		}	
		

	public static void main (String args[]) {
		Scanner teclado=new Scanner(System.in);
		int nivel=1, experiencia=0,vida=25, ataque=10, agilidad=10, defensa=10,opcion,ocasion=1,dinero=100,mejora,costo,puntos, contatq=1, contdef=1, contagi=1,aux1=0;
		String nombre, aux;
		pintar();
		System.out.print("Como te llamas?:");
		nombre=teclado.nextLine();
		do{
		limpiapantalla();
		pintar();
		imprimirestado(nivel,vida,nombre);
		opcion=menu();
		switch(opcion)
			{
			case 1:
					aux1=buscarenemigos(vida, ataque, defensa, agilidad, nivel, nombre);
					experiencia=aux1+experiencia;
						while(experiencia>=10*nivel)
							{
							System.out.println("\7\7FELICIDADES!, SUBES DE NIVEL!");
							nivel++;	
							vida=vida+5+(nivel/10);
							if(experiencia>=10*nivel)
								experiencia=experiencia-(nivel*10);
							}	
							if(experiencia==-1)
							{
							System.out.println("\t\tGAME OVER\n\t"+nombre+" murio...\n");	
							opcion=5;
							}
					ocasion=1;	
					System.out.print("Introduce cualquier tecla para seguir:");
					aux=teclado.next();
					break;
			case 2:
				if(ocasion==1)
					{
					puntos=buscartesoro();
					dinero=dinero+puntos;
					ocasion=0;
					}
				else
					System.out.println("Tranquilo, solo podemos buscar despues de pelear");	
					System.out.print("Introduce cualquier tecla para seguir:");
					aux=teclado.next();
					break;
			case 3:
					do{
					System.out.print("Que deseas mejorar?\n1)ATAQUE\t2)DEFENSA\t3)AGILIDAD\n\t4)SALIR\nRESP:");
					mejora=teclado.nextInt();
					}while(mejora<1 || mejora>4);
					switch(mejora)
						{
							case 1:
								costo=calcularmejora(contatq,ataque);
									if(dinero>=costo)
										{
										puntos=mejorar(ataque);
										dinero=dinero-costo;
										ataque=ataque+puntos;
										contatq++;
										System.out.println("Ahora! tu ataque sera de "+ataque+" puntos");
										}
									else
										{
										System.out.println("No tienes suficiente dinero\nTienes "+dinero+"\tCuesta:"+costo);	
										}
								
								System.out.print("Introduce cualquier tecla para seguir:");
								aux=teclado.next();
								break;
							case 2:
								costo=calcularmejora(contdef,defensa);
									if(dinero>=costo)
										{
										puntos=mejorar(defensa);
										dinero=dinero-costo;
										defensa=defensa+puntos;
										contdef++;
										System.out.println("Ahora! tu defensa sera de "+defensa+" puntos");
										}
									else
										{
										System.out.println("No tienes suficiente dinero\nTienes "+dinero+"\tCuesta:"+costo);	
										}
								
								System.out.print("Introduce cualquier tecla para seguir:");
								aux=teclado.next();
								break;
							case 3:
								costo=calcularmejora(contagi,agilidad);
									if(dinero>=costo)
										{
										puntos=mejorar(agilidad);
										dinero=dinero-costo;
										agilidad=agilidad+puntos;
										contagi++;
										System.out.println("Ahora! tu agilidad sera de "+agilidad+" puntos");
										}
									else
										{
										System.out.println("No tienes suficiente dinero\nTienes "+dinero+"\tCuesta:"+costo);	
										}
								
								System.out.print("Introduce cualquier tecla para seguir:");
								aux=teclado.next();
								break;
							case 4:
								System.out.print("Introduce cualquier tecla para seguir:");
								aux=teclado.next();
								break;
							}
							break;	
					case 4:
								limpiapantalla();
								imprimirestado(nivel, vida, nombre);
								System.out.println("\t\tATQ:"+ataque+"\tDEF:"+defensa+"\tAGI:"+agilidad);
								System.out.println("\t\t\tDINERO: "+dinero);
								System.out.println("Experiencia: "+experiencia+"/"+nivel*10);
								System.out.print("Introduce cualquier tecla para seguir:");
								aux=teclado.next();
								break;
				}
		}while(opcion!=5);	
		
	}
}

