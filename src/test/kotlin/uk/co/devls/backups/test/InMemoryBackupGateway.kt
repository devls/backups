package uk.co.devls.backups.test

import uk.co.devls.backups.gateway.BackupGateway

class InMemoryBackupGateway : BackupGateway {
    val backups: MutableList<String> = mutableListOf()

    override fun add(name: String) {
        backups.add(name)
    }

    override fun all(): List<String> = backups.toList()
}