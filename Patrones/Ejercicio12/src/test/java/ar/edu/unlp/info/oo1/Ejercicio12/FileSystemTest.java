package ar.edu.unlp.info.oo1.Ejercicio12;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileSystemTest {

    private Directorio raiz;
    private Directorio dirA;
    private Directorio dirB;
    private Archivo archivo1;
    private Archivo archivo2;
    private Archivo archivo3;

    @BeforeEach
    public void setUp() {
        // Archivos
        archivo1 = new Archivo("archivo1.txt", LocalDate.of(2023, 1, 1), 100);
        archivo2 = new Archivo("archivo2.txt", LocalDate.of(2024, 1, 1), 200);
        archivo3 = new Archivo("archivo1.txt", LocalDate.of(2025, 1, 1), 50); // mismo nombre que archivo1

        // Subdirectorios
        dirB = new Directorio("dirB", LocalDate.of(2022, 1, 1), List.of(archivo2));
        dirA = new Directorio("dirA", LocalDate.of(2021, 1, 1), List.of(archivo1, dirB));

        // Directorio raíz
        raiz = new Directorio("root", LocalDate.of(2020, 1, 1), List.of(dirA, archivo3));
    }

    @Test
    public void testTamanoTotalOcupado() {
        // archivo1: 100, archivo2: 200, archivo3: 50
        // 3 archivos + 3 directorios (32 bytes cada uno)
        int esperado = 100 + 200 + 50 + (3 * 32);
        assertEquals(esperado, raiz.tamanoTotalOcupado());
    }

    @Test
    public void testArchivoMasGrande() {
        Archivo esperado = archivo2;
        assertEquals(esperado, raiz.archivoMasGrande());
    }

    @Test
    public void testArchivoMasNuevo() {
        Archivo esperado = archivo3;
        assertEquals(esperado, raiz.archivoMasNuevo());
    }

    @Test
    public void testBuscarExistente() {
        FileSystem encontrado = raiz.buscar("dirB");
        assertEquals(dirB, encontrado);
    }

    @Test
    public void testBuscarInexistente() {
        FileSystem encontrado = raiz.buscar("noExiste");
        assertNull(encontrado);
    }

    @Test
    public void testBuscarTodos() {
        List<FileSystem> encontrados = raiz.buscarTodos("archivo1.txt");
        assertEquals(2, encontrados.size());
        assertTrue(encontrados.contains(archivo1));
        assertTrue(encontrados.contains(archivo3));
    }

    @Test
    public void testListadoDeContenido() {
        String resultado = raiz.listadoDeContenido();
        String esperado = String.join("\n",
            "/root",
            "/root/dirA",
            "/root/dirA/archivo1.txt",
            "/root/dirA/dirB",
            "/root/dirA/dirB/archivo2.txt",
            "/root/archivo1.txt"
        ) + "\n";

        assertEquals(esperado, resultado);
    }
}


