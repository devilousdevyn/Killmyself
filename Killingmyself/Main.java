package Killingmyself;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		 Places[] map = new Places[10];
		 
		 map[0]=new Places("Start");
		 map[1]=new Places("1");
		 map[2]=new Places("2");
		 map[3]=new Places("3");
		 map[4]=new Places("4");
		 map[5]=new Places("5");
		 map[6]=new Places("6");
		 map[7]=new Places("Boss");
		 map[8]=new Places("8");
		 map[9]=new Places("9");
	 
		 map[0].dodajPrzejscie(null, null, map[1], null);
		 map[1].dodajPrzejscie(null, null, null, null);
		 map[2].dodajPrzejscie(map[4], map[0], null, map[3]);
		 map[3].dodajPrzejscie(null, map[2], null, null);
		 map[4].dodajPrzejscie(map[5], null, map[2], null);
		 map[5].dodajPrzejscie(map[8], null, map[4], map[6]);
		 map[6].dodajPrzejscie(null, map[5], null, map[7]);
		 map[7].dodajPrzejscie(null, map[6], null, null);
		 map[8].dodajPrzejscie(null, map[9], map[5], null);
		 map[9].dodajPrzejscie(null, null, null, map[8]);
	 		
		 		Places aktualneMiejsce = map[0];
		 		Scanner scan = new Scanner(System.in);
		 		char wybor;
		 		while(!aktualneMiejsce.equals(map[6])) {
		 			System.out.println("Jesteś w "+ aktualneMiejsce.getNazwa());
		 			System.out.println("Możesz pójść: " + aktualneMiejsce.wypiszPrzejscia());
		 		}
		 		
		 		do {
		 			System.out.println("Twój wybór: ");
		 			wybor = scan.next().charAt(0);
		 		} while(!(wybor=='w' || wybor=='a' || wybor=='s' || wybor=='d' ));
		 		
		 		int i=0;
		 		switch(wybor) {
		 		case 'w':	
		 			i=0;
		 			break;
		 		case 'a':
		 			i=1;
		 			break;
		 		case 's':
		 			i=2;
		 			break;
		 		case 'd':
		 			i=3;
		 			break;
		 		};
		 		
		 		if(aktualneMiejsce.wybierzPrzejscie(i)!=null)
		 			aktualneMiejsce=aktualneMiejsce.wybierzPrzejscie(i);
		 		else
		 			System.out.println("Nieprawidłowy Wybór");
		 	
		 		System.out.println("``You're not supposed to be here.`` said God after entering his garden unannounced");
		 		System.out.println("YOU DIED");
		 	}
		 	
		 }