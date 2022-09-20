import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        //Variables
        String nombre = "";
        float[] calificaciones = new float[5];
        //Introducir el nombre y las calificaciones
        System.out.print("Introdusca el nombre: ");
        nombre = entrada.readLine();
        //For para no sobresaturar con codigo, total sirve para no sobresaturar con codigo
        for (int i = 0; i < 5; i++) {
            System.out.print("Introdusca el nombre de la calificacion "+(i+1)+": ");
            calificaciones[i] = Float.parseFloat(entrada.readLine());
        }
        //Mostrar las calificaciones
        System.out.println("Nombre del alumno "+nombre);
        for (int i = 0; i < 5; i++){
            System.out.println("Calificacion "+(i+1)+": "+calificaciones[i]);
        }
        System.out.println("Promedio: "+(calcularPromedio(calificaciones)));
        //Metodo para obtener la calificacion
        System.out.println("Calificacion: "+calcularCalificacion(calificaciones));
    }
    //Calcular las calificaciones
    private static float calcularPromedio(float[] calificaciones){
        float promedio = 0;
        for (int i = 0; i < 5; i++){
            promedio += calificaciones[i];
        }
        promedio /= 5;
        return promedio;
    }
    //Calcular la calificacion en grado
    private static String calcularCalificacion(float[] calificaciones){
        //Usar el metodo para poder usar el promedio
        float calificacionesTotales = calcularPromedio(calificaciones);
        String resultado = "A";
        //Para consultar el resultado
        if (calificacionesTotales > 90){
            resultado = "A";
        } else if (calificacionesTotales > 80){
            resultado = "B";
        } else if (calificacionesTotales > 70){
            resultado = "C";
        } else if (calificacionesTotales > 60){
            resultado = "D";
        } else if (calificacionesTotales > 50){
            resultado = "E";
        }else{
            resultado = "F";
        }
        return resultado;
    }
}
