package br.com.developer.leonardo.ws.log;

import java.util.UUID;

public record Log(UUID uuid, String classe, String mensagem) {

}
