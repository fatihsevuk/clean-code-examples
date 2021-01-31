package com.fsoftdev.defaultvalue;

public class TextMagic {

    private String text;


    // if we have not this method
    // toLowerCase method can occur null pointer
    public TextMagic(String text) {
        this.text = text != null? text : "";
    }

    public String toLowerCase()  {
        return text.toLowerCase();
    }
}
