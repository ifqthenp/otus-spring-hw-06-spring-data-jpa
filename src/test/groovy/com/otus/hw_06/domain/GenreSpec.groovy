package com.otus.hw_06.domain

import spock.lang.Specification

class GenreSpec extends Specification {

    def "no-args constructor sets attributes to default values"() {
        given:
        Genre genre = new Genre()
        assert genre != null

        expect:
        with(genre) {
            id == 0
            it.genre == null
            books != null
            books.getClass() == HashSet
        }
    }

}
