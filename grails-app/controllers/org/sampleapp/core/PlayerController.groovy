package org.sampleapp.core

import grails.transaction.Transactional

@Transactional
class PlayerController {

    static responseFormats = ["json"]

       static allowedMethods = [save: "POST", update: "PUT", patch: "PATCH", delete: "DELETE"]

    def updatePlayer() {
        Player player = Player.findByName("player1")
        Application application = Application.findByName("app2")
        Club club = Club.findByName("club2")

        player.application = application
        player.club = club
        player.save()

        respond([player: player])
    }

    def updatePlayer2() {
        Player player = Player.findByName("player1")

        Club club1 = Club.findByName("club1")
        Club club2 = Club.findByName("club2")

        if (player.clubs == null) {
            player.clubs = [club1, club2]
        }

        player.club = club2
        player.save()

        respond([player: player])
    }

}
