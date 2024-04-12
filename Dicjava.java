/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dicjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Sala de Sistemas
 */
public class Dicjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Dictionary<String, Object> perro = new Hashtable<>();
        
        perro.put("name", "scooby");
        perro.put("color", "negro");
        perro.put("raza", "pitbull");
        perro.put("patas", 4);
        perro.put("edad", 34);
        
        System.out.println("El objeto diccionario perro con Hashtable es: " + perro);
        
        Map<String, Object> estudiantes = new HashMap<>();
       
        estudiantes.put("nombre", "jhordy");
        estudiantes.put("apellido", "blanco");
        estudiantes.put("sexo", "hombre");
        estudiantes.put("edad", 19);
        estudiantes.put("estado civil", "soltero");
        List<String> habilidades = new ArrayList<>();
        habilidades.add("java");
        habilidades.add("pyton");
        habilidades.add("c++");
        estudiantes.put("habilidades", habilidades);
        estudiantes.put("pais", "colombia");
        estudiantes.put("ciudad", "cartagena");
        estudiantes.put("direccion", "pozon");
        
        System.out.println("El objeto diccionario estudiantes con HashMap es: " + estudiantes);
        
        // Obteniendo valores del diccionario
        List<String> hab = (List<String>) estudiantes.get("habilidades");
        System.out.println("Obteniendo valor del key habilidades: " + hab);
        
        // modificando habilidades
        hab.add("my sql");
        hab.add("html");
        System.out.println("Habilidades después de la modificación: " + hab);
        
        //  diccionario como una lista
        Set<String> keys = estudiantes.keySet();
        System.out.println("Las claves del diccionario estudiantes son: " + keys);
        
        // valores del diccionario como una lista
        Collection<Object> values = estudiantes.values();
        System.out.println("Los valores del diccionario estudiantes son: " + values);
        
        // diccionario a una lista de tuplas
        Set<Map.Entry<String, Object>> entries = estudiantes.entrySet();
        System.out.println("El diccionario estudiantes como lista de tuplas: " + entries);
        
        // Eliminar las habilidades 
        estudiantes.remove("habilidades");
        System.out.println("Diccionario estudiantes después de eliminar habilidades: " + estudiantes);
        
        // Borrar el diccionario
        estudiantes.clear();
        System.out.println("Diccionario estudiantes después de borrarlo: " + estudiantes);
    }
}
    
    

