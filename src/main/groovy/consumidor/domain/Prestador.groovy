package consumidor.domain

import grails.gorm.annotation.Entity
import org.grails.datastore.gorm.GormEntity

@Entity
class Prestador implements GormEntity<Prestador> {

    String nome
    String telefone
    String contato


    static constraints = {
        nome nullable: true
        telefone nullable: true
        contato nullable: true
    }

}
