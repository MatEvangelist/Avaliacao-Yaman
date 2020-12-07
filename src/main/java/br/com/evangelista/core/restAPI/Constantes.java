package br.com.evangelista.core.restAPI;


import io.restassured.http.ContentType;

import static io.restassured.http.ContentType.JSON;

public interface Constantes {

    String APP_BASE_URL = "http://barrigarest.wcaquino.me/";
    Integer APP_PORT = 80;
    String APP_BASE_PATH = "";
    ContentType APP_CONTENT_TYPE = JSON;
    Long MAX_TIMEOUT = 10000L;

}
