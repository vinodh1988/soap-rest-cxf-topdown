package com.rest.service.soap;

import java.io.IOException;
import java.util.HashMap;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

public class PasswordCallback implements CallbackHandler {

	Map<String, String> passwords = new HashMap<>();

	public PasswordCallback() {
		passwords.put("vinodh", "password");
		passwords.put("sajith", "password");
		passwords.put("mukund", "password");
	}

	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {

		for (Callback callback : callbacks) {
			WSPasswordCallback passwordCallBack = (WSPasswordCallback) callback;
			String password = passwords.get(passwordCallBack.getIdentifier());
			if (password != null) {
				passwordCallBack.setPassword(password);
				return;
			}
		}

	}

}