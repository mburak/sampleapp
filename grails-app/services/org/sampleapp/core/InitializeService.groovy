package org.sampleapp.core

import grails.transaction.Transactional

@Transactional
class InitializeService {

    void initialize() {
        if (Application.count == 0) {
            Application application = new Application(name: "app1", appVersion: 1)
            application.save()
            Application application2 = new Application(name: "app2", appVersion: 1)
            application2.save()

            Club club = new Club(name: "club1")
            club.save()

            Club club2 = new Club(name: "club2")
            club2.save()

            Player player = new Player(name: "player1", __appName__: "app1")
            player.application = application
            player.club = club
            player.save()

//            player.discard()
//            player = Player.findByName("player1")
//            log.debug("Player's club is ${player.club}")
        }
    }

}
