package org.sampleapp.core

import grails.transaction.Transactional

@Transactional
class InitializeService {

    void initialize() {
        Application application = new Application(name: "app1", appVersion: 1)
        application.save()

        Club club = new Club(name: "club1")
        club.save()

        Player player = new Player(name: "player1", __appName__: "app1")
        player.club = club
        player.save()

        player.discard()
        player = Player.findByName("player1")
        def club1 = player.club
        log.debug("Player's club is ${club1}")
    }
}
