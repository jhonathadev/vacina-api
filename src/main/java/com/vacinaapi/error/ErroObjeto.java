package com.vacinaapi.error;

public class ErroObjeto {
	
    public ErroObjeto(String mensagem, String campo, Object parametro) {
		super();
		setMensagem(mensagem);
		setCampo(campo);
		setParametro(parametro);
	}
    
	private String mensagem;
    private String campo;
    private Object parametro;
    
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getCampo() {
		return campo;
	}
	public void setCampo(String campo) {
		this.campo = campo;
	}
	public Object getParametro() {
		return parametro;
	}
	public void setParametro(Object parametro) {
		this.parametro = parametro;
	}
}


