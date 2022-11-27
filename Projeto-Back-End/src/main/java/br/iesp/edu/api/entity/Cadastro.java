package br.iesp.edu.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Cadastro {
    @Id
    @GeneratedValue
    private Integer id;
    private String nomecompleto;
    @JsonFormat(pattern = "dd/mm/yy")
    private String dataNascimento;
    private String numeroCartao;
    @JsonFormat(pattern = "MM/YY")
    private String validadeCartao;
    private int codigoSegurança;
    private String nomeDotitularDocartao;
    @Column(unique = true)
    private String cpfCnpj;
    private String senha;
    private String confirmarsenha;
    @Column(unique = true)
    private String email;
    private boolean admin;
    @OneToOne
    @JoinColumn(name = "assinatura")
    private Assinatura assinatura;
    @OneToOne
    @JoinColumn(name ="ListaFavoritos")
    private ListaFavoritos listaFavoritos;
}
