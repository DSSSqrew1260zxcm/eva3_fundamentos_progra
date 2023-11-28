package eva3_7_paso_referencia;

public class Eva3_7_paso_referencia {

    public static void main(String[] args) {
        int [] arreglo = new int[10];
        System.out.println("El valor del arreglo en el MAIN es de: " + arreglo);
        llenarArreglos(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" +arreglo[i] + "]");
        }
        System.out.println("");
    }
    public static void llenarArreglos(int [] val){
        System.out.println("El valor del arreglo en llenarArreglos es de: " + val);
        for (int i = 0; i < val.length; i++) {
            val[i] = (int)(Math.random() * 100);
        }
    }
}
