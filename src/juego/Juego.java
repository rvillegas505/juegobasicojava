package juego;

import java.util.Scanner;

public class Juego {
	//\n
	Scanner gscan = new Scanner(System.in);
	String  nameplayer;
	String  namedate;
	Integer puntos;
	String  mimiedo;


	
	public void creacion() {
		System.out.println("");
		System.out.println("=========================================");
		System.out.println("");
		System.out.println(">>>>>>>>Bienvenido a CitaFebrero<<<<<<<<<");
		System.out.println("");
		System.out.println("=========================================");
		System.out.println("");
		System.out.println("Ingresa tu nombre");
		nameplayer= gscan.nextLine();
		System.out.println("Ingresa el nombre de tu cita");
		namedate  = gscan.nextLine();
		System.out.println("=========================================");
		puntos=10;
		System.out.println("Bienvenido "+ nameplayer +"\nTu cita con " + 
		namedate + " esta por comenzar" + "\nTus puntos son "+ puntos);
		System.out.println("=========================================");
		primerCaso();
	}
	
	
	public void primerCaso() {
		System.out.println("         ");
		System.out.println("---------------Situacion 1---------------");
		System.out.println("         ");
		System.out.println(namedate +" esta llegando a la mesa del bar\nQue haces?");
		System.out.println("         ");
		System.out.println("------------Selecciona Opcion------------");
		System.out.println("1- Espero Sentado a " + namedate + "\n2- Me levanto a saludar\n3- Me escapo");
		
		Integer ele1;
		ele1=gscan.nextInt();
		gscan.nextLine();
		
		if (ele1==1) {
			System.out.println("         ");
			System.out.println("Que clase de educacion tenes? Se tiene que saludar");
			System.out.println("Perdes 1 punto");
			puntos= puntos-1;
			System.out.println("         ");
			System.out.println(">>Tus puntos del juego son " + puntos+"<<");
			segundoCaso();
			
		}
		if (ele1==2) {
			System.out.println("         ");
			System.out.println("Buenos modales!");
			System.out.println("No perdes Puntos");
			System.out.println(">>Tus puntos del juego son " + puntos+"<<");
			segundoCaso();
		}
		if (ele1==3) {
			puntos = puntos-10;
			System.out.println("         ");
			System.out.println("Maravillosa jugada...");
			System.out.println(">>Tus puntos del juego son " + puntos+"<<");
			System.out.println("Segui participando");
			System.out.println("Game over");
			System.out.println("");
			System.out.println("Ingrese cualquier numero para volver a jugar");
			System.out.println("");
			gscan.nextLine();
			creacion();
		}
		else {
			primerCaso();
		}
		
		
	}
	
	public void segundoCaso() {
		System.out.println("         ");
		System.out.println("---------------Situacion 2---------------");
		System.out.println("         ");
		System.out.println(namedate+" ya está en la mesa\nQue haces?");
		System.out.println("         ");
		System.out.println("------------Selecciona Opcion------------");
		System.out.println("         ");
		System.out.println("1- Empiezo a conversar\n2- Saco el celular\n3- Voy al baño");
		
		Integer ele2;
		ele2=gscan.nextInt();
		gscan.nextLine();
		
		if (ele2==1) {
			System.out.println("         ");
			System.out.println("Buenos modales!");
			System.out.println("No perdes Puntos");
			System.out.println(">>Tus puntos del juego son " + puntos+"<<");
			tercerCaso();
			
		}
		if (ele2==2) {
			System.out.println("         ");
			System.out.println("Que clase de educacion tenes?");
			System.out.println("perdes 1 punto");
			puntos= puntos-1;
			System.out.println(">>Tus puntos del juego son " + puntos+"<<");
			tercerCaso();
		}
		if (ele2==3) {
			puntos = 0;
			System.out.println("         ");
			System.out.println("Maravillosa jugada...");
			System.out.println(">>Tus puntos del juego son " + puntos+"<<");
			System.out.println("Segui participando");
			System.out.println("Game over");
			System.out.println("");
			System.out.println("Ingrese cualquier numero para volver a jugar");
			System.out.println("");
			gscan.nextLine();
			creacion();
		}
		else {
			segundoCaso();
		}
		
	}
	
	public void tercerCaso() {
		System.out.println("         ");
		System.out.println("---------------Situacion 3---------------");
		System.out.println("         ");
		System.out.println("Tu cita no sabe que pedir de tomar y comer\nQue haces?");
		System.out.println("         ");
		System.out.println("------------Selecciona Opcion------------");
		System.out.println("1- Le recomiendo algo que no se que es pero tiene buena pinta\n2- Le recomiendo algo que "
				+ "si probé pero que es muy simple y común\n3- Le digo que yo tampoco");
		
		Integer ele2;
		ele2=gscan.nextInt();
		gscan.nextLine();
		
		if (ele2==1) {
			System.out.println("Tuviste suerte, era algo realmente bueno!");
			System.out.println("No perdes Puntos");
			System.out.println(">>Tus puntos del juego son " + puntos+"<<");
			cuartoCaso();
			
		}
		if (ele2==2) {
			System.out.println("Era simple, ibas a lo seguro, llegó el plato y...\nNo le gustó");
			System.out.println("perdes 1 punto");
			puntos= puntos-1;
			System.out.println(">>Tus puntos del juego son " + puntos+"<<");
			cuartoCaso();
		}
		if (ele2==3) {
			System.out.println("Media pila...");
			System.out.println("perdes 2 puntos");
			puntos= puntos-2;
			System.out.println(">>Tus puntos del juego son " + puntos+"<<");
			cuartoCaso();
		}
		else {
			tercerCaso();
		}
	}
	
	
	public void cuartoCaso() {
		System.out.println("         ");
		System.out.println("---------------Situacion 4---------------");
		System.out.println("         ");
		System.out.println("Ya llegaron los platos, están comiendo, todo parece ir bien"
				+ "\nQue haces?");
		System.out.println("         ");
		System.out.println("------------Selecciona Opcion------------");
		System.out.println("1- Saco tema de conversación\n2- Espero a que mi cita "
				+ "saque tema de conversacion");
		
		Integer ele2;
		ele2=gscan.nextInt();
		gscan.nextLine();
		
		if (ele2==1) {
			System.out.println("Comienzan a hablar de la comida y eso conlleva a hablar de otros gustos, "
					+ "empiezas a conocerlo más");
			System.out.println("No perdes Puntos");
			System.out.println(">>Tus puntos del juego son " + puntos+"<<");
			quintoCaso();
			
		}
		if (ele2==2) {
			System.out.println("Luego de un silencio incómodo, te empieza a hablar de sus gustos preferidos de"
					+ "\ncomida, y eso conlleva a hablar de otros gustos musicales, peliculas, etc");
			System.out.println("Perdes 1 punto por colgar");
			puntos= puntos-1;
			System.out.println(">>Tus puntos del juego son " + puntos+"<<");
			quintoCaso();
		}
		else {
			cuartoCaso();
		}
	}
	
	public void quintoCaso() {
		System.out.println("         ");
		System.out.println("---------------Situacion 5---------------");
		System.out.println("         ");
		System.out.println("Luego de seguir hablando...");
		System.out.println("--" +namedate + "-: " + nameplayer +" dejando de lado la charla sobre gustos, tienes algún miedo?");
		System.out.println("         ");
		System.out.println("------------Selecciona Opcion------------");
		System.out.println("1- Me dan miedo los insectos\n2- Me da miedo la sangre ");
		
		Integer ele2;
		ele2=gscan.nextInt();
		gscan.nextLine();
		
		if (ele2==1) {
			System.out.println("Le cuentas acerca que te da miedo diversos insectos");
			mimiedo="insectos";
			System.out.println("-" +namedate + ": Wow! Le tenes miedo a los " +mimiedo+" no me lo esperaba.");
			sextoCaso();
			
		}
		if (ele2==2) {
			System.out.println("Le cuentas acerca de tu miedo de ver sangre");
			mimiedo="sangre";
			System.out.println("-" +namedate + ": Wow! le tenes miedo a la " +mimiedo+" no me lo esperaba.");
			sextoCaso();
		}
		else {
			quintoCaso();
		}
	}
	
	public void sextoCaso() {
		System.out.println("         ");
		System.out.println("---------------Situacion 6---------------");
		System.out.println("         ");
		System.out.println("Siguen conversando un rato mas...");
		System.out.println("-"+namedate+": Voy al baño, ya vuelvo");
		System.out.println(" ");
		System.out.println("Cuando " +namedate+ " se levanta y se dirige al baño"
				+ "\nVes que de su bolso que dejó en la silla sobresale un pañuelo que te llama la atención"
				+ "\nQue haces? ");
		System.out.println("         ");
		System.out.println("------------Selecciona Opcion------------");
		System.out.println("1- Me levanto y lo tomo\n2- No hago nada");
		
		Integer ele2;
		ele2=gscan.nextInt();
		gscan.nextLine();
		
		if (ele2==1) {
			System.out.println("Agarras el pañuelo, es un pañuelo comun, pero PERO, ESTA LLENO DE " +mimiedo+
					" Y TU CARA ESTA DIBUJADA AHÍ, \nse escuchan gruñidos y gritos diciendo " +nameplayer+
					" \nVes a tus lados y parece que nadie lo nota, todos lo ignoran...\nAsustado dejas el pañuelo como estaba "
					+ "en el bolso");
			septimoCaso();
			
		}
		if (ele2==2) {
			
			System.out.println("te resistes, no lo tomas, esperas a que "+namedate+" vuelva");
			
			septimoCasoDos();
		}
		else {
			sextoCaso();
		}
	}
	
	public void septimoCaso() {
		System.out.println("         ");
		System.out.println("---------------Situacion 7---------------");
		System.out.println("         ");
		System.out.println(namedate+" vuelve, nota que hay algo medio salido de su bolso. \r\n" + 
				"-¿Hey, viste esto? ¿Estuviste revolviendo mi bolso?\r\n" + 
				"");
		System.out.println("         ");
		System.out.println("------------Selecciona Opcion------------");
		System.out.println("1- ...Si... Perdón, lo tomé para guardarlo\n2- No...no, ya estaba asi"
				+ "\n3- Eeeemm... Emmmm... (dudar)");
		
		Integer ele2;
		ele2=gscan.nextInt();
		gscan.nextLine();
		
		if (ele2==1) {
			System.out.println("         ");
			System.out.println(namedate+": Que bien, pareces ser una persona sincera..."
					+ "\n" +namedate+ " te muestra el pañuelo, pero esta vez no hay nada raro..."
					+ "\n "
					+ "\n"+namedate+": Es un pañuelo que llevo siempre conmigo, es de la buena suerte"
					+ "\n "
					+ "\n(...Realmente no hay nada raro, te quedas pensando que es lo que viste, ¿Fue tu imaginacion?...)"
					+ "\n "
					+ "\n" +namedate+ ": Se esta haciendo tarde... es hora de volver a casa..."
					+ "\n" +namedate+    " Queres acompañarme hasta mi edificio, "+nameplayer+ "?");
			
			System.out.println(" ");
			System.out.println("(Que esta pasando?)");
			System.out.println("... \nIngrese cualquier numero para continuar\n...");
			gscan.nextLine();
				
			octavoCaso();
			
		}
		if (ele2==2) {
			System.out.println("         ");
			System.out.println(namedate+": Que bien, pareces ser una persona respetuosa..."
					+ "\nYa se hizo tarde es momento de volver a casa... "
					+ "\nHablemos en estos dias para salir de vuelta!");
			System.out.println(" ");
			System.out.println("Bueno... esto es raro... pero al menos no te descubrieron... ");
			
			casoFinal();
		}
		
		if (ele2==3) {
			System.out.println("         ");
			System.out.println(namedate+"; SI O NO!?");
			System.out.println("         ");
			septimoCaso();
		}
		else {
			septimoCaso();
		}
	}
	
	public void septimoCasoDos() {
		System.out.println("         ");
		System.out.println("---------------Situacion 7---------------");
		System.out.println("         ");
		System.out.println(namedate+" vuelve, nota que hay algo medio salido de su bolso. \r\n" + 
				"-¿Hey, viste esto? ¿Estuviste revolviendo mi bolso?\r\n" + 
				"");
		System.out.println("         ");
		System.out.println("------------Selecciona Opcion------------");
		System.out.println("1- No, no lo tomé\n2- Ya estaba salido, no lo toque ni guarde por respeto");
		Integer ele2;
		ele2=gscan.nextInt();
		gscan.nextLine();
		
		if (ele2==1) {
			System.out.println("         ");
			System.out.println(namedate+": Que bien, pareces ser una persona respetuosa..."
					+ "\nYa se hizo tarde es momento de volver a casa... "
					+ "\nHablemos en estos dias para salir de vuelta!");
			casoFinal();
			
		}
		if (ele2==2) {
			System.out.println("         ");
			System.out.println(namedate+": Que bien, pareces ser una persona respetuosa..."
					+ "\nYa se hizo tarde es momento de volver a casa... "
					+ "\nHablemos en estos dias para salir de vuelta!");
			
			casoFinal();
		}
		else {
			septimoCasoDos();
		}	
	}
	
	
	public void octavoCaso() {
		System.out.println("         ");
		System.out.println("---------------Situacion 8---------------");
		System.out.println("         ");
		System.out.println("No sabes que esta pasando...\nNo te acuerdas que pasó pero..."
				+ "\nEstas caminando con "+namedate+" hacia el edificio donde vive...");
		System.out.println("         ");
		System.out.println("...Estas confundido...\nIngresa cualquier numero para continuar...");
		gscan.nextLine();
		System.out.println(" ... ");
		System.out.println("Bueno, ya estan dentro del departamento, es realmente un lindo lugar ");
		System.out.println("Conversas un rato con "+namedate+" mientras sirve un café");
		System.out.println("...\nIngresa cualquier numero para continuar... ");
		gscan.nextLine();
		System.out.println("- "+namedate+": "+nameplayer+" Voy a pasar al baño, enseguida vuelvo");
		System.out.println("...\nIngresa cualquier numero para continuar... ");
		gscan.nextLine();
		System.out.println("...\nPasan los minutos y no vuelve...\nIngresa cualquier numero para continuar ");
		gscan.nextLine();
		System.out.println("...\nDecides ir hacia la puerta del baño a preguntar si esta bien..."
				+ "\nIngresa cualquier numero para continuar... ");
		gscan.nextLine();
		System.out.println("...\nTocas la puerta y nada...\nIngresa cualquier numero para golpear la puerta otra vez ");
		gscan.nextLine();
		System.out.println("*TOC TOC*...\n...no responde...\nDecides abrir la puerta, quizas le haya pasado algo a "+namedate+
				"\n...Ingresa cualquier numero para abrir la puerta");
		gscan.nextLine();
		novenoCaso();
	}
	
	
	public void novenoCaso() {
		System.out.println("\n.\n.\n.");
		System.out.println("NO ESTA!... "+namedate+" NO ESTA!, NO HAY NADIE EN EL BAÑO");
		System.out.println("Te tomas la cabeza, no sabes que pasa... La puerta se cierra!"
				+ "\nIngresa cualquier numero para abrirla!");
		gscan.nextLine();
		System.out.println("La abres pero... HAY UNA PARED, ESO NO ESTABA ANTES!"
				+ "\nDe repente empiezas a ver "+mimiedo+" salir de todos lados del baño!"
						+ "\nNo puedes creerlo... Abres y cierras la puerta desesperadamente hasta que se logra abrir..."
						+ "\nPero... se abre a un pasillo... De todas maneras es mejor lugar que este! "
						+ "Ingrese cualquier numero para salir");
		gscan.nextLine();
		System.out.println("            ");
		System.out.println("    \n.\n.\n.    ");
		System.out.println("No quedaba otra, lograste salir, es un pasillo extraño, oscuro y solo se ven 3 puertas a lo lejos..."
				+ "\nDecides acercarte...\n(Ingresa cualquier numero para continuar) ");
		gscan.nextLine();
		decimoCaso();
		
	}
	
	public void decimoCaso() {
		System.out.println("\n.\n.\n.");
		System.out.println(" Ves un numero pintado en rojo arriba en el techo, \nEl numero es >>"+puntos+"<<");
		System.out.println("Tambien hay un numero sobre las puertas... Debes entrar en alguna para salir");
		System.out.println("En cual entras?");
		System.out.println("1-Puerta 1\n2-Puerta 2\n3-Puerta 3");
		
		Integer ele2;
		ele2=gscan.nextInt();
		gscan.nextLine();
		
		if (ele2==1) {
			finalBueno();
		}
		
		if (ele2==2) {
			puntos=puntos-2;
			System.out.println("...");
			System.out.println("LA HABITACION ESTA LLENA DE "+mimiedo);
			System.out.println("Vuelves atras ");
			onceCaso();
		}
		if (ele2==3) {
			puntos=puntos-2;
			System.out.println("...");
			System.out.println("LA HABITACION ESTA LLENA DE "+mimiedo);
			System.out.println("Vuelves atras ");
			onceCaso();
		}
		else {
			decimoCaso();
		}
		
		
	}
	
	public void onceCaso() {
		if (puntos>0) {
			System.out.println(" \n.\n.\n. ");
			System.out.println("Ves el numero pintado en rojo arriba en el techo, \nAhora el numero es >>"+puntos+"<<");
			System.out.println("Te sientes un poco mareado...");
			System.out.println("En cual Puerta entras ahora?");
			System.out.println("1-Puerta 1\n2-Puerta 2\n3-Puerta 3");
			
			Integer ele2;
			ele2=gscan.nextInt();
			gscan.nextLine();
			
			if (ele2==1)  {		
				finalBueno();
				
			}
			
			if (ele2==2) {
				puntos=puntos-2;
				System.out.println("...");
				System.out.println("LA HABITACION ESTA LLENA DE "+mimiedo);
				System.out.println("Vuelves atras ");
				onceCaso();
			}
			if (ele2==3) {
				puntos=puntos-2;
				System.out.println("...");
				System.out.println("LA HABITACION ESTA LLENA DE "+mimiedo);
				System.out.println("Vuelves atras ");
				onceCaso();
			}
			else {
				onceCaso();
			}
		}
		
		else {
			finalMalo();
		}
		
	}
	
	public void finalBueno() {
		System.out.println("...");
		System.out.println("...");
		System.out.println("Te levantas en tu cama. ¿Esto fue un sueño?...");
		System.out.println("");
		System.out.println("Ingrese cualquier numero para volver a jugar");
		System.out.println("");
		gscan.nextLine();
		
		creacion();
	}
	
	public void finalMalo() {
		System.out.println("Vuelves a la sala de puertas... ");
		System.out.println(namedate+" ESTA AQUI! VIENE HACIA TI CON UN CUCHILLO");
		System.out.println("INGRESA CUALQUIER NUMERO PARA CORRER");
		gscan.nextLine();
		System.out.println("Al girarte para correr en sentido contrario, ves a "+namedate+" justo en frente tuyo...");
		System.out.println(namedate+" te apuñala...\nTodo se vuelve oscuro...");
		System.out.println("");
		System.out.println("Ingrese cualquier numero para volver a jugar");
		System.out.println("");
		gscan.nextLine();
		
		creacion();
	}
	
	
	
	public void casoFinal() {
		System.out.println("---------------------------------------------------");
		System.out.println("Ha terminado la cita, tus puntos fueron: " + puntos );
		System.out.println("---------------------------------------------------");
		
		
		switch (puntos) {
		case 10:
			System.out.println("Excelente! Pero... lo del pañuelo fue raro no?");
			System.out.println("----------");
			System.out.println("----------");
			break;
		case 9:
			System.out.println("Excelente! Pero... lo del pañuelo fue raro no?");
			System.out.println("----------");
			System.out.println("----------");
			break;
		case 8:
			System.out.println("Buen trabajo! Pero... lo del pañuelo fue raro no?");
			System.out.println("----------");
			System.out.println("----------");
			break;
		case 7:
			System.out.println("Buen trabajo!");
			System.out.println("Pero... lo del pañuelo fue raro no?");
			System.out.println("----------");
			break;
		case 6:
			System.out.println("No estuviste mal...Pero... lo del pañuelo fue raro no?");
			System.out.println("----------");
			System.out.println("----------");
			break;
		case 5:
			System.out.println("Flojo... Pero... lo del pañuelo fue raro no?");
			System.out.println("----------");
			System.out.println("----------");
			break;
		case 4:
			System.out.println("Mal :c no lo has conseguido");
			System.out.println("PD: Lo del pañuelo fue raro no?");
			System.out.println("----------");
			break;
		case 3:
			System.out.println("Mal :c no lo has conseguido");
			System.out.println("PD: Lo del pañuelo fue raro no?");
			System.out.println("----------");
			break;
		case 2:
			System.out.println("Mal :c no lo has conseguido");
			System.out.println("PD: Lo del pañuelo fue raro no?");
			System.out.println("----------");
			break;
		case 1:
			System.out.println("Mal :c no lo has conseguido");
			System.out.println("PD: Lo del pañuelo fue raro no?");
			System.out.println("----------");
			break;
		}
		System.out.println("");
		System.out.println("Ingrese cualquier numero para volver a jugar");
		System.out.println("");
		gscan.nextLine();
		
		creacion();
	}
	
	
	

}
