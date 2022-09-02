public class Main {
    public static void main(String[] args) { //Main

        /* Primera Parte */
        int resultado;// Variable que guarda el resultado de la suma
        resultado = suma(10,20,30); // Llamo a la funcion y le asigna valores
        System.out.println("Primera Parte");
        System.out.println("El resultado de la suma es: " + resultado); // Muestro el resultado de la suma

        /* Segunda Parte */
        Coche miCoche = new Coche(); //Objeto
        miCoche.AumentarPuerta(); // Aumento una puerta
        System.out.println("Segunda Parte");
        System.out.println("Numero de puertas: " + miCoche.puertas); // Muestro el total de puertas
    }
    public static int suma(int a,int b,int c){ //Funcion
        return a+b+c;
    }
}
class Coche{ //Clase
    public int puertas=0; //Variable que almacena el numero de puertas
    public void AumentarPuerta(){ //Funcion
        this.puertas++; //Incrementa el numero de puertas
    }

}