public class Semaforo {
    int valoree;
    public Semaforo(int valore){
        this.valoree = valore;
    }

    synchronized public void P (){
        while(valoree ==0){
            try{
                wait();
            }catch(InterruptedException e){}
        }
        valoree--;
    }
    synchronized public void V (){
        valoree ++;
        notify();
    }
}
