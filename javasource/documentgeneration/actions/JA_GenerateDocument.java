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
import documentgeneration.implementation.ActionValidator;
import documentgeneration.implementation.DocumentGenerator;

public class JA_GenerateDocument extends CustomJavaAction<IMendixObject>
{
	private java.lang.String pageMicroflow;
	private IMendixObject contextObject;
	private java.lang.String resultEntity;
	private java.lang.String fileName;
	private IMendixObject __generateAsUser;
	private system.proxies.User generateAsUser;
	private java.lang.Boolean waitForResult;

	public JA_GenerateDocument(IContext context, java.lang.String pageMicroflow, IMendixObject contextObject, java.lang.String resultEntity, java.lang.String fileName, IMendixObject generateAsUser, java.lang.Boolean waitForResult)
	{
		super(context);
		this.pageMicroflow = pageMicroflow;
		this.contextObject = contextObject;
		this.resultEntity = resultEntity;
		this.fileName = fileName;
		this.__generateAsUser = generateAsUser;
		this.waitForResult = waitForResult;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		this.generateAsUser = this.__generateAsUser == null ? null : system.proxies.User.initialize(getContext(), __generateAsUser);

		// BEGIN USER CODE
		ActionValidator.validateResultEntity(resultEntity);
		ActionValidator.validatePageMicroflow(pageMicroflow, contextObject);
		ActionValidator.validateContextObject(contextObject);
		ActionValidator.validateFileName(fileName);
		ActionValidator.validateDocumentUser(generateAsUser);
		
		DocumentGenerator generator = new DocumentGenerator(resultEntity, fileName, pageMicroflow, generateAsUser)
				.withContextObject(contextObject)
				.withWaitForResult(waitForResult);
						
		return generator.generate();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "JA_GenerateDocument";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
