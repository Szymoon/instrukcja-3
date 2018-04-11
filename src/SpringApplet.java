import javax.swing.JApplet;

public class SpringApplet extends JApplet {

    public void init(){
        Vector2D AB = new Vector2D(5, 7);   //tworzenie wektora
        Vector2D CD = new Vector2D(-11, 6); //tworzenie wektora
        double stała = 2;

        Vector2D wektor1 = AB.Suma(CD);       //suma
        Vector2D wektor2 = AB.Różnica(CD);    //różnica
        Vector2D wektor3 = AB.Iloczyn(stała); //iloczyn
        Vector2D wektor4 = CD.Iloczyn(stała); //iloczyn
        Vector2D wektor5 = AB.Normalizacja(); //normalizacja
        Vector2D wektor6 = CD.Normalizacja(); //normalizacja

        double dlugoscAB = AB.Długość();
        double dlugoscCD = CD.Długość();
        double dlugosc1 = wektor1.Długość();
        double dlugosc2 = wektor2.Długość();
        double dlugosc3 = wektor3.Długość();
        double dlugosc4 = wektor4.Długość();
        double dlugosc5 = wektor5.Długość();
        double dlugosc6 = wektor5.Długość();

        System.out.println("\nWektor AB: \nX= " + AB.getX() + "\nY= " + AB.getY() + "\nDługość= " + dlugoscAB);
        System.out.println("\nWektor CD: \nX= " + CD.getX() + "\nY= " + CD.getY() + "\nDługość= " + dlugoscCD);
        System.out.println("\nWynik sumy AB i CD: \nX= " + wektor1.getX() + "\nY= " + wektor1.getY()+ "\nDlugość= " + dlugosc1);
        System.out.println("\nWynik różnicy AB i CD: \nX= " + wektor2.getX() + "\nY= " + wektor2.getY() + "\nDlugość= " + dlugosc2);
        System.out.println("\nWynik iloczynu AB przez stałą " + stała +":"+ "\nX= " + wektor3.getX() + "\nY= " + wektor3.getY() + "\nDlugość= " + dlugosc3);
        System.out.println("\nWynik iloczynu CD przez stałą " + stała +":"+ "\nX= " + wektor4.getX() + "\nY= " + wektor4.getY() + "\nDlugość= " + dlugosc4);
        System.out.println("\nWynik normalizacji wektora AB: \nX= "+ wektor5.getX() + "\nY= " + wektor5.getY() + "\nDlugość= " + dlugosc5);
        System.out.println("\nWynik normalizacji wektora CD: \nX= "+ wektor6.getX() + "\nY= " + wektor6.getY() + "\nDlugość= " + dlugosc6);

    } //przeciążenie metody init

    public void paint(){
    } //przeciążenie metody paint

}