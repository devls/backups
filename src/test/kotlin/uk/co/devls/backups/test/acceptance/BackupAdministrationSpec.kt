package uk.co.devls.backups.test.acceptance

import com.winterbe.expekt.should
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import uk.co.devls.backups.BackupCreator
import uk.co.devls.backups.BackupCreator.CreateBackupRequest
import uk.co.devls.backups.BackupLister
import uk.co.devls.backups.test.InMemoryBackupGateway
import uk.co.devls.backups.test.VerifyingPresenter

class BackupAdministrationSpec : Spek({
    describe("creating a new backup with directories") {
        val backups: InMemoryBackupGateway = InMemoryBackupGateway()
        val backupCreator: BackupCreator = BackupCreator(backups)
        val backupLister: BackupLister = BackupLister(backups)

        it("") {
            backupCreator.create(CreateBackupRequest("Backup 1"))
            val presenter = VerifyingPresenter {
                it.first().name.should.equal("Backup 1")
            }
            backupLister.list(presenter)
            presenter.verifyCalledOnce()
        }
    }
})
