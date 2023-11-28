package eva3_6_paso_por_valor;

public class Eva3_6_paso_por_valor {

    public static void main(String[] args) {
        int x = 10;
        System.out.println("El valor de x en el main es de: " +x);
        sumaValor(x);
        System.out.println("El valor de x después de llamar a sumaValor es de: " +x);
    }
    public static void sumaValor(int va){
        System.out.println("El valor recibido en sumaValor es de: " +va);
        va++;
        System.out.println("El valor modificado es de: " +va);
    }
}
