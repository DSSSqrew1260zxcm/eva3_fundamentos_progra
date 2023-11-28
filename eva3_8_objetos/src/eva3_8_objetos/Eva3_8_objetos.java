package eva3_8_objetos;

public class Eva3_8_objetos {
    
    public static void main(String[] args) {
        Persona per1 = new Persona ();
        /*
        Scanner input=new Scanner (System.in);
        int [] arreglo = new int [1];
        */
        System.out.println(per1);
        per1.nombre = "Dayana";
        per1.apellido = "Saldivar";
        per1.edad = 18;
        System.out.println(per1);
        imprimirPersonas(per1);
        
        Persona per2 = new Persona ();
        System.out.println(per2);
        per2.nombre = "Yamileth";
        per2.apellido = "Martinez";
        per2.edad = 18;
        System.out.println(per2);
        imprimirPersonas(per2);
    }
    public static void imprimirPersonas(Persona per){
        System.out.println("Dirección: " + per);
        System.out.println("Nombre completo: " + per.nombre + " " + per.apellido);
        System.out.println("Edad: " + per.edad);
    }
}
/*
Las clases:
- Son plantillas 
- Son tipos de datos
*/
class Persona{
    String nombre;
    String apellido;
    int edad;
    
}