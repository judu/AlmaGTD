package donneespartagees;

/**
 * donneespartagees/IContactHolder.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from C:/Users/Florian/workspace2/alma-gtd/idl/donneespartagees.idl
 * mercredi 6 janvier 2010 22 h 46 CET
 */

public final class IContactHolder implements org.omg.CORBA.portable.Streamable
{
	public donneespartagees.IContact value = null;

	public IContactHolder ()
	{
	}

	public IContactHolder (donneespartagees.IContact initialValue)
	{
		value = initialValue;
	}

	public void _read (org.omg.CORBA.portable.InputStream i)
	{
		value = donneespartagees.IContactHelper.read (i);
	}

	public void _write (org.omg.CORBA.portable.OutputStream o)
	{
		donneespartagees.IContactHelper.write (o, value);
	}

	public org.omg.CORBA.TypeCode _type ()
	{
		return donneespartagees.IContactHelper.type ();
	}

}
