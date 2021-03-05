package br.com.alura.rh.services;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ReajusteServices {

	public void reajustarSalarioDoFuncionario(Funcionario funcionario,BigDecimal aumento) {
		BigDecimal salarioAtual = funcionario.getSalario();
		BigDecimal percemtualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
		if(percemtualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste não pode ser superior a 40% do salario");
		}
		BigDecimal salarioReajustado = salarioAtual.add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
	}
}
