package org.sampleapp.core

class Application extends AbstractGraphDomain {

    String name
    String appVersion

    static constraints = {
        appVersion nullable: true
    }
}
