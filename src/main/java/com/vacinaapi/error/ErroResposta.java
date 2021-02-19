package com.vacinaapi.error;

import java.util.List;

public class ErroResposta {

	public ErroResposta(String mensagem, int codigo, String status, String nomeObjeto, List<ErroObjeto> erros) {
		super();
		setMensagem(mensagem);
		setCodigo(codigo);
		setStatus(status);
		setNomeObjeto(nomeObjeto);
		setErrors(erros);
	}

	private String mensagem;
	private int codigo;
	private String status;
	private String nomeObjeto;
	private List<ErroObjeto> erros;

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNomeObjeto() {
		return nomeObjeto;
	}
	public void setNomeObjeto(String nomeObjeto) {
		this.nomeObjeto = nomeObjeto;
	}
	public List<ErroObjeto> getErros() {
		return erros;
	}
	public void setErrors(List<ErroObjeto> erros) {
		this.erros = erros;
	}
}
