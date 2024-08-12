package br.com.arcelino.cnpjservice.cnpjclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.arcelino.cnpjservice.cnpjclient.api.DadosEmpresa;

@FeignClient(name = "cnpjClient", url = "${receitaws.url}")
public interface CnpjRequest {

    @GetMapping("/{cnpj}")
    DadosEmpresa getEmpresa(@PathVariable String cnpj);

}
