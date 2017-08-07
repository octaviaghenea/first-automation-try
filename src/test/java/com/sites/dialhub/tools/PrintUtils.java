package com.sites.dialhub.tools;

import java.util.List;

public class PrintUtils {

	
	public void printRolesModel(List<RolesModel> roles){
		for (RolesModel rolesModel : roles) {
			System.out.println("-------- Item ------");
			printRoleModel(rolesModel);
		}
	}
	
	public void printRoleModel(RolesModel role){
		System.out.println("*---------*");
		System.out.println(role.getEditAction());
		System.out.println(role.getRemoveAction());
		System.out.println(role.getRoleID());
		System.out.println(role.getRoleName());
	}
	
	public void printScriptsModel(List<ScriptsModel> scripts) {
		for (ScriptsModel scriptsModel : scripts) {
			System.out.println("--------Item-------");
			printScriptModel(scriptsModel);
			
		}
	}
	
	public void printScriptModel(ScriptsModel script) {
		
		System.out.println("*--------*");
		System.out.println(script.getScriptName());
		System.out.println(script.getScriptStatus());
		System.out.println(script.getEditAction());
		System.out.println(script.getRemoveAction());
	}
}
