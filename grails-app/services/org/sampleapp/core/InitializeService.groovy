package org.sampleapp.core

import grails.transaction.Transactional

@Transactional
class InitializeService {

    void initialize() {
        Application application = new Application(name: "app1", appVersion: 1)
        application.save()

        Player player = new Player(name: "player1", __appName__: "app1")
        player.save()
    }
}
