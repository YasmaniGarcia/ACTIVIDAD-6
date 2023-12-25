/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte_3_phishing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Parte_3_Phishing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Definir la lista de palabras clave y sus respectivos puntajes
        String[] keywords = {
                "banco", "contraseña", "tarjeta de crédito", "seguro social", "subasta",
                "red social", "pago en línea", "Usuario", "Acceso", "Verificación", "Actualización",
                "Seguridad", "Confirmación", "Suspensión", "Verificar", "Restablecer", "Caducidad", 
                "Premio web", "Premio red social", "Gana dinero rápido", "Oferta especial", 
                "Oportunidad única", "Problema de seguridad", "Inicio de sesión", "Actividad sospechosa",
                "Ganador del sorteo", "Descuento exclusivo", "Premio de lotería", "Actualización de seguridad",
                "Información importante"        
                // Agrega aquí más palabras clave según tus investigaciones
        };
        int[] scores = {1, 1, 1, 1, 1, 1, 1, 2, 3, 2, 3, 3, 3, 2, 2, 1, 1, 3, 2, 1, 2, 2, 3, 3, 2, 1, 2, 3, 1, 2};

        // Leer el archivo de texto
        String filePath = "C:\\Users\\Clarens\\Desktop\\Clarenss\\Tareas 2023\\Java_Actividad_6_Phishing/archivo.txt"; // Reemplaza con la ruta real de tu archivo
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            
        } catch (IOException e) {
            e.printStackTrace();
    }
    
    }
}
