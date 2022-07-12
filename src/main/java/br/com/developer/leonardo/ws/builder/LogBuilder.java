package br.com.developer.leonardo.ws.builder;

import br.com.developer.leonardo.ws.log.Log;

import java.util.UUID;

public class LogBuilder {

    public static Log buildLog(){
        return new Log(UUID.randomUUID(), null, null);
    }
}
