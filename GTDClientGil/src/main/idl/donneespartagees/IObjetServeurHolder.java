package donneespartagees;

/**
 * donneespartagees/IObjetServeurHolder.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from C:/Users/Florian/workspace2/alma-gtd/idl/donneespartagees.idl
 * mercredi 6 janvier 2010 22 h 46 CET
 */


/**
 * Interface regroupant l'ensemble des comportements communs a tous les objets stockes sur le serveur.
 * @author Stephane Begaudeau, Benjamin Gosset, Alex Lagarde, Christophe Renaudineau.
 * @version 1.0.0
 */
public final class IObjetServeurHolder implements org.omg.CORBA.portable.Streamable
{
	public donneespartagees.IObjetServeur value = null;

	public IObjetServeurHolder ()
	{
	}

	public IObjetServeurHolder (donneespartagees.IObjetServeur initialValue)
	{
		value = initialValue;
	}

	public void _read (org.omg.CORBA.portable.InputStream i)
	{
		value = donneespartagees.IObjetServeurHelper.read (i);
	}

	public void _write (org.omg.CORBA.portable.OutputStream o)
	{
		donneespartagees.IObjetServeurHelper.write (o, value);
	}

	public org.omg.CORBA.TypeCode _type ()
	{
		return donneespartagees.IObjetServeurHelper.type ();
	}

}
