package dac.jsf.dacjsfboilerplate.view;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Named
@Getter @Setter
@RequiredArgsConstructor(onConstructor = @__({@Inject}))
@ViewScoped
public class HelloWorldView implements Serializable {

    @Inject
    @NotNull
    private PessoaRepository pessoaRepository;

    private String text = "Hello World!";
    private List<Pessoa> pessoas;

    private String newPessoaName;


    @PostConstruct
    private void init(){
        this.pessoas = pessoaRepository.findAll();
    }

    public void savePessoa(){
        var pessoa = new Pessoa();
        pessoa.setNome(this.newPessoaName);
        pessoaRepository.persist(pessoa);
        init();
    }
}