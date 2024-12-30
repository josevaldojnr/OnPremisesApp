// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package system.proxies;

public class WorkflowUserTaskOutcome implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject workflowUserTaskOutcomeMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "System.WorkflowUserTaskOutcome";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Outcome("Outcome"),
		Time("Time"),
		WorkflowUserTaskOutcome_WorkflowUserTask("System.WorkflowUserTaskOutcome_WorkflowUserTask"),
		WorkflowUserTaskOutcome_User("System.WorkflowUserTaskOutcome_User");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public WorkflowUserTaskOutcome(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected WorkflowUserTaskOutcome(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject workflowUserTaskOutcomeMendixObject)
	{
		if (workflowUserTaskOutcomeMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, workflowUserTaskOutcomeMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.workflowUserTaskOutcomeMendixObject = workflowUserTaskOutcomeMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static system.proxies.WorkflowUserTaskOutcome initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new system.proxies.WorkflowUserTaskOutcome(context, mendixObject);
	}

	public static system.proxies.WorkflowUserTaskOutcome load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return system.proxies.WorkflowUserTaskOutcome.initialize(context, mendixObject);
	}

	public static java.util.List<system.proxies.WorkflowUserTaskOutcome> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> system.proxies.WorkflowUserTaskOutcome.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of Outcome
	 */
	public final java.lang.String getOutcome()
	{
		return getOutcome(getContext());
	}

	/**
	 * @param context
	 * @return value of Outcome
	 */
	public final java.lang.String getOutcome(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Outcome.toString());
	}

	/**
	 * Set value of Outcome
	 * @param outcome
	 */
	public final void setOutcome(java.lang.String outcome)
	{
		setOutcome(getContext(), outcome);
	}

	/**
	 * Set value of Outcome
	 * @param context
	 * @param outcome
	 */
	public final void setOutcome(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String outcome)
	{
		getMendixObject().setValue(context, MemberNames.Outcome.toString(), outcome);
	}

	/**
	 * @return value of Time
	 */
	public final java.util.Date getTime()
	{
		return getTime(getContext());
	}

	/**
	 * @param context
	 * @return value of Time
	 */
	public final java.util.Date getTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Time.toString());
	}

	/**
	 * Set value of Time
	 * @param time
	 */
	public final void setTime(java.util.Date time)
	{
		setTime(getContext(), time);
	}

	/**
	 * Set value of Time
	 * @param context
	 * @param time
	 */
	public final void setTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date time)
	{
		getMendixObject().setValue(context, MemberNames.Time.toString(), time);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of WorkflowUserTaskOutcome_WorkflowUserTask
	 */
	public final system.proxies.WorkflowUserTask getWorkflowUserTaskOutcome_WorkflowUserTask() throws com.mendix.core.CoreException
	{
		return getWorkflowUserTaskOutcome_WorkflowUserTask(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkflowUserTaskOutcome_WorkflowUserTask
	 * @throws com.mendix.core.CoreException
	 */
	public final system.proxies.WorkflowUserTask getWorkflowUserTaskOutcome_WorkflowUserTask(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.WorkflowUserTask result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkflowUserTaskOutcome_WorkflowUserTask.toString());
		if (identifier != null) {
			result = system.proxies.WorkflowUserTask.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of WorkflowUserTaskOutcome_WorkflowUserTask
	 * @param workflowusertaskoutcome_workflowusertask
	 */
	public final void setWorkflowUserTaskOutcome_WorkflowUserTask(system.proxies.WorkflowUserTask workflowusertaskoutcome_workflowusertask)
	{
		setWorkflowUserTaskOutcome_WorkflowUserTask(getContext(), workflowusertaskoutcome_workflowusertask);
	}

	/**
	 * Set value of WorkflowUserTaskOutcome_WorkflowUserTask
	 * @param context
	 * @param workflowusertaskoutcome_workflowusertask
	 */
	public final void setWorkflowUserTaskOutcome_WorkflowUserTask(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.WorkflowUserTask workflowusertaskoutcome_workflowusertask)
	{
		if (workflowusertaskoutcome_workflowusertask == null) {
			getMendixObject().setValue(context, MemberNames.WorkflowUserTaskOutcome_WorkflowUserTask.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.WorkflowUserTaskOutcome_WorkflowUserTask.toString(), workflowusertaskoutcome_workflowusertask.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of WorkflowUserTaskOutcome_User
	 */
	public final system.proxies.User getWorkflowUserTaskOutcome_User() throws com.mendix.core.CoreException
	{
		return getWorkflowUserTaskOutcome_User(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkflowUserTaskOutcome_User
	 * @throws com.mendix.core.CoreException
	 */
	public final system.proxies.User getWorkflowUserTaskOutcome_User(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.User result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkflowUserTaskOutcome_User.toString());
		if (identifier != null) {
			result = system.proxies.User.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of WorkflowUserTaskOutcome_User
	 * @param workflowusertaskoutcome_user
	 */
	public final void setWorkflowUserTaskOutcome_User(system.proxies.User workflowusertaskoutcome_user)
	{
		setWorkflowUserTaskOutcome_User(getContext(), workflowusertaskoutcome_user);
	}

	/**
	 * Set value of WorkflowUserTaskOutcome_User
	 * @param context
	 * @param workflowusertaskoutcome_user
	 */
	public final void setWorkflowUserTaskOutcome_User(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.User workflowusertaskoutcome_user)
	{
		if (workflowusertaskoutcome_user == null) {
			getMendixObject().setValue(context, MemberNames.WorkflowUserTaskOutcome_User.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.WorkflowUserTaskOutcome_User.toString(), workflowusertaskoutcome_user.getMendixObject().getId());
		}
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return workflowUserTaskOutcomeMendixObject;
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final system.proxies.WorkflowUserTaskOutcome that = (system.proxies.WorkflowUserTaskOutcome) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

  /**
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}
