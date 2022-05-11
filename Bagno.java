public class Bagno{

    String targhetta;
    public Semaforo semaforo;
    public Bagno(String t, Semaforo s){
    targhetta = t;
        semaforo = s;
    }

    public void usaBagno(String nome){
        System.out.println(targhetta + ": "+ nome + " è entrato in bagno");
        try{
            Thread.sleep((long)(Math.random()*1000));

        }catch(Exception e){}
        System.out.println(targhetta + ": "+nome + " è uscito dal bagno");
    }
}
