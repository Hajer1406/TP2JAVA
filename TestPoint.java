//TP 2: Exercice 1
package AtelierPOO;

class Point {
    private char id;
    private double abs;

    public Point(char c, double x) {
        id = c;
        abs = x;
    }

    public void affiche() {
        System.out.println("Point identifié par " + id + " d'abscisse " + abs);
    }

    public void translate(double dx) {
        abs += dx;
    }
}

public class TestPoint {
    public static void main(String args[]) {
        Point a = new Point('A', 2.5);
        a.affiche();
        Point b = new Point('B', 5.25);
        b.affiche();
        b.translate(2.25);
        b.affiche();
    }
}

// 3)Ce programme permet d'afficher les points et leurs abscisses et faire une translation de l'abscisse du 2 ème point .
// 4) Les attributs : id et abs les méthodes : affiche() et translate() .
