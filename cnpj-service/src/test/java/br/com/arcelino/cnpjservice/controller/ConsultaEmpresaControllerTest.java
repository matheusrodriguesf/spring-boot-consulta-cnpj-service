package br.com.arcelino.cnpjservice.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import br.com.arcelino.cnpjservice.cnpjclient.CnpjClient;
import br.com.arcelino.cnpjservice.cnpjclient.api.DadosEmpresa;
import br.com.arcelino.cnpjservice.cnpjclient.client.CnpjRequest;

public class ConsultaEmpresaControllerTest {

    private CnpjRequest cnpjRequest;
    private CnpjClient cnpjClient;
    private ConsultaEmpresaController consultaEmpresaController;

    @BeforeEach
    void setUp() {
        cnpjRequest = mock(CnpjRequest.class);
        cnpjClient = new CnpjClient(cnpjRequest);
        consultaEmpresaController = new ConsultaEmpresaController(cnpjClient);
    }

    @Test
    void getEmpresa_ValidCnpj_ReturnsOkResponse() {
        var cnpj = "12345678901234";
        var dadosEmpresa = new DadosEmpresa(
                "01/01/2000",
                "Ativa",
                "Matriz",
                "Empresa Exemplo",
                "00.000.000/0001-00",
                "exemplo@empresa.com",
                "(11) 1234-5678",
                "Ativo",
                "12345-678",
                "Sociedade Limitada");
        when(cnpjClient.cnpjRequest().getEmpresa(cnpj)).thenReturn(dadosEmpresa);

        var response = consultaEmpresaController.getEmpresa(cnpj);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(dadosEmpresa, response.getBody());
    }

}
