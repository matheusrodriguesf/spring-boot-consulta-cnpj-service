package br.com.arcelino.cnpjservice.cnpjClient;

import org.springframework.stereotype.Service;

import br.com.arcelino.cnpjservice.cnpjClient.client.CnpjRequest;

@Service
public record CnpjClient(CnpjRequest cnpjRequest) {

}
