// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package documentgeneration.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import documentgeneration.implementation.TokenManager;

public class JA_Token_Request extends CustomJavaAction<IMendixObject>
{
	private java.lang.String username;
	private java.lang.String password;
	private java.lang.String applicationUrl;
	private java.lang.String appId;

	public JA_Token_Request(IContext context, java.lang.String username, java.lang.String password, java.lang.String applicationUrl, java.lang.String appId)
	{
		super(context);
		this.username = username;
		this.password = password;
		this.applicationUrl = applicationUrl;
		this.appId = appId;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		return TokenManager.requestAccessToken(getContext(), username, password, applicationUrl, appId);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "JA_Token_Request";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
