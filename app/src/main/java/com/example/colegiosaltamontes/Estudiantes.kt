package com.example.colegiosaltamontes

class Estudiantes {

    var documento: String?=null
    var nombre: String?=null
    var edad: Int?=null
    var telefono: String?=null
    var direccion: String?=null

    var campoMateria1: String?=null
    var campoMateria2: String?=null
    var campoMateria3: String?=null
    var campoMateria4: String?=null
    var campoMateria5: String?=null

    var campoNota1: Double?=null
    var campoNota2: Double?=null
    var campoNota3: Double?=null
    var campoNota4: Double?=null
    var campoNota5: Double?=null

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
        }
    }


}