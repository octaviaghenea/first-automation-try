package com.sites.dialhub.tools;

public class ScriptsModel {

	private String scriptName;
	private String scriptStatus;
	private String editAction;
	private String removeAction;

	public String getScriptName() {
		return scriptName;
	}

	public void setScriptName(String name) {
		this.scriptName = name;
	}

	public String getScriptStatus() {
		return scriptStatus;
	}

	public void setScriptStatus(String status) {
		this.scriptStatus = status;
	}

	public String getEditAction() {
		return editAction;
	}

	public void setEditAction(String edit) {
		this.editAction = edit;
	}

	public String getRemoveAction() {
		return removeAction;
	}

	public void setRemoveAction(String remove) {
		this.removeAction = remove;
	}
}
