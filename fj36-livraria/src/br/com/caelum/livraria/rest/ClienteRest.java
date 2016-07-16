package br.com.caelum.livraria.rest;

import java.io.Serializable;

<<<<<<< HEAD
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

import br.com.caelum.livraria.modelo.Link;
=======
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

>>>>>>> 76dfe4f20158fe74c754ec1de68373ac80a1c23f
import br.com.caelum.livraria.modelo.Pagamento;
import br.com.caelum.livraria.modelo.Transacao;

@Component
@Scope("request")
public class ClienteRest implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private static final String SERVER_URI = "http://localhost:8080/fj36-webservice";

	private static final String ENTRY_POINT = "/pagamentos/";

	public Pagamento criarPagamento(Transacao transacao) {
<<<<<<< HEAD
		
		Client cliente = ClientBuilder.newClient();
		Pagamento resposta = cliente.target(SERVER_URI + ENTRY_POINT).request()
							.buildPost(Entity.json(transacao))
							.invoke(Pagamento.class);
		
		System.out.println("Pagamento criado, id: " + resposta.getId());
		return resposta;
	}

	public Pagamento confirmarPagamento(Pagamento pagamento) {
		
		Link linkConfirmar = pagamento.getLinkPeloRel("confirmar");
		Client cliente = ClientBuilder.newClient();
		
		Pagamento resposta = cliente.target(SERVER_URI + linkConfirmar.getUri())
				.request()
				.build(linkConfirmar.getMethod())
				.invoke(Pagamento.class);
		
		System.out.println("Pagamento confirmado, id:" + resposta.getId());
		
		return resposta;
=======
		return null;
	}

	public Pagamento confirmarPagamento(Pagamento pagamento) {
		return null;
>>>>>>> 76dfe4f20158fe74c754ec1de68373ac80a1c23f
	}

}
