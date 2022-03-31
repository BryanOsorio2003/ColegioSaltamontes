package com.example.colegiosaltamontes

class Operaciones {
    var listaEstudiantes = ArrayList<Estudiantes>()
    fun registrar(estudiantes: Estudiantes){
        listaEstudiantes.add(estudiantes)
    }
    fun getList(): ArrayList<Estudiantes>{
        return listaEstudiantes
    }
}