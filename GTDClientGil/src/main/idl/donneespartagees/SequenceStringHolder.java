package donneespartagees;


/**
 * donneespartagees/SequenceStringHolder.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from C:/Users/Florian/workspace2/alma-gtd/idl/donneespartagees.idl
 * mercredi 6 janvier 2010 22 h 46 CET
 */

public final class SequenceStringHolder implements org.omg.CORBA.portable.Streamable
{
	public String value[] = null;

	public SequenceStringHolder ()
	{
	}

	public SequenceStringHolder (String[] initialValue)
	{
		value = initialValue;
	}

	public void _read (org.omg.CORBA.portable.InputStream i)
	{
		value = donneespartagees.SequenceStringHelper.read (i);
	}

	public void _write (org.omg.CORBA.portable.OutputStream o)
	{
		donneespartagees.SequenceStringHelper.write (o, value);
	}

	public org.omg.CORBA.TypeCode _type ()
	{
		return donneespartagees.SequenceStringHelper.type ();
	}

}
