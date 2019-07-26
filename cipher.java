class cipher
{
  // Encrypts text using a shift od s 
    public static StringBuffer encrypt (String text, int s)
    {
        StringBuffer result = new StringBuffer ();

        for (int i = 0; i < text.length (); i++)
        {
            if (Character.isUpperCase (text.charAt (i)))
            {
                char ch = (char) (((int)text.charAt (i) + s - 65) % 26 + 65);
                result.append (ch);
            }
            else
            {
                char ch = (char) (((int)text.charAt (i) + s - 97) % 26 + 97);
                result.append (ch);
            }
        }
        return result;

    }
    public static StringBuffer decrypt (StringBuffer text, int s)
    {
        StringBuffer result = new StringBuffer ();
        for (int i = 0; i < text.length (); i++)
        {
            if (Character.isUpperCase (text.charAt (i)))
            {
                char ch = (char) (((int)text.charAt (i) - s - 65) % 26 + 65);
                result.append (ch);
            }
            else
            {
                char ch = (char) (((int)text.charAt (i) - s - 97) % 26 + 97);
                result.append (ch);
            }
        }
        return result;

    }
    public static StringBuffer verman(StringBuffer vtext,StringBuffer skey)
    {
        StringBuffer result = new StringBuffer ();
        for (int i = 0; i < vtext.length (); i++)
        {
        	if (Character.isUpperCase(vtext.charAt (i)))
        	{
        	    char ch = (char) (((int)vtext.charAt(i) + (int)skey.charAt(i) - 130) % 26 + 65);
        	    result.append (ch);
        	}
        	else
        	{
        	    char ch = (char) (((int)vtext.charAt (i) + (int)skey.charAt(i) - 194) % 26 + 97);
        	    result.append (ch);
        	}
        }
        return result;
    }
     public static StringBuffer decryptverman(StringBuffer vcipher,StringBuffer skey)
    {
        StringBuffer result = new StringBuffer ();
        for (int i = 0; i < vcipher.length (); i++)
        {
        	if (Character.isUpperCase(vcipher.charAt (i)))
        	{
        	    char ch = (char) (((int)vcipher.charAt(i) - (int)skey.charAt(i) + 130) % 26 + 65);
        	    result.append (ch);
        	}
        	else
        	{
        	    char ch = (char) (((int)vcipher.charAt (i) + (int)skey.charAt(i) - 194) % 26 + 97);
        	    result.append (ch);
        	}
        }
        return result;
    }

  // Driver code 
    public static void main (String[]args)
    {
        String text = "ATTACKATONCE";
        int s = 4;
        System.out.println ("Text  : " + text);
        System.out.println ("Shift : " + s);
        System.out.println ("Cipher: " + encrypt(text, s));
        StringBuffer result = encrypt (text, s);
        System.out.println ((int) text.charAt (0));
        System.out.println ("decrypted: " + decrypt(result, s));
        System.out.println("---------verman cipher----------");
        StringBuffer vtext = new StringBuffer("HELLO");
        StringBuffer skey = new StringBuffer("RAHUL");
        System.out.println("plain text:" + vtext+ " key:" + skey);
        System.out.println("verman cipher: " + verman(vtext,skey));
        StringBuffer vcipher  = verman (vtext,skey);
        System.out.println("decrypted verman cipher: " + decryptverman(vcipher,skey));
    }
}