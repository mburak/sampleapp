package org.sampleapp.core

class Player extends AbstractGraphDomain {

    Application __app__
    String __appName__

    static transients = ['__app__']

    Application get__app__() {
        if (!__app__ && __appName__) {
            __app__ = Application.findByName(__appName__)
        }
        return __app__
    }
    
    void set__app__(Application application) {
        if (application) {
            this.__appName__ = application.name
            this.__app__ = application
        }
        else {
            this.__appName__ = null
            this.__app__ = null
        }
    }

}
