package entities;

public class Bill {

    public static char gender;

    public static int beer = 5;

    public static int barbecue = 7;

    public static int softDrink = 3;


    public static double feeding(int quantidadeCerveja, int quantidaderefrigerantes, int quantidadeEspetinhos) {
        return quantidadeCerveja * beer + quantidaderefrigerantes * softDrink + quantidadeEspetinhos * barbecue;

    }

    public static double cover(double consumo) {
        if (consumo > 30.00) {
            return 0.00;
        }else {
            return 4.00;
        }
    }

    public static double ticket() {
        if (gender == 'F') {
            return 8.00;
        } else {
            return 10.00;
        }
    }

    public static double total(double consumo, double cover, double ticket) {
        return consumo + cover + ticket;
    }
}




