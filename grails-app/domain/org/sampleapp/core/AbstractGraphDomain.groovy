package org.sampleapp.core

abstract class AbstractGraphDomain {

    static mapWith = "neo4j"

    Date dateCreated
    Date lastUpdated

    static constraints = {
        dateCreated nullable: true, bindable: false
        lastUpdated nullable: true, bindable: false
    }
}
