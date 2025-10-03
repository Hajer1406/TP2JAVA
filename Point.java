package Exercice2tp2;

public class Point {
	private String nom;
	private int abscisse;
	private int ordonnee;
	
	public Point(String nom,int abscisse,int ordonnee) {
		this.nom=nom;
		this.abscisse=abscisse;
		this.ordonnee=ordonnee;
	}
	
	public Point(int abscisse,int ordonnee) {
		this.abscisse=abscisse;
		this.ordonnee=ordonnee;
	}
	
	public Point(String nom) {
		this.nom=nom;
	}
	
	public void affiche() {
		System.out.println(nom+"("+abscisse+", "+ordonnee+")");
	}
	
	public void TranslHoriz(int a) {
		abscisse+=a;
	}
	
	public void TranslVert(int a) {
		ordonnee+=a;
	}
	
	public void Translation(int a,int b) {
		abscisse+=a;
		ordonnee+=b;
	}
	
	public boolean Coincide(Point p) {
		if(abscisse==this.abscisse && ordonnee==this.ordonnee) {
			return true;
		}
		else {
			return false;
		}
}
	
	public String getNom() {
		return nom;
	}
	
	public int getAbscisse() {
		return abscisse;
	}
	
	public int getOrdonnee() {
		return ordonnee;
	}
	
	public void setNom(String ch) {
		this.nom=ch;
	}
	
	public void setAbscisse(int a) {
		this.abscisse=a;
	}
	
	public void setOrdonnee(int a) {
		this.ordonnee=a;
	}
}