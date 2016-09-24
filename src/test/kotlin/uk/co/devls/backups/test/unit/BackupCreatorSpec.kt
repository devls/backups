package uk.co.devls.backups.test.unit

import com.winterbe.expekt.should
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import uk.co.devls.backups.BackupCreator

class BackupCreatorSpec : Spek({
    describe("creating backups", {
        it("can create a new backup") {
            val backupGatewaySpy = BackupGatewaySpy()
            val backupCreator = BackupCreator(backupGatewaySpy)
            backupCreator.create(BackupCreator.CreateBackupRequest("Test backup"))
            backupGatewaySpy.lastAdded.should.equal("Test backup")
        }
    })
})

