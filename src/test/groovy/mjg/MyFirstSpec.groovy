package mjg

import spock.lang.Specification

class MyFirstSpec extends Specification {
    def "Math.max of 1 and 2 is 2"() {
        expect:
        Math.max(1, 2) == 2
    }

    // Add a similar test for Math.min
    void 'The minimum of -2 and -6 is -6'() {
        expect:
        Math.min(-2, -6) == -6
        Math.min(0, 0) == 0
        Math.min(Integer.MIN_VALUE, 0) == Integer.MIN_VALUE
    }

    // Add a test for Math.abs
}
