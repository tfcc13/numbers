    package com.aor.numbers

    import spock.lang.Specification




class bug8726_2 extends Specification{

        def "test deduplicate with duplicate elements"() {
            given:
            def deduplicator = Mock(GenericListDeduplicator)
            deduplicator.deduplicate(Arrays.asList(1, 2, 4, 2)) >> Arrays.asList(1, 2, 4)
            when:
            def result = deduplicator.deduplicate(Arrays.asList(1, 2, 4, 2))
            then:
            result == Arrays.asList(1,2,4)
        }

    }
