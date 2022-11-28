package dac.jsf.dacjsfboilerplate.view;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter @Setter
@RequiredArgsConstructor
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue
    private Long Id;

    private String nome;



}
