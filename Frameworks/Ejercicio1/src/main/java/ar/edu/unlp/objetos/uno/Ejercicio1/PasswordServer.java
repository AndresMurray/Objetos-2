package ar.edu.unlp.objetos.uno.Ejercicio1;

import java.io.PrintWriter;

import java.util.Random;

public class PasswordServer extends SingleThreadTCPServer {

    private final Random random = new Random();

    @Override
    public void handleMessage(String message, PrintWriter out) {
        String[] args = message.split(" ");
        if (!validarArgs(args, out)) {
            return;
        }

        String letras = args[0];
        String numeros = args[1];
        String especiales = args[2];

        String password = generarPassword(letras, numeros, especiales);
        out.println(password);
    }

    private boolean validarArgs(String[] args, PrintWriter out) {
        if (args.length != 3) {
            out.println("Error: se requieren 3 argumentos: letras, números, especiales");
            return false;
        }
        for (int i = 0; i < args.length; i++) {
            if (args[i].isEmpty()) {
                out.println("Error: los argumentos no pueden estar vacíos");
                return false;
            }
        }
        return true;
    }

    private String generarPassword(String letras, String numeros, String especiales) {
        final int LENGTH = 8;
        char[] password = new char[LENGTH];

        int posEspecial = posicionAleatoria(LENGTH);
        password[posEspecial] = caracterAleatorio(especiales);

        int posNumero;
        do {
            posNumero = posicionAleatoria(LENGTH);
        } while (posNumero == posEspecial);
        password[posNumero] = caracterAleatorio(numeros);

        for (int i = 0; i < LENGTH; i++) {
            if (i != posEspecial && i != posNumero) {
                password[i] = caracterAleatorio(letras);
            }
        }

        return new String(password);
    }

    private int posicionAleatoria(int max) {
        return random.nextInt(max);
    }

    private char caracterAleatorio(String chars) {
        return chars.charAt(random.nextInt(chars.length()));
    }


    public static void main(String[] args) {
        PasswordServer server = new PasswordServer();
        server.startLoop(args);
    }
}
