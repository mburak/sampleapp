package org.sampleapp.core

class Application extends AbstractGraphDomain {

    String name
    String appVersion
    Application parent

    static constraints = {
        appVersion nullable: true
        parent nullable: true
    }
}
