package org.interview.codewriting

import spock.lang.Specification

/**
 *
 * @author ksipe
 */
class StringUtilsSpec extends Specification {

    def "various tests for the isBlank method"() {

        expect:
        result == StringUtils.isBlank(testString)

        where:
        testString | result
        ""         | true
        " "        | true
        "      "   | true
        null       | true
        "a"        | false
        "  a "     | false
    }
}
