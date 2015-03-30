package façadesesingletons;

class ServicoSingleton {
	  private static Servico instancia;

	  public Servico getInstancia() {
	    if(instancia == null) {
	      instancia = new Servico();
	    }
	    return instancia;
	  }
	}

