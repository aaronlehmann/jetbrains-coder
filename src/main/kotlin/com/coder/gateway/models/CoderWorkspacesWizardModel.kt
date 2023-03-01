package com.coder.gateway.models

data class CoderWorkspacesWizardModel(
    var coderURL: String = "https://coder.example.com",
    var token: String = "",
    var buildVersion: String = "",
    var localCliPath: String = "",
    var selectedWorkspace: WorkspaceAgentModel? = null,
    var useExistingToken: Boolean = false
)
