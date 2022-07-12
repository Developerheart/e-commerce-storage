package br.com.developer.leonardo.ws.controller;


import br.com.developer.leonardo.ws.builder.LogBuilder;
import br.com.developer.leonardo.ws.dto.PrinterLog;
import br.com.developer.leonardo.ws.dto.ProdutoConsultaDTO;
import br.com.developer.leonardo.ws.log.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import static br.com.developer.leonardo.ws.dto.PrinterLog.print;

@RequestMapping(value = "v1/estoque")
@RestController
public class EstoqueController {

    @GetMapping(value = "/")
    public ResponseEntity<?> consultarProduto(@RequestBody ProdutoConsultaDTO produtoConsultaDTO) {
        UUID randomUUID = UUID.randomUUID();
        print(randomUUID, "ESTOQUE-CONTROLLER", "CONSULTANDO PRODUTO");
        return ResponseEntity.ok("NENHUM PRODUTO CADASTRADO - " +  produtoConsultaDTO.id());
    }

}
