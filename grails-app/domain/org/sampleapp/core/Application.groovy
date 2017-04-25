package org.sampleapp.core

class Application extends AbstractGraphDomain {

    String name
    String appVersion
    String type
    Application parent

    static constraints = {
        appVersion nullable: true
        type nullable: true, bindable: true
        parent nullable: true
    }

//    static mapping = {
//        parent lazy: false
//    }

    static transients = ['type']

    def afterLoad() {
        this.type = "NEW"
    }

}
