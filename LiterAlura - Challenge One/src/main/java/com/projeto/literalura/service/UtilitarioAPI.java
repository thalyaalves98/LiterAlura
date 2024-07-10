package com.projeto.literalura.service;

public class UtilitarioAPI { private UsoAPI usoAPI = new UsoAPI();
    private ConvertData convertData = new ConvertData();

    public UsoAPI getUsoAPI() {
        return usoAPI;
    }

    public void setUsoAPI(UsoAPI UsoAPI) {
        this.usoAPI = UsoAPI;
    }

    public ConvertData getConvertData() {
        return convertData;
    }

    public void setConvertData(ConvertData convertData) {
        this.convertData = convertData;
    }

    public static String getADDRESS() {
        return "https://gutendex.com/books?search=";
    }
}
