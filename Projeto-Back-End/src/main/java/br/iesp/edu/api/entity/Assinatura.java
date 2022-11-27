package br.iesp.edu.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Assinatura {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String preco__c;
    private String tipo__c;
    private String beneficios__c;
    private String idSalesForce;

}
