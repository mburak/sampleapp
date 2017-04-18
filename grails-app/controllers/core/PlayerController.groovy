package core

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
}
