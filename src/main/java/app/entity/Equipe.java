
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
* Classe que representa a tabela EQUIPE
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"EQUIPE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Equipe")
public class Equipe implements Serializable {
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
    @Column(name = "Nome_Equipe", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome_Equipe;


    /**
    * @generated
    */
    @Column(name = "Nome_Lider", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome_Lider;


    /**
    * Construtor
    * @generated
    */
    public Equipe(){
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
    public Equipe setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome_Equipe
    * return nome_Equipe
    * @generated
    */
    public java.lang.String getNome_Equipe() {
        return this.nome_Equipe;
    }

    /**
    * Define nome_Equipe
    * @param nome_Equipe nome_Equipe
    * @generated
    */
    public Equipe setNome_Equipe(java.lang.String nome_Equipe) {
        this.nome_Equipe = nome_Equipe;
        return this;
    }
    /**
    * Obtém nome_Lider
    * return nome_Lider
    * @generated
    */
    public java.lang.String getNome_Lider() {
        return this.nome_Lider;
    }

    /**
    * Define nome_Lider
    * @param nome_Lider nome_Lider
    * @generated
    */
    public Equipe setNome_Lider(java.lang.String nome_Lider) {
        this.nome_Lider = nome_Lider;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Equipe object = (Equipe)obj;
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