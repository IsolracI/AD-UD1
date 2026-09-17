package org.iesteis.repository;

import org.iesteis.domain.Alumno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FlatFileAlumnoRepository implements AlumnoRepository {
    private final Path ruta = Path.of("data/alumnos.txt");

    public Path getRuta() {
        return this.ruta;
    }

    @Override
    public List<Alumno> findAll() throws IOException {
        Stream<String> listaAlumnos = Files.lines(getRuta());
        List<Alumno> alumnos = new ArrayList<>();

        listaAlumnos.forEach(alumno -> alumnos.add(new Alumno(alumno.split(" ")[0], alumno.split(" ")[1])));
        return alumnos;
    }

    @Override
    public void save(Alumno alumno) throws IOException {
        String nombre = alumno.getNombre();
        String dni = alumno.getDni();
        String csq = "\n" + nombre + " " + dni;

        Files.writeString(getRuta(), csq, StandardOpenOption.APPEND);
    }

    @Override
    public Alumno findByDni(String dni) throws IOException {
        Stream<String> listaAlumnos = Files.lines(getRuta());

        String alumnoBuscado = listaAlumnos.filter(alumno -> alumno.split(" ")[1] == dni).toString();

        return new Alumno(alumnoBuscado.split(" ")[0], alumnoBuscado.split(" ")[1]);
    }
}