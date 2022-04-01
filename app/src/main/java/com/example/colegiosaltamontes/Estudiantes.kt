package com.example.colegiosaltamontes

class Estudiantes {

    var nombre: String?=null
    var telefono: String?=null
    var documento: String?=null
    var direccion: String?=null
    var edad: Int?=null


    var materia1: String?=null
    var materia2: String?=null
    var materia3: String?=null
    var materia4: String?=null
    var materia5: String?=null

    var nota1: Double?=null
    var nota2: Double?=null
    var nota3: Double?=null
    var nota4: Double?=null
    var nota5: Double?=null

    var resultado: String?=null
    var recuperacion: Boolean?=null
    var promedio: Double?=null

    set(value){
        if(value != null){
            if(value<=3.5){
                if (value<=2.5){
                    recuperacion=false
                }
                else{
                    recuperacion=true
                }
            }
            field = value
        }
    }


}