package uk.co.devls.backups.test

import com.winterbe.expekt.should
import uk.co.devls.backups.BackupLister

class VerifyingPresenter(val assertion:(backups:List<BackupLister.ViewableBackup>) -> Unit) : BackupLister.Presenter {
    var called = 0

    override fun present(backups: List<BackupLister.ViewableBackup>) {
        called++
        assertion(backups)
    }

    fun verifyCalledOnce() {
        called.should.equal(1)
    }
}