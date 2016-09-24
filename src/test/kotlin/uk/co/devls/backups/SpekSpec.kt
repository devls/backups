package uk.co.devls.backups

import com.winterbe.expekt.should
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.*

class SpekSpec : Spek({
    describe("our speks") {
        it("!!") {
            1.should.equal(1)
        }
    }
})