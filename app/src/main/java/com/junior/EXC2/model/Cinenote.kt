package com.junior.EXC2.model

import android.graphics.Color
import com.google.gson.annotations.SerializedName

data class Cinenote(
    val id: String,
    val nombre: String,

    val value : String,
    val labels: List<String>,

    val color: String,
    @SerializedName("created_on")
    val createdOn: String,
    val url: String

){
    fun getColor(): Int = Color.parseColor(color)
}
fun getData(): List<Cinenote>{
    return listOf(
        Cinenote("1281", "hola", "Esta nota contiene muestra primera nota", listOf("Scientific", "Space"), "#565D7E", "13/07/23", "https://pokeapi.co/api/v2/pokemon/1/"),
        Cinenote("1291", "hola","Esta nota contiene muestra primera nota", listOf("Scientific", "Space"), "#565D7E", "13/07/23", "https://pokeapi.co/api/v2/pokemon/1/"),
        Cinenote("1281", "hola", "Esta nota contiene muestra primera nota", listOf("Scientific", "Space"), "#565D7E", "13/07/23", "https://pokeapi.co/api/v2/pokemon/1/"),
        Cinenote("1281", "hola","Esta nota contiene muestra primera nota", listOf("Scientific", "Space"), "#565D7E", "13/07/23", "https://pokeapi.co/api/v2/pokemon/1/"),
        Cinenote("1281", "hola","Esta nota contiene muestra primera nota", listOf("Scientific", "Space"), "#565D7E", "13/07/23", "https://pokeapi.co/api/v2/pokemon/1/"),
        Cinenote("1232", "hola","Esta nota contiene muestra primera nota", listOf("Scientific", "Space"), "#565D7E", "13/07/23", "https://pokeapi.co/api/v2/pokemon/1/"),
        Cinenote("1321", "hola","Esta nota contiene muestra primera nota", listOf("Scientific", "Space"), "#565D7E", "13/07/23", "https://pokeapi.co/api/v2/pokemon/1/")
    )

}