package donneespartagees;

/**
 * donneespartagees/IParticipantHolder.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from C:/Users/Florian/workspace2/alma-gtd/idl/donneespartagees.idl
 * mercredi 6 janvier 2010 22 h 46 CET
 */


/**
 * Interface representant un participant.
 * @author Stephane Begaudeau, Benjamin Gosset, Alex Lagarde, Christophe Renaudineau.
 * @version 1.0.0
 */
public final class IParticipantHolder implements org.omg.CORBA.portable.Streamable
{
	public donneespartagees.IParticipant value = null;

	public IParticipantHolder ()
	{
	}

	public IParticipantHolder (donneespartagees.IParticipant initialValue)
	{
		value = initialValue;
	}

	public void _read (org.omg.CORBA.portable.InputStream i)
	{
		value = donneespartagees.IParticipantHelper.read (i);
	}

	public void _write (org.omg.CORBA.portable.OutputStream o)
	{
		donneespartagees.IParticipantHelper.write (o, value);
	}

	public org.omg.CORBA.TypeCode _type ()
	{
		return donneespartagees.IParticipantHelper.type ();
	}

}
