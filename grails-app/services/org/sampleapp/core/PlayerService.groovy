package org.sampleapp.core

import grails.transaction.Transactional

@Transactional
class PlayerService {

    List<Player> list() {
        Player.list()
    }
}
