package Salmontt.CentroDeCultivo.Datos.UI;

import Salmontt.CentroDeCultivo.Datos.Data.GestorDatos;
import Salmontt.CentroDeCultivo.Datos.Model.CentrosDeCultivos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //CREA UN OBJETO DESDE EL GESTOR DE DATOS
        GestorDatos gestorDatos = new GestorDatos();

        //GENERA UNA LISTA PARA LLAMAR AL ARCHIVO CARGADO DESDE EL FOREACH
        List<CentrosDeCultivos> listaCentros = gestorDatos.cargaRegistros("DatosCentrodeCultivo");

/**
 * El for recorre la coleccion "listacentros" que contiene información de la clase centrodecultivos
 * Imprime la información ingresada en el archivo txt al usuario.
 * Segun Nombre de centro, Ubicacion del centro, producto a cultivar, produccion total por cada centro.
 *Utilizando el toString de Centro de cultivos.
 */
        System.out.println(".::CENTROS DE CULTIVO SALMONTT::.\n");
        for (CentrosDeCultivos datosCentros : listaCentros ) {
            System.out.println(datosCentros);
        }
    }
}


