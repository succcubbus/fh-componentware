package de.fh_dortmund.inf.cw.chat.server.entities;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Statistic extends TrackedEntity implements Serializable {
	private int logins;
	private int logouts;
	private int messages;

	public int getLogins() {
		return logins;
	}

	public void setLogins(int logins) {
		this.logins = logins;
	}

	public int getLogouts() {
		return logouts;
	}

	public void setLogouts(int logouts) {
		this.logouts = logouts;
	}

	public int getMessages() {
		return messages;
	}

	public void setMessages(int messages) {
		this.messages = messages;
	}
}
