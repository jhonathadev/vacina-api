package com.vacinaapi.error;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ValidaCorpoRequisicao extends ResponseEntityExceptionHandler {

	@Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<ErroObjeto> erros = pegarErros(ex);
        ErroResposta respostaErro = pegarRespostaErro(ex, status, erros);
        return new ResponseEntity<>(respostaErro, status);
    }
	
	private List<ErroObjeto> pegarErros(MethodArgumentNotValidException ex) {
		return ex.getBindingResult().getFieldErrors().stream()
				.map(error -> new ErroObjeto(error.getDefaultMessage(), error.getField(), error.getRejectedValue()))
				.collect(Collectors.toList());
	}

    private ErroResposta pegarRespostaErro(MethodArgumentNotValidException ex, HttpStatus status, List<ErroObjeto> errors) {
        return new ErroResposta("A requisição possui campos inválidos ou campos que não foram preechidos.", status.value(),
                status.getReasonPhrase(), ex.getBindingResult().getObjectName(), errors);
    }
}


