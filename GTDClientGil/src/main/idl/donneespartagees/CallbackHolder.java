package donneespartagees;

/**
 * donneespartagees/CallbackHolder.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from C:/Users/Florian/workspace2/alma-gtd/idl/donneespartagees.idl
 * mercredi 6 janvier 2010 22 h 46 CET
 */


/**
 * L'interface de CallBack permettant au client de recevoir sa reponse.
 * @author Stephane Begaudeau, Benjamin Gosset, Alex Lagarde, Christophe Renaudineau.
 * @version 1.0.0
 */
public final class CallbackHolder implements org.omg.CORBA.portable.Streamable
{
	public donneespartagees.Callback value = null;

	public CallbackHolder ()
	{
	}

	public CallbackHolder (donneespartagees.Callback initialValue)
	{
		value = initialValue;
	}

	public void _read (org.omg.CORBA.portable.InputStream i)
	{
		value = donneespartagees.CallbackHelper.read (i);
	}

	public void _write (org.omg.CORBA.portable.OutputStream o)
	{
		donneespartagees.CallbackHelper.write (o, value);
	}

	public org.omg.CORBA.TypeCode _type ()
	{
		return donneespartagees.CallbackHelper.type ();
	}

}
