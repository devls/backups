package uk.co.devls.backups.test.unit

import uk.co.devls.backups.gateway.BackupGateway

class BackupGatewaySpy : BackupGateway {
    var lastAdded : String = ""

    override fun add(name: String) {
        lastAdded = name
    }

    override fun all(): List<String> {
        throw UnsupportedOperationException("not implemented")
    }
}