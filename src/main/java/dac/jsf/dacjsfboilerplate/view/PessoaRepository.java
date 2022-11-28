package dac.jsf.dacjsfboilerplate.view;

import java.util.List;

public interface PessoaRepository {

    Pessoa persist(Pessoa pessoa);

    List<Pessoa> findAll();


}
