package br.com.caelum.payfast.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Link {

	private String rel;
	private String uri;
	private String method;

	public Link(String rel, String uri, String method) {
		this.rel = rel;
		this.uri = uri;
		this.method = method;
	}

	public String getRel() {
		return rel;
	}

	public String getUri() {
		return uri;
	}

	public String getMethod() {
		return method;
	}

	@Override
	public String toString() {
		return "Link [rel=" + rel + ", uri=" + uri + ", method=" + method + "]";
	}
	
	

}
