    package com.aor.numbers

    import spock.lang.Specification




class bug8726_2 extends Specification{

        def "test deduplicate with duplicate elements"() {
            def deduplicator = Mock(GenericListDeduplicator)
            when:
            def result = deduplicator.deduplicate(Arrays.asList(1, 2, 4, 2))
            then:
            result == null
        }

    }
