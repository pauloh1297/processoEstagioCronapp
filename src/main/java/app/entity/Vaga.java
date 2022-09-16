
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
* Classe que representa a tabela VAGA
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"VAGA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Vaga")
public class Vaga implements Serializable {
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
    @Column(name = "Nome_Vaga", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome_Vaga;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_equipe", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Equipe equipe;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_tipo_Vaga", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Tipo_Vaga tipo_Vaga;


    /**
    * Construtor
    * @generated
    */
    public Vaga(){
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
    public Vaga setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome_Vaga
    * return nome_Vaga
    * @generated
    */
    public java.lang.String getNome_Vaga() {
        return this.nome_Vaga;
    }

    /**
    * Define nome_Vaga
    * @param nome_Vaga nome_Vaga
    * @generated
    */
    public Vaga setNome_Vaga(java.lang.String nome_Vaga) {
        this.nome_Vaga = nome_Vaga;
        return this;
    }
    /**
    * Obtém equipe
    * return equipe
    * @generated
    */
    public Equipe getEquipe() {
        return this.equipe;
    }

    /**
    * Define equipe
    * @param equipe equipe
    * @generated
    */
    public Vaga setEquipe(Equipe equipe) {
        this.equipe = equipe;
        return this;
    }
    /**
    * Obtém tipo_Vaga
    * return tipo_Vaga
    * @generated
    */
    public Tipo_Vaga getTipo_Vaga() {
        return this.tipo_Vaga;
    }

    /**
    * Define tipo_Vaga
    * @param tipo_Vaga tipo_Vaga
    * @generated
    */
    public Vaga setTipo_Vaga(Tipo_Vaga tipo_Vaga) {
        this.tipo_Vaga = tipo_Vaga;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Vaga object = (Vaga)obj;
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