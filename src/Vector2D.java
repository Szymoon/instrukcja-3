import static java.lang.Math.*; //import statyczny

public class Vector2D {

    public double x, y;  //prywatne zmienne x,y

    //konstruktor domyślny
    public Vector2D(){
        x = 0;
        y = 0;
    }
    //kontruktor z parametrem
    public Vector2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    //akcesor parametru x
    public double getX(){
        return x;
    }
    //akcesor parametru y
    public double getY(){
        return y;
    }
    //suma wektorów
    public Vector2D Suma(Vector2D a){
        Vector2D suma = new Vector2D(x + a.x, y + a.y);
        return suma;
    }
    //różnica wektorów
    public Vector2D Różnica(Vector2D a){
        Vector2D różnica = new Vector2D(x - a.x, y - a.y);
        return różnica;
    }
    //mnożenie przez stałą
    public Vector2D Iloczyn(double a){
        Vector2D iloczyn = new Vector2D(x*a, y*a);
        return iloczyn;
    }
    //długość vektora
    public double Długość(){
        double długość = sqrt(pow(x,2) + pow(y,2));
        return długość;
    }
    //normalizacja wektora
    public Vector2D Normalizacja(){
        Vector2D normalizacja = new Vector2D();

        if(x == 0 && y == 0) {
            System.out.println("Wartości x i y muszą być większe od 0!");
            return normalizacja;
        }else {
            normalizacja.x = x/Długość();
            normalizacja.y = y/Długość();
            return normalizacja;
        }
    }
}
