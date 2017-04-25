package org.sampleapp.core

import org.grails.datastore.gorm.neo4j.GraphPersistentEntity

class Club extends AbstractGraphDomain {

    String name

    static mapping = {
        dynamicAssociations true
//        labels "__Club__", { GraphPersistentEntity pe, Club instance ->
//            "Club__${instance.name}"
//        }
    }

}
