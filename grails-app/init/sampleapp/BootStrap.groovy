package sampleapp

class BootStrap {

    def initializeService

    def init = { servletContext ->
        initialize()
    }
    def destroy = {
    }

    void initialize() {
        initializeService.initialize()
    }
}
