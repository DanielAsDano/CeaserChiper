package caesar_chiper;

import java.util.Arrays;

public class Chiper {
    final private char[] abecederio = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public String cifrar(String palabra){
        char[] palabraArreglo = palabra.toLowerCase().toCharArray();

        //recorrer palabra
        for (int i = 0; i<palabraArreglo.length; i++){
            //recorrer abecedario
            for (int a = 0; a < abecederio.length; a++){
                if (abecederio[a] == palabraArreglo[i]){
                    palabraArreglo[i]  = abecederio[(a + 3) % abecederio.length];
                    break;
                }
            }
        }
        return new String(palabraArreglo);
    }


}
