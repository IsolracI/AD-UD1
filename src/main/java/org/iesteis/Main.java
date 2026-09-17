package org.iesteis;

import org.iesteis.domain.Alumno;
import org.iesteis.repository.FlatFileAlumnoRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    static void main() {
//        Path ruta = Path.of("data/alumnos.txt");
//
//        try {
//            String alumnos = Files.readString(ruta);
//            System.out.println(alumnos);
//
//            Stream<String> listaAlumnos = Files.lines(ruta);
//            listaAlumnos.forEach(alumno -> System.out.println("Nombre/DNI:\n" + alumno + "\n"));
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            List<String> listaAlumnos = Files.readAllLines(ruta);
//            List<Alumno> alumnos = new ArrayList<>();
//
//            for (String s : listaAlumnos) {
//                String nombre = s.split(" ")[0];
//                String dni = s.split(" ")[1];
//                alumnos.add(new Alumno(nombre, dni));
//            }
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (Stream<String> listaAlumnos = Files.lines(ruta)) {
//            List<Alumno> alumnos = new ArrayList<>();
//            listaAlumnos.forEach(alumno -> alumnos.add(new Alumno(alumno.split(" ")[0], alumno.split(" ")[1])));
//            alumnos.forEach(System.out::println);
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
        FlatFileAlumnoRepository repository = new FlatFileAlumnoRepository();
        try {
            repository.findAll().forEach(System.out::println);

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}