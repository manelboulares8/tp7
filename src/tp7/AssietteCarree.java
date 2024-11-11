package tp7;

import java.time.LocalDate;

public class AssietteCarree extends Assiette{
	protected double cote;

	public AssietteCarree(int annee,double cote) {
		super(annee);
		this.cote=cote;
	}
public double surface() {
	return cote*cote;
}
public double valeurtot() {
	return 5*super.valeurtot();
}

}
