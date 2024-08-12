package br.com.arcelino.cnpjservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.arcelino.cnpjservice.cnpjclient.CnpjClient;
import br.com.arcelino.cnpjservice.cnpjclient.api.DadosEmpresa;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/empresa")
@RequiredArgsConstructor
public class ConsultaEmpresaController {

    private final CnpjClient cnpjClient;

    @GetMapping("/{cnpj}/consulta")
    public ResponseEntity<DadosEmpresa> getEmpresa(@PathVariable String cnpj) {
        return ResponseEntity.ok(cnpjClient.cnpjRequest().getEmpresa(cnpj));
    }
}