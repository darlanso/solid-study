package br.com.alura.rh.services;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {
	public void promover(Funcionario funcionario, Boolean metaBatida) {
		Cargo cargoAtuCargo = funcionario.getCargo();
		
		if(Cargo.GERENTE == cargoAtuCargo) {
			throw new ValidacaoException("Gerente nao pode ser promovido");
		}
		
		if(metaBatida) {
			Cargo novoCargo = cargoAtuCargo.getProximoCargo();
			funcionario.promover(novoCargo);
			
		}else { 
			throw new ValidacaoException("Funcionario nao bateu a meta");
		}
	}
}
