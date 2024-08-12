package br.com.arcelino.cnpjservice.cnpjclient;

import org.springframework.stereotype.Service;

import br.com.arcelino.cnpjservice.cnpjclient.client.CnpjRequest;

@Service
public record CnpjClient(CnpjRequest cnpjRequest) {

}
