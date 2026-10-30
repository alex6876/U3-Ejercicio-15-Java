
public class Enrutador {
    private String identificador;
    private String direccionIP;
    private boolean conectado;

    public Enrutador(String identificador) {
        this.identificador = identificador;
        this.direccionIP = "0.0.0.0";
        this.conectado = false;
    }

    public void setDireccionIP(String nuevaIp) {
        String[] partes = nuevaIp.split("\\.");

        if (partes.length == 4) {
            boolean valida = true;

            for (int i = 0; i < partes.length; i++) {
                try {
                    int numero = Integer.parseInt(partes[i]);

                    if (numero < 0 || numero > 255) {
                        valida = false;
                    }
                } catch (NumberFormatException e) {
                    valida = false;
                }
            }

            if (valida) {
                direccionIP = nuevaIp;
                System.out.println("Dirección IP configurada correctamente.");
            } else {
                System.out.println("Dirección IP inválida.");
            }

        } else {
            System.out.println("Formato de IP incorrecto.");
        }
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void conectar() {
        conectado = true;
    }

    public void desconectar() {
        conectado = false;
    }
}

