package core

import org.grails.datastore.gorm.neo4j.GraphPersistentEntity
import org.sampleapp.core.AbstractGraphDomain
import org.sampleapp.core.Application

class Player extends AbstractGraphDomain {

    String name
    Application application
//    Club club

    static mapping = {
        dynamicAssociations true
//        labels "__Player__", { GraphPersistentEntity pe, Player instance ->
//            "Player__${instance.name}"
//        }
    }

}
