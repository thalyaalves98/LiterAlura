package com.projeto.literalura.service;

public interface ConvertDataInterface {
    <T> T toGetData(String json, Class<T> myClass);
}
