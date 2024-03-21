package org.example.modelos;

import java.time.LocalDate;

public class Usuario {
    private Integer id;
    private String nombres;
    private String correo;
    private Integer salario;
    private LocalDate fechadeingreso;


    public Usuario() {
    }

    public Usuario(Integer id, String nombres, String correo, Integer salario, LocalDate fechadeingreso) {
        this.id = id;
        this.nombres = nombres;
        this.correo = correo;
        this.salario = salario;
        this.fechadeingreso = fechadeingreso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
  if(id<0){
      System.out.println("Id invalido revise por favor");
  } else {
      this.id=id;
  }
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public LocalDate getFechadeingreso() {
        return fechadeingreso;
    }

    public void setFechadeingreso(LocalDate fechadeingreso) {
        this.fechadeingreso = fechadeingreso;
    }
}
