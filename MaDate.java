package exercice3tp2;

import java.time.Year;

import java.util.Scanner;

public class MaDate {
	private int jour;
	private int mois;
	private int annee;
	
	public MaDate(int jour,int mois,int annee) {
		this.jour=jour;
		this.mois=mois;
		this.annee=annee;
	}
	
	public MaDate(int annee) {
		this.annee  = (Year.now()).getValue();
		this.jour = 1;
        this.mois = 1;
	}
	
	public int getJour() {
		return jour;
	}
	
	public int getMois() {
		return mois;
	}
	
	public int getAnnee() {
		return annee;
	}
	
	public void setJour(int jour) {
		this.jour=jour;
	}
	
	public void setMois(int mois) {
		this.mois=mois;
	}
	
	public void setAnnee(int annee) {
		this.annee=annee;
	}
	
	public String toString() {
		return(jour+"/"+mois+"/"+annee);
	}
	
	public boolean estBissextile() {
        return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
    }
	
	public void ajouterUnJour() {
		 int nbjour=0;
		 switch (mois) {
		 case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			 nbjour=31;
			 break;
		 case 4: case 6: case 9: case 11:
			 nbjour=30;
			 break;
		 case 2:
			 if(estBissextile()) {
				 nbjour=29;
			 }
			 else {
				 nbjour=28;
			 }
		     break;
		 default:
			 System.out.println("Mois invalide");
			 return;
		    }
	jour++;
	if (jour>nbjour) {
		jour=1;
		ajouterUnMois();
	}
	}
	
	public void ajouterPlusieursJours(int n) {
		for (int i = 0; i < n; i++) {
            ajouterUnJour();
        }
	}
	
	public void ajouterUnMois() {
		mois++;
        if (mois > 12) {
            mois = 1;
            annee++;
        }
	}
	
	public void ajouterUnAn() {
		annee++;
        if (mois == 2 && jour == 29 && !estBissextile()) {
            jour = 28;
        }
	}
	
	
	public static void main(String[] args) {
		MaDate d1=new MaDate(2020);
		MaDate d2=new MaDate(01,12,2023);
		MaDate d3=new MaDate(12,12,2023);
		
		System.out.println("Affichage des trois dates avant modification :");
		
		System.out.println("Date 1: "+d1);
		System.out.println("Date 2: "+d2);
		System.out.println("Date 3: "+d3);
		
		d2.setJour(12);
		d3.setMois(12);
		
		System.out.println("Affichage des trois dates après modification :");
		System.out.println("Date 1: "+d1);
		System.out.println("Date 2: "+d2);
		System.out.println("Date 3: "+d3);
		
		System.out.println("Test d'égalité de deux dates d2 et d3 :");
		if(d2.jour==d3.jour && d2.mois==d3.mois && d2.annee==d3.annee) {
			System.out.println("Les deux dates d2 et d3 sont identiques");
		}
		else {
			System.out.println("Les deux dates d2 et d3 ne sont pas identiques");
		}
		
		System.out.println("Choisissez une opération :");
		System.out.println("Ajouter un jour à d2");
        System.out.println("Ajouter plusieurs jours à d2");
        System.out.println("Ajouter un mois à d2");
        System.out.println("Ajouter une année à d2");
        Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();
        switch (choix) {
        case 1:
            d2.ajouterUnJour();
            break;
        case 2:
            System.out.print("Combien de jours voulez vous ajouter  ?");
            int n = sc.nextInt();
            d2.ajouterPlusieursJours(n);
            break;
        case 3:
            d2.ajouterUnMois();
            break;
        case 4:
            d2.ajouterUnAn();
            break;
        default:
            System.out.println("Choix invalide");
    }
        System.out.println("Date 2 après modification: " +d2);
	}

}
