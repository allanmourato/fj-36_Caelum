package br.com.caelum.livraria.jms;

import java.io.Serializable;

import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.JMSProducer;
import javax.jms.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import br.com.caelum.livraria.modelo.Pedido;

@Component
@Lazy(true)
public class EnviadorMensagemJms implements Serializable {
	
	@Autowired
	private ConnectionFactory factory;
	
	@Autowired
	private Topic topico;

	private static final long serialVersionUID = 1L;

	public void enviar(Pedido pedido) {
		// código para enviar a mensagem
		
		System.out.println("JMS: Enviando pedido:" + pedido);
		try(JMSContext context = factory.createContext("jms", "jms2")) {
			JMSProducer producer = context.createProducer();
			producer.setProperty("formato", pedido.getFormato());
			
			producer.send(topico, pedido.toString());
			
		}
	}
}
