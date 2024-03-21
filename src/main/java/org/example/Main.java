package org.example;

import org.example.modelos.Usuario;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Creando objeto vacio

        Usuario usuarioNuevoVacio=new Usuario();
        //Asignando un atributo a traves de un set
        usuarioNuevoVacio.setId(-10);

        //creando objeto lleno

        Usuario usuarioNuevoLleno=new Usuario(-5,"Daniel Arango Sanchez","jdas2401@gmail.com",10500000, LocalDate.now());


        //Imprimiendo nombre vacio
        System.out.println("Su ID es:"+usuarioNuevoVacio.getId());

        //Imprimiendo el nombre lleno
        System.out.println("Su ID es:"+usuarioNuevoLleno.getId());
    }
}