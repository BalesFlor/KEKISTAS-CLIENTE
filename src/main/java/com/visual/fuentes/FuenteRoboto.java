package com.visual.fuentes;

import java.awt.Font;
import java.io.InputStream;

public class FuenteRoboto {
    public Font fuente(String fontName, int estilo, float tamanio) {
        Font font = null;
        try {
            //Se carga la fuente
            InputStream is = getClass().getResourceAsStream(fontName);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (Exception ex) {
            //Si estuvo un error se carga por defecto la ARIAL
            System.err.println(fontName + " No se cargó la fuente");
            font = new Font("Arial", Font.PLAIN, 14);
        }
        Font tfont = font.deriveFont(estilo, tamanio);
        return tfont;
    }
}
