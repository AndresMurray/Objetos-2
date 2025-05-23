package ar.edu.unlp.objetos.uno.Ejercicio1;

import java.io.PrintWriter;

public class RepeatServer extends SingleThreadTCPServer {
	

    public static void main(String[] args) {
        RepeatServer server = new RepeatServer();
        server.startLoop(args);
    }
    
    
    @Override
    public void handleMessage(String message, PrintWriter out) {
        String[] args = message.split(" ");

        if (!validarCantidadArgs(args, out)) {
            return;
        }

        String str = args[0];
        if (!validarStringNoVacio(str, out)) {
            return;
        }

        Integer count = parsearCantidad(args[1], out);
        if (count == null || count <= 0) {
            out.println("Error: la cantidad debe ser un número entero mayor a 0");
            return;
        }

        String delimiter = obtenerDelimitador(args);
        String result = repetirString(str, count, delimiter);

        out.println(result);
    }

    private boolean validarCantidadArgs(String[] args, PrintWriter out) {
        if (args.length < 2) {
            out.println("Error: se requieren al menos 2 argumentos: string y cantidad");
            return false;
        }
        return true;
    }

    private boolean validarStringNoVacio(String str, PrintWriter out) {
        if (str.isEmpty()) {
            out.println("Error: el string a repetir no puede estar vacío");
            return false;
        }
        return true;
    }

    private Integer parsearCantidad(String arg, PrintWriter out) {
        try {
            return Integer.parseInt(arg);
        } catch (NumberFormatException e) {
            out.println("Error: la cantidad debe ser un número entero válido");
            return null;
        }
    }

    private String obtenerDelimitador(String[] args) {
        if (args.length >= 3) {
            return args[2];
        }
        return " ";
    }

    private String repetirString(String str, int count, String delimiter) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
            if (i < count - 1) {
                sb.append(delimiter);
            }
        }
        return sb.toString();
    }

    

}
