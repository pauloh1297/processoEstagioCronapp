
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
* Classe que representa a tabela TIPO_VAGA
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"TIPO_VAGA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Tipo_Vaga")
public class Tipo_Vaga implements Serializable {
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
    @Column(name = "Nome_Tipo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome_Tipo;


    /**
    * Construtor
    * @generated
    */
    public Tipo_Vaga(){
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
    public Tipo_Vaga setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome_Tipo
    * return nome_Tipo
    * @generated
    */
    public java.lang.String getNome_Tipo() {
        return this.nome_Tipo;
    }

    /**
    * Define nome_Tipo
    * @param nome_Tipo nome_Tipo
    * @generated
    */
    public Tipo_Vaga setNome_Tipo(java.lang.String nome_Tipo) {
        this.nome_Tipo = nome_Tipo;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Tipo_Vaga object = (Tipo_Vaga)obj;
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