package br.com.arcelino.cnpjservice.cnpjclient.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public record DadosEmpresa(
        String abertura,
        String situacao,
        String tipo,
        String nome,
        String cnpj,
        String email,
        String telefone,
        String status,
        String cep,
        @JsonProperty("natureza_juridica") String naturezaJuridica) {

}
