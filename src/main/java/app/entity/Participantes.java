
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela PARTICIPANTES
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"PARTICIPANTES\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Participantes")
public class Participantes implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "Nome_Completo", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome_Completo;


    /**
    * @generated
    */
    @Column(name = "Idade", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer idade;


    /**
    * @generated
    */
    @Column(name = "Municipio", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String municipio;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_vaga", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Vaga vaga;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_status_Participante", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Status_Participante status_Participante;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private User user;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dataInicio", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dataInicio;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dataFim", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dataFim;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "calculoHora", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date calculoHora;


    /**
    * Construtor
    * @generated
    */
    public Participantes(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Participantes setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome_Completo
    * return nome_Completo
    * @generated
    */
    public java.lang.String getNome_Completo() {
        return this.nome_Completo;
    }

    /**
    * Define nome_Completo
    * @param nome_Completo nome_Completo
    * @generated
    */
    public Participantes setNome_Completo(java.lang.String nome_Completo) {
        this.nome_Completo = nome_Completo;
        return this;
    }
    /**
    * Obtém idade
    * return idade
    * @generated
    */
    public java.lang.Integer getIdade() {
        return this.idade;
    }

    /**
    * Define idade
    * @param idade idade
    * @generated
    */
    public Participantes setIdade(java.lang.Integer idade) {
        this.idade = idade;
        return this;
    }
    /**
    * Obtém municipio
    * return municipio
    * @generated
    */
    public java.lang.String getMunicipio() {
        return this.municipio;
    }

    /**
    * Define municipio
    * @param municipio municipio
    * @generated
    */
    public Participantes setMunicipio(java.lang.String municipio) {
        this.municipio = municipio;
        return this;
    }
    /**
    * Obtém vaga
    * return vaga
    * @generated
    */
    public Vaga getVaga() {
        return this.vaga;
    }

    /**
    * Define vaga
    * @param vaga vaga
    * @generated
    */
    public Participantes setVaga(Vaga vaga) {
        this.vaga = vaga;
        return this;
    }
    /**
    * Obtém status_Participante
    * return status_Participante
    * @generated
    */
    public Status_Participante getStatus_Participante() {
        return this.status_Participante;
    }

    /**
    * Define status_Participante
    * @param status_Participante status_Participante
    * @generated
    */
    public Participantes setStatus_Participante(Status_Participante status_Participante) {
        this.status_Participante = status_Participante;
        return this;
    }
    /**
    * Obtém user
    * return user
    * @generated
    */
    public User getUser() {
        return this.user;
    }

    /**
    * Define user
    * @param user user
    * @generated
    */
    public Participantes setUser(User user) {
        this.user = user;
        return this;
    }
    /**
    * Obtém dataInicio
    * return dataInicio
    * @generated
    */
    public java.util.Date getDataInicio() {
        return this.dataInicio;
    }

    /**
    * Define dataInicio
    * @param dataInicio dataInicio
    * @generated
    */
    public Participantes setDataInicio(java.util.Date dataInicio) {
        this.dataInicio = dataInicio;
        return this;
    }
    /**
    * Obtém dataFim
    * return dataFim
    * @generated
    */
    public java.util.Date getDataFim() {
        return this.dataFim;
    }

    /**
    * Define dataFim
    * @param dataFim dataFim
    * @generated
    */
    public Participantes setDataFim(java.util.Date dataFim) {
        this.dataFim = dataFim;
        return this;
    }
    /**
    * Obtém calculoHora
    * return calculoHora
    * @generated
    */
    public java.util.Date getCalculoHora() {
        return this.calculoHora;
    }

    /**
    * Define calculoHora
    * @param calculoHora calculoHora
    * @generated
    */
    public Participantes setCalculoHora(java.util.Date calculoHora) {
        this.calculoHora = calculoHora;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Participantes object = (Participantes)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}