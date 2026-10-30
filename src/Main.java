
public class Main {
    public static void main(String[] args) {

        Enrutador router = new Enrutador("ROUTER-001");

        System.out.println("--- Configuración de IP ---");

        router.setDireccionIP("192.168.1.1");
        router.setDireccionIP("10.0.0.1");

        // Direcciones incorrectas
        router.setDireccionIP("192.168.1.300");
        router.setDireccionIP("192.168.1");
        router.setDireccionIP("hola.mundo");

        System.out.println("\n--- Estado del enrutador ---");

        router.conectar();

        System.out.println("Identificador: "
                + router.getIdentificador());

        System.out.println("Dirección IP: "
                + router.getDireccionIP());

        System.out.println("¿Está conectado? "
                + router.isConectado());
    }
}
