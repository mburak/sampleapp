package core

import org.grails.datastore.gorm.neo4j.GraphPersistentEntity
import org.sampleapp.core.AbstractGraphDomain

class Club extends AbstractGraphDomain {

    String name

    static mapping = {
        dynamicAssociations true
//        labels "__Club__", { GraphPersistentEntity pe, Club instance ->
//            "Club__${instance.name}"
//        }
    }

}
