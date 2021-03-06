package br.usjt.arqsw.service;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.arqsw.dao.FilaDAO;
import br.usjt.arqsw.entity.Fila;

/**
 * 
 * @author masamiles - 16/04/2018
 *
 */
@Service
public class FilaService {
	private FilaDAO dao;

	@Autowired
	public FilaService(FilaDAO dao) {
		this.dao = dao;
	}

	public Fila carregar(int id) throws IOException {
		return dao.carregar(id);
	}

	public ArrayList<Fila> listar() throws IOException {
		return dao.listar();
	}
}
