package org.iesteis.repository;

import org.iesteis.domain.Alumno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FlatFileAlumnoRepository implements AlumnoRepository {
    @Override
    public List<Alumno> findAll() throws IOException {
        Path ruta = Path.of("data/alumnos.txt");
        Stream<String> listaAlumnos = Files.lines(ruta);
        List<Alumno> alumnos = new ArrayList<>();


        listaAlumnos.forEach(alumno -> alumnos.add(new Alumno(alumno.split(" ")[0], alumno.split(" ")[1])));
        return alumnos;
    }

    @Override
    public void save(Alumno alumno) throws IOException {
        Path ruta = Path.of("data/alumnos.txt");

        System.out.println("Escriba un nombre:\n");
        BufferedReader nombre = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe un DNI:\n");
        BufferedReader dni = new BufferedReader(new InputStreamReader(System.in));
        String = nombre.readLine().strip();
        Files.writeString(ruta, )
    }
}