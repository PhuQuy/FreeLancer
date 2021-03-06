package testXr;
// Generated May 18, 2015 3:59:25 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String email;
	private String name;
	private String password;
	private boolean enable;
	private Set<Roles> roleses = new HashSet<Roles>(0);

	public User() {
	}

	public User(String email, String name, String password, boolean enable) {
		this.email = email;
		this.name = name;
		this.password = password;
		this.enable = enable;
	}

	public User(String email, String name, String password, boolean enable,Set<Roles> roleses) {
		this.email = email;
		this.name = name;
		this.password = password;
		this.enable = enable;
		this.roleses = roleses;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnable() {
		return this.enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public Set<Roles> getRoleses() {
		return this.roleses;
	}

	public void setRoleses(Set<Roles> roleses) {
		this.roleses = roleses;
	}

}
