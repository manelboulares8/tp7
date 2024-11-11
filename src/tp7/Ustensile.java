package tp7;

import java.time.LocalDate;

abstract public class Ustensile {
	protected int annee;
	
public Ustensile(int annee){
	this.annee=annee;
	
}
public double valeurtot() {
	if (( LocalDate.now().getYear() - annee )<50) {
		return 0;
	}
	else if(( LocalDate.now().getYear() - annee )>50) {
		return (LocalDate.now().getYear())-annee-50;
	}
	return 0;
	
}

}



