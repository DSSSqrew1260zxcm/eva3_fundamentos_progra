package eva3_2_funciones_2;

public class Eva3_2_funciones_2 {
    
    //int x = 100;
    
    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
        Eva3_2_funciones_2 objeto = new Eva3_2_funciones_2();
        System.out.println(objeto.x);
        */
        int n1 = 100, n2 = 200; 
        //Se usa el valor directamente de la función
        System.out.println(buscarMax(n1,n2));
        //Guardamos el valor devuelto para su uso posterior
        int valor = buscarMax(n1,n2);
        System.out.println(valor);
        //Se ejecuta la función pero ignoramos el resultado
        buscarMax(n1,n2);
    }
    public static int buscarMax(int va1, int va2){
        int res;
        /*
        if(va1 > va2){
            res = va1;
        }else{
            res = va2;
        }return res;
        */
        if(va1 > va2){
            return va1;
        }else{
            return va2;
        }
    }
    
}
