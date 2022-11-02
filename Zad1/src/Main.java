import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Wypisz();
        System.out.println(getName()+ " "+getWiek());Obliczenia();
        System.out.println(Parzysta(10));
        System.out.println(Podzielna(13));
        System.out.println(TrzeciaPotega(2));
        System.out.println(Pierwiastek(25));
        System.out.println(Trojkat());
    }

    public static void Wypisz(){
        //int a = -2, b = 23;
        //Scanner input = new Scanner(System.in);
        //System.out.println("Podaj c: ");
        //int c = getInt();
        //System.out.println("a  = " + a + ", b = " + b+", c = "+c);
    }
    public static int getInt (){
        return new Scanner(System.in).nextInt();

}
    public static String getName(){
        return "Artur";

}
    public static int getWiek(){
        return 22;
}
    public static void Obliczenia(){
   System.out.println("Podaj dwie liczby:");
   int a= getInt();
   int b= getInt();
   System.out.println("Suma = "+a+" + "+b+" = "+(a+b));
   System.out.println("Roznica = "+a+" - "+b+" = "+(a-b));
   System.out.println("Iloczyn = "+a+" * "+b+" = "+(a*b));
}
    public static boolean Parzysta(int a){
        if(a%2==0) return true;
        return false;
}
    public static boolean Podzielna(int a){
        if ((a%3==0)&&(a%5==0)) return true;
        return false;
}
    public static int TrzeciaPotega(int a){
        return a*a*a;
}
    public static double Pierwiastek(int a){
        return Math.sqrt(a);
}
    public static boolean Trojkat(){
        System.out.println("Podaj dwie liczby:");
        int x = getInt();
        int y = getInt();
    Random r = new Random();
    int a = r.nextInt(y-x+1)+x;
    int b = r.nextInt(y-x+1)+x;
    int c = r.nextInt(y-x+1)+x;
   System.out.println("a = " +a+ " b = "+b+ " c = " +c);
    if(a+b>c && a+c>b && b+c>a) return true;
    else return false;
}
}