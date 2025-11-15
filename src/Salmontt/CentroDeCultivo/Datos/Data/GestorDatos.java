package Salmontt.CentroDeCultivo.Datos.Data;
import Salmontt.CentroDeCultivo.Datos.Model.CentrosDeCultivos;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GestorDatos {

    public List <CentrosDeCultivos> cargaRegistros (String resourceName){

        List<CentrosDeCultivos> registrosCentros = new ArrayList<>();

        //CARGADOR DEL ARCHIVO
        ClassLoader classLoader = getClass().getClassLoader();

        /**
         *Entre un mensaje si no encuentra el Archivo con InputStream.
         * Tener en consideración que para leer el archivo debe estar marcado como
         * RESOURCES ROOT
         * De no estar como "resources root" es posible que de error y no encuentre el archivo
         */
        try{
            InputStream datoCentros = classLoader.getResourceAsStream(resourceName);


            //SI EL ARCHIVO TXT NO SE ENCUENTRA
            if(datoCentros == null) {System.err.println("No se encontró archivo "+resourceName);
            return registrosCentros;}

        //SE UTILIZA EL BUFFER READER
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(datoCentros));
            String linea;
            int  numeroLinea = 0;

            /**
             * Se asigna el BufferReader (archivo) y verifica la linea del archivo
             * DatosCentrodeCultivo Mientras el dato no sea null leera.
             */
            //while genera un bucle para leer la información en el archivo hasta mostrar toda la información
            while((linea = br.readLine())!=null){
                numeroLinea++;
                if(linea.trim().isEmpty())continue;

            /**
             * SE REALIZA LA SEPARACIÓN POR ;
             * llega al ; realiza un enter y genera una fila la siguiente información
             * de la linea
             */


            String [] fila = linea.split(";");
            if (fila.length!=4){System.err.println("Linea "+numeroLinea+" es Invalida");
            continue;
            }

            /**
             *Segun cada fila entrega el dato correspondientes:
             * nombre del centro de cultivo
             * ubicacion del centro de cultivo
             * producto del centro de cultivo
             * produccion del centro de cultivo

              */

            String nombreCentros = fila[0].trim();
            String ubicacionCentros = fila[1].trim();
            String productosCentros = fila[2].trim();
            String produccionCentros = fila[3].trim();

            try {
                //PASA EL DATO INT DE PRODUCCION A TEXTO PARA PODER LEERLO.
                int produccion = Integer.parseInt(produccionCentros);
                CentrosDeCultivos datoCultivos = new CentrosDeCultivos(nombreCentros, ubicacionCentros,productosCentros, produccion);
                registrosCentros.add(datoCultivos);

            }catch (NumberFormatException ex){
                System.err.println("El dato no es numero en la linea "+numeroLinea);
            }

        } //fin del WHILE

        }catch (Exception ex){
            System.out.println("Ocurrio un error con el archivo");
        }


    } catch (Exception e) {
            System.out.println("Ocurrio un error con el archivo");
        }

        /**
         * Devuelve el registro para la visualizacion del cliente.
         * Ya con la separación del los enter por ;
         */
        return registrosCentros;
    }


}
