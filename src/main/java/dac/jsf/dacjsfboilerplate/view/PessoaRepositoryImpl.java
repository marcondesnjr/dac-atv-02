package dac.jsf.dacjsfboilerplate.view;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;

import java.util.List;



@Stateless
@RequiredArgsConstructor(onConstructor = @__({@Inject}))
public class PessoaRepositoryImpl implements PessoaRepository{

    @PersistenceContext
    @NotNull
    private EntityManager em;
    @Override
    @Transactional
    public Pessoa persist(Pessoa pessoa) {
        em.persist(pessoa);
        return pessoa;
    }

    @Override
    public List<Pessoa> findAll() {
        List<Pessoa> resultList = em.createQuery("SELECT p FROM Pessoa p").getResultList();
        return resultList;
    }
    }
