package br.com.developer.leonardo.ws.dto;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class PrinterLog {

    private static final Logger log = LoggerFactory.getLogger(PrinterLog.class);

    public static void print(UUID id, String classe, String mensagem) {
        log.info("[{}][{}][{}]", id, classe, mensagem);
    }
}
