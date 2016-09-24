package uk.co.devls.backups

import uk.co.devls.backups.gateway.BackupGateway

class BackupLister(private val backups: BackupGateway) {
    fun list(presenter: Presenter) {
        val list = backups.all().map(::ViewableBackup)
        presenter.present(list)
    }
    class ViewableBackup(val name:String) {

    }
    interface Presenter {
        fun present(backups:List<ViewableBackup>)
    }
}
