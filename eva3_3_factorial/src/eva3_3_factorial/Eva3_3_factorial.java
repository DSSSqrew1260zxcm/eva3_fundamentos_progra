package eva3_3_factorial;

public class Eva3_3_factorial {

    public static void main(String[] args) {
        //llamada de la función
        System.out.println("El valor del número 5 factorial es: " + calcularFactorial(5));
        System.out.println("2 elevado a la 8 = " +calcularPotencia(2,8));
    }
    public static int calcularFactorial(int n){
        /*
        factorial de 5: 1 x 2 x 3 x 4 x 5 = 120
        usar ciclos
        regresar el valor calculado
        */
        int r =1;
        for (int i = 1; i <= n; i++) {
            r *= i; // r = r * i;
        }return r;
    }
    //crear una función que calcule la potencia de un número entero
    public static int calcularPotencia(int base, int expo){
        int resu = 1;
        for (int i = 1; i < expo; i++) {
            resu *= base; // resu = base * resu;
        }return resu;
    }
}
