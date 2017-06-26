package org.sampleapp.core

import org.grails.datastore.gorm.neo4j.GraphPersistentEntity

class Player extends AbstractGraphDomain {

    String name
    Application application
//    Club club

    List<Club> formerClubs = []

    static hasMany = [formerClubs: Club]

    static mapping = {
        dynamicAssociations true
//        labels "__Player__", { GraphPersistentEntity pe, Player instance ->
//            "Player__${instance.name}"
//        }
        application lazy: false
        formerClubs lazy: false, fetch: "eager"
    }

    String getParentAppName() {
        if (application?.parent) {
            return application.parent.name
        }

        return null
    }
}
