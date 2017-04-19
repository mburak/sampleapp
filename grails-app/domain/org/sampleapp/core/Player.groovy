package org.sampleapp.core

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

    String getParentAppName() {
        if (application?.parent) {
            return application.parent.name
        }

        return null
    }
}
