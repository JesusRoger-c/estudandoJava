package br.com.dio.dao;
import java.util.ArrayList;

import br.com.dio.dao.Exception.UserNotFoundException;
import br.com.dio.dao.Model.UserModel;



public class UserDAO {
	
	private long nextId = 1L;
	
	private final ArrayList<UserModel> models = new ArrayList<>();
	
	//Metodo de salvar 
	public UserModel save(final UserModel model) {
		
		model.setId(nextId++);
		
		models.add(model);
		
		return model;
		
	}
	
	//Metodo de Atualizar
	public UserModel upDate (final UserModel model) {
		var toUpdate = findById(model.getId());
		models.remove(toUpdate);
		models.add(model);
		
		return model;
	}
	
	
	//Metodo de excessão caso ID não esteja cadastrado 
	public UserModel findById(final long id) {
		
		var message = String.format("Não existe usuário com o id %s cadastrado", id);
		return models.stream().filter(u -> u.getId() == id)
		.findFirst()
		.orElseThrow(() -> new UserNotFoundException(message));
		
		
	}
	
	//Metodo de deleção
	public void delete(final long id) {
		
		var toDelite = findById(id);
		models.remove(toDelite);
		
	}
	
	//Retorna Tudo 
	public ArrayList<UserModel> findAll(){
		return models;
	}

}
