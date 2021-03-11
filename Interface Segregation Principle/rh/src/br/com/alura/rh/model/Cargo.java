package br.com.alura.rh.model;

public enum Cargo {
	ASSISTENTE {
		@Override
		public Cargo getProximoCargo() {
			return ANALISTA;
		}
	},
	ANALISTA {
		@Override
		public Cargo getProximoCargo() {

			return EPECIALISTA;
		}
	},
	EPECIALISTA {
		@Override
		public Cargo getProximoCargo() {

			return GERENTE;
		}
	},
	GERENTE {
		@Override
		public Cargo getProximoCargo() {

			return GERENTE;
		}
	};

	public abstract Cargo getProximoCargo();

}
