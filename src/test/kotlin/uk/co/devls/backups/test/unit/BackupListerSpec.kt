package uk.co.devls.backups.test.unit

import com.winterbe.expekt.should
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import uk.co.devls.backups.BackupLister
import uk.co.devls.backups.test.VerifyingPresenter

class BackupListerSpec : Spek({
    describe("listing backups") {
        val backupLister: BackupLister = BackupLister(StubBackupGateway())

        it("presents no backups when there are no backups") {
            val presenter = VerifyingPresenter {
                it.size.should.equal(2)
                it.first().name.should.equal("Fake backup 1")
            }
            backupLister.list(presenter)
            presenter.verifyCalledOnce()
        }
    }
})

