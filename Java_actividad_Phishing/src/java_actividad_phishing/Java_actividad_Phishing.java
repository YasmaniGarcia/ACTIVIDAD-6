/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_actividad_phishing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Clarens
 */
public class Java_actividad_Phishing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          String[] lista = {
                "integridad del sistema", "autenticación biométrica", "Premio", "protección de datos", "Ganador",
                "innovación", "Cuenta bloqueada", "Caducidad de cuenta", "ganancia potencial", "Actualizar informacion",
                "ciberseguridad", "Contraseña", "Verificacion de cuenta", "confidencialidad", "tecnología de punta", 
                "privacidad", "Suspension de cuenta", "Promocion especial", "Actualice informacion", 
                "bloqueo de cuenta", "transacción", "notificación importante", "inicio de sesión seguro", "solución de seguridad",
                "Recuperar acceso", "interacción", "Confirma identidad", "Promocion increible", 
                "Actualizar ahora", "Cierra de cuenta"        
               
        };
          
        
        int[] arreglo = {1, 3, 2, 2, 3, 1, 1, 3, 3, 3, 2, 1, 1, 2, 2, 3, 2, 1, 2, 2, 1, 3, 3, 3, 2, 1, 1, 2, 1, 2};


        
        String filePath = "C:\\Users\\Clarens\\Desktop\\Clarenss\\Tareas 2023\\Unidad 2 POO  Tareas/archivo_texto.txt"; 
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int total = 0;

            
            while ((line = br.readLine()) != null) {
                for (int i = 0; i < lista.length; i++) {
                    int occurrences = ocurrencias_conteo(line, lista[i]);
                    if (occurrences > 0) {
                        int score = occurrences * arreglo[i];
                        System.out.printf("(Palabras Claves): %s, (Ocurrencias): %d, (Puntuacion): %d%n",
                                lista[i], occurrences, score);
                        total += score;
                    }
                }
            }

            System.out.println("Resultado Total: " + total);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  
    private static int ocurrencias_conteo(String line, String lista) {
        int count = 0;
        int index = line.indexOf(lista);
        while (index != -1) {
            count++;
            index = line.indexOf(lista, index + lista.length());
        }
        return count;
    }
}
    
