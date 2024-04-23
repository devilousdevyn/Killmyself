package Killingmyself;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		 Places[] map = new Places[10];
		 
		 map[0]=new Places("Start");
		 map[1]=new Places("1");
		 map[2]=new Places("2");
		 map[3]=new Places("Shop");
		 map[4]=new Places("4");
		 map[5]=new Places("5");
		 map[6]=new Places("6");
		 map[7]=new Places("Boss");
		 map[8]=new Places("8");
		 map[9]=new Places("9");
	 
		 map[0].addWay(null, null, map[1], map[2]);
		 map[1].addWay(map[0], null, null, null);
		 map[2].addWay(map[4], map[0], null, map[3]);
		 map[3].addWay(null, map[2], null, null);
		 map[4].addWay(map[5], null, map[2], null);
		 map[5].addWay(map[8], null, map[4], map[6]);
		 map[6].addWay(null, map[5], null, map[7]);
		 map[7].addWay(null, map[6], null, null);
		 map[8].addWay(null, map[9], map[5], null);
		 map[9].addWay(null, null, null, map[8]);
	 		
		 		Places WhereIAm = map[0];
		 		Scanner scan = new Scanner(System.in);
		 		while(!WhereIAm.getNazwa().equals("Boss")) {
		 			System.out.println("Jesteś w "+ WhereIAm.getNazwa());
		 			System.out.println("Możesz pójść: " + WhereIAm.wypiszPrzejscia());
		 	
		 			
		 		char choice = scan.next().charAt(0);
		 		int i = 0;
		 		switch(choice) {
		 		
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
		 		}
		 		
		 		if(WhereIAm.wybierzPrzejscie(i)!=null)
		 			WhereIAm=WhereIAm.wybierzPrzejscie(i);
		 		else
		 			System.out.println("Nieprawidłowy Wybór");
		 		}
		 		System.out.println("``You're not supposed to be here.`` said God after entering his garden unannounced");
		 		System.out.println("YOU DIED");
		 		
		 		if (WhereIAm.equals(map[3])) {
//		 			wejście do sklepu
		 		}
		 	}
		 	
		 }