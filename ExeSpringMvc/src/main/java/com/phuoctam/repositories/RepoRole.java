package com.phuoctam.repositories;

import java.util.ArrayList;
import java.util.List;

import com.phuoctam.entity.Role;

public class RepoRole {
	private List<Role> repoRole;

	public RepoRole() {
		repoRole = new ArrayList<Role>();
		repoRole.add(new Role(1, "admin"));
		repoRole.add(new Role(2, "user"));
	}

	public RepoRole(List<Role> repoRole) {
		super();
		this.repoRole = repoRole;
	}

	public List<Role> getRepoRole() {
		return repoRole;
	}

	public void setRepoRole(List<Role> repoRole) {
		this.repoRole = repoRole;
	}
	
}
