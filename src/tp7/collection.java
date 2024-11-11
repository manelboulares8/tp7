package tp7;

import java.time.LocalDate;

class Collection {

    public static void main(String[] args) {
        Ustensile[] us = new Ustensile[5];
        us[0] = new AssietteRonde(1926, 8.4);
        us[1] = new Cuillere(1881, 7.3); 
        us[2] = new AssietteCarree(1935, 5.6); 
        us[3] = new Cuillere(1917, 8.8); us[4] = new
        AssietteRonde(1837, 5.4);
        afficherCuilleres(us);
        afficherSurfaceAssiettes(us);
        afficherValeurTotale(us);
    }
    static void afficherCuilleres(Ustensile[] us) {
        int nbCuilleres = 0;
        int i;
        for (i = 0; i < us.length; i++) {
        if(us[i] instanceof Cuillere) {
        	System.out.println("Cuillere : \n Annee de fabriquation : "+us[i].annee+"\n Longueur  :"+((Cuillere)us[i]).longueur );
        	nbCuilleres ++;
        }
        }
        System.out.println("Il y a"+ nbCuilleres + "cuillères.");
    }
    static void afficherSurfaceAssiettes(Ustensile[] us) {
        double somme = 0;
        int i;
        for ( i = 0; i < us.length; i++) {
            somme+=((Assiette)us[i]).surface();

            }
        }
        System.out.println("Surface totale des assiettes :"+ somme);
    }
    static void afficherValeurTotale(Ustensile[] us) {
        double somme = 0;
        for (int i = 0; i < us.length; i++) {
        	if(us[i]!=null) {
        		somme+=us[i].valeurtot();
        	}
        }
        System.out.println("Valeur totale de la collection :" + somme);
    }
}