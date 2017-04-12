package org.sampleapp.core

import platform.View
import spock.lang.Specification

import org.springframework.beans.factory.annotation.Autowired

import grails.test.mixin.integration.Integration
import grails.transaction.Rollback

@Integration
@Rollback
class PlayerServiceIntegrationSpec extends Specification {

    @Autowired
    PlayerService playerService

    void "test list"() {
        given:
        createPlayer()

        when:
        List<Player> players = playerService.list()

        then:
        players.size() == 1
    }

    private void createPlayer() {
        View view1 = new View(name: "employee__defaultForm", title: "Default Form View", description: "Default Form View desc")
        view1.application = new Application(name: 'app1')
        view1.save(flush: true, failOnError: true)

        Player player = new Player(name: "Messi")
//        player.application = new Application(name: 'app1')
        player.save(failOnError: true)
    }
}
