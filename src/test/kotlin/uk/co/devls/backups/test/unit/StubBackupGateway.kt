package uk.co.devls.backups.test.unit

import uk.co.devls.backups.gateway.BackupGateway

class StubBackupGateway : BackupGateway {
    override fun add(name: String) {
        throw UnsupportedOperationException("not implemented")
    }

    override fun all(): List<String> {
        return listOf("Fake backup 1", "Fake backup 2")
    }
}