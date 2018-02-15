package maquina.cafe;

import java.util.Timer;
import java.util.TimerTask;

public class Tiempo {

//    private Timer timer = new Timer();
//    private int segundos = 0;
//
//    //Clase interna que funciona como contador
//    class Contador extends TimerTask {
//
//        public void run() {
//            segundos++;
//            System.out.println("segundo: " + segundos);
//        }
//    }
//
//    //Crea un timer, inicia segundos a 0 y comienza a contar
//    public void Contar() {
//        this.segundos = 0;
//        timer = new Timer();
//        timer.schedule(new Contador(), 0, 10000000);
//    }
//
//    //Detiene el contador
//    public void Detener() {
//        timer.cancel();
//    }
//
//    //Metodo que retorna los segundos transcurridos
//    public int getSegundos() {
//        return this.segundos;
//    }
    
    public void Contar(){
        Long suma=0L;
        
        for (Long i=0L;i<=100000000000000L;i++){
             suma+=+i;
        }
    }
    
}
