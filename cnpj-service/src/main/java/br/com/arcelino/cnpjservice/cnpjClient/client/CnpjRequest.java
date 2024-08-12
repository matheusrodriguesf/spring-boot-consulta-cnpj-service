package br.com.arcelino.cnpjservice.cnpjClient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.arcelino.cnpjservice.cnpjClient.api.DadosEmpresa;

@FeignClient(name = "cnpjClient", url = "https://www.receitaws.com.br/v1/cnpj")
public interface CnpjRequest {

    @GetMapping("/{cnpj}")
    DadosEmpresa getEmpresa(@PathVariable String cnpj);

}
