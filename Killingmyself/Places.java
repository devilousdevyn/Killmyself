package Killingmyself;

public class Places {

	protected String nazwa;
	protected String opis;
	protected Places[] przejscia = new Places[4];
	
	public Places(String nazwa) {
		this.nazwa=nazwa;
		}
	public void dodajPrzejscie(Places w, Places a, Places s, Places d) {
		przejscia[0]=w;
		przejscia[1]=a;
		przejscia[2]=s;
		przejscia[3]=d;
	}
	
	public String wypiszPrzejscia() {
		String drzwi = "";
		if(przejscia[0]!=null) drzwi+="[w]góra ";
		if(przejscia[1]!=null) drzwi+="[a]lewo ";
		if(przejscia[2]!=null) drzwi+="[s]dół ";
		if(przejscia[3]!=null) drzwi+="[d]prawo ";
		
		return drzwi;
	}
	
	public Places wybierzPrzejscie(int i) {
		return przejscia[i];
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
}