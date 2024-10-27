package Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LCE3-ALUMNO 14
 */
public class Stream1 {
    
    public static void main(String[] args) {
        
        //archivos unidades logicas que maneja el sistema operativo
        //system host no se puede desde java, no manipulamos nada todo lo hace el sistema operativo
        
        File f = new File("datos.txt");
        //lectura, escritura y ejecucion:atributos que el sistema operativo controla
        
        if(!f.exists())//se encarga de verificar que el archivo exista
        System.out.println("No existe");
        
        System.out.println(f.getAbsolutePath()); //nos regresa la ruta absoluta (desde c:)
        
        //flujos de salida de un archivo para conectar f con fo
        //false borras lo anterior, true acumula
        //auto-flush se carga un buffer y cuando se llena se manda el archivo y se vacia 
        //espacio de memoria donde se almacenan datos de mandera temporal
        
        try { 
            FileOutputStream fo = new FileOutputStream (f,true);//ese se modifica para eliminar todo
            
            PrintWriter pw = new PrintWriter(fo,true);
            //Procesamiento de datos 
            pw.println("HI WORLD");
            //fin del procesamiento de datos
            //No olvidar cerrar
            pw.close();//siempre escribir para que los datos se almacenen (guardar) consolidar los datos
            
        } catch (FileNotFoundException ex) {
            //salida elegante, puede ir cualquier codigo
            Logger.getLogger(Stream1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
                }
    
}
