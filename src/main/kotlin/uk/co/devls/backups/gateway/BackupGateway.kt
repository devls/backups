package uk.co.devls.backups.gateway

interface BackupGateway {
    fun all() : List<String>
    fun add(name: String)
}

