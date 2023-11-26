package eva3_4_funcion_arreglos;

public class Eva3_4_funcion_arreglos {

    public static void main(String[] args) {
        int [] arreglo = crearArreglo(10,1000);
        for (int valor : arreglo) {
            System.out.println("[" +valor+ "]");
        }
    }
    public static int [] crearArreglo(int tama, int rango){
        int [] arreglo = new int[tama];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * rango); 
        }return arreglo;
    }
    
}
