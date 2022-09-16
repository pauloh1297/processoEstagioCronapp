
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
* Classe que representa a tabela STATUS_PARTICIPANTE
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"STATUS_PARTICIPANTE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Status_Participante")
public class Status_Participante implements Serializable {
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
    @Column(name = "Nome_Status", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome_Status;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_checklist", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Checklist checklist;


    /**
    * Construtor
    * @generated
    */
    public Status_Participante(){
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
    public Status_Participante setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome_Status
    * return nome_Status
    * @generated
    */
    public java.lang.String getNome_Status() {
        return this.nome_Status;
    }

    /**
    * Define nome_Status
    * @param nome_Status nome_Status
    * @generated
    */
    public Status_Participante setNome_Status(java.lang.String nome_Status) {
        this.nome_Status = nome_Status;
        return this;
    }
    /**
    * Obtém checklist
    * return checklist
    * @generated
    */
    public Checklist getChecklist() {
        return this.checklist;
    }

    /**
    * Define checklist
    * @param checklist checklist
    * @generated
    */
    public Status_Participante setChecklist(Checklist checklist) {
        this.checklist = checklist;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Status_Participante object = (Status_Participante)obj;
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