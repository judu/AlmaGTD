package donneespartagees.CallbackPackage;


/**
 * donneespartagees/CallbackPackage/UneErreurHelper.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from C:/Users/Florian/workspace2/alma-gtd/idl/donneespartagees.idl
 * mercredi 6 janvier 2010 22 h 46 CET
 */

abstract public class UneErreurHelper
{
	private static String  _id = "IDL:donneespartagees/Callback/UneErreur:1.0";

	public static void insert (org.omg.CORBA.Any a, donneespartagees.CallbackPackage.UneErreur that)
	{
		org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
		a.type (type ());
		write (out, that);
		a.read_value (out.create_input_stream (), type ());
	}

	public static donneespartagees.CallbackPackage.UneErreur extract (org.omg.CORBA.Any a)
	{
		return read (a.create_input_stream ());
	}

	private static org.omg.CORBA.TypeCode __typeCode = null;
	private static boolean __active = false;
	synchronized public static org.omg.CORBA.TypeCode type ()
	{
		if (__typeCode == null)
		{
			synchronized (org.omg.CORBA.TypeCode.class)
			{
				if (__typeCode == null)
				{
					if (__active)
					{
						return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
					}
					__active = true;
					org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
					org.omg.CORBA.TypeCode _tcOf_members0 = null;
					_tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
					_members0[0] = new org.omg.CORBA.StructMember (
							"message",
							_tcOf_members0,
							null);
					_tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_short);
					_members0[1] = new org.omg.CORBA.StructMember (
							"ligne",
							_tcOf_members0,
							null);
					__typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (donneespartagees.CallbackPackage.UneErreurHelper.id (), "UneErreur", _members0);
					__active = false;
				}
			}
		}
		return __typeCode;
	}

	public static String id ()
	{
		return _id;
	}

	public static donneespartagees.CallbackPackage.UneErreur read (org.omg.CORBA.portable.InputStream istream)
	{
		donneespartagees.CallbackPackage.UneErreur value = new donneespartagees.CallbackPackage.UneErreur ();
		// read and discard the repository ID
		istream.read_string ();
		value.message = istream.read_string ();
		value.ligne = istream.read_short ();
		return value;
	}

	public static void write (org.omg.CORBA.portable.OutputStream ostream, donneespartagees.CallbackPackage.UneErreur value)
	{
		// write the repository ID
		ostream.write_string (id ());
		ostream.write_string (value.message);
		ostream.write_short (value.ligne);
	}

}
