
package instrukcjawarunkowaswitch;
/**
 * 
 * @author pawelstradomski
 */

public class InstrukcjaWarunkowaSwitch {

    
    public static void main(String[] args) {
       /*
        Instrukcja warunkowa switch.
        Skladnia: 
        switch - wyszukuje wartosc, funkcje
        break - zatrzymuje funkcje po znalezieniu
        default - wczytuje funkcje gdy nie znajdzie wartosci
        
        Raczej malo uzywana. Tylko do zmiennych calkowitych jak int oraz znakow: char.
        Nie nadaje sie do zmiennoprzecinkowych i znakow string.Nie wiem dlaczego ale trzeba uzyc
        dodatkowo {}
         */
        int w = 300;
        switch (w) 
        {
            case 50:
                System.out.println("Tablica 50");
                break;

            case 100:
                System.out.println("Tablica 100");
                break;

            case 200:
                System.out.println("Tablica 200");
                break;

            default:
                System.out.println("inna wartosc");
        }
    }
    
}
