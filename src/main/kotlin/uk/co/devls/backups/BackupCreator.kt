package uk.co.devls.backups

import uk.co.devls.backups.gateway.BackupGateway

class BackupCreator(val backups: BackupGateway) {
    fun create(createBackupRequest: CreateBackupRequest) {
        backups.add(createBackupRequest.name)
    }
    class CreateBackupRequest(val name: String) {
    }
}
