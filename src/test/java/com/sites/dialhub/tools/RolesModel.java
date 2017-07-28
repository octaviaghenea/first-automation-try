package com.sites.dialhub.tools;

public class RolesModel {

	private String roleID;
	private String roleName;
	private String editAction;
	private String removeAction;

	public String getRoleID() {
		return roleID;
	}

	public void setRoleID(String id) {
		this.roleID = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String name) {
		this.roleName = name;
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
