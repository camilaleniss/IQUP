
package Proyecto;
import javax.swing.JProgressBar;
public class Cargar extends Thread {
    JProgressBar progreso;
    public Cargar(JProgressBar progreso){
        super();
        this.progreso=progreso;
    } 
    public void run(){
        for(int a=1;a<=100;a++){
            progreso.setValue(a);
            pausa(25);
        }
    }
    public void pausa(int mlseg){
        try{
            Thread.sleep(mlseg);
        } catch (Exception e){
            
        }
    }
    
}
