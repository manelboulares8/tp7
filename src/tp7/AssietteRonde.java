package tp7;

public class AssietteRonde extends Assiette {
	public double rayon;

	public AssietteRonde(int annee,double rayon) {
		super(annee);
		this.rayon=rayon;
	}
	public double surface() {
		
    	return 3.14*rayon*rayon;

	}

}
