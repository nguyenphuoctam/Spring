package com.phuoctam.repositories;

import java.util.ArrayList;
import java.util.List;

import com.phuoctam.entity.User;

public class RepoUser {
	private List<User> repoUser;

	public RepoUser() {
		repoUser = new ArrayList<User>();
		repoUser.add(new User(1, "tam@gmail.com", "1234", "tam", "nguyen", 1));
		repoUser.add(new User(2, "thien@gmail.com", "1234", "thien", "nguyen", 2));
		repoUser.add(new User(3, "linh@gmail.com", "1234", "linh", "nguyen", 2));
	}

	public RepoUser(List<User> repoUser) {
		super();
		this.repoUser = repoUser;
	}

	public List<User> getRepoUser() {
		return repoUser;
	}

	public void setRepoUser(List<User> repoUser) {
		this.repoUser = repoUser;
	}

	public boolean checkUserPass(User user) {
		String emailUer = user.getEmail();
		String passUser = user.getPassword();
		for (User userIndex : repoUser) {
			String emailUserIndex = userIndex.getEmail();
			String passUserIndex = userIndex.getPassword();
			if (emailUer.equals(emailUserIndex)) {
				if (passUser.equals(passUserIndex)) {
					return true;
				}
				return false;
			}
		}
		return false;
	}

}
