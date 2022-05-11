import javax.xml.stream.events.StartDocument;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
Semaforo sem_uomini = new Semaforo(1);
Semaforo sem_donne = new Semaforo(1);

Bagno bagnouomini = new Bagno("M", sem_uomini);
Bagno bagnodonne = new Bagno("F", sem_donne);
        Persona p1 = new Persona("ciccio", bagnouomini);
        Persona p2 = new Persona("carllo", bagnouomini);
        Persona p3 = new Persona("bello", bagnouomini);

        Persona p4 = new Persona("angela", bagnodonne);
        Persona p5 = new Persona("franca", bagnodonne);
        Persona p6 = new Persona("bruna", bagnodonne);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();

        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();
        System.out.println("tutti sono usciti dal bagno");
    }
}
