package nerdit.dataTypesPlus;

public class Vector2 {

    public double x;
    public double y;

    public Vector2(double... values)
    {
        if(values.length != 2)
        {
            x = 0;
            y = 0;
        }
        else
        {
            x = values[0];
            y = values[1];
        }
    }
    public Vector2(Vector3 vec)
    {
        x = vec.x;
        y = vec.y;
    }
    public Vector2(Vector4 vec)
    {
        x = vec.x;
        y = vec.y;
    }
    public Vector2(Vector2 vec)
    {
        x = vec.x;
        y = vec.y;
    }

    public static Vector2 add(Vector2... vectors)
    {
        Vector2 masterVector = new Vector2();
        for(int i = 0; i < vectors.length; i++)
        {
            masterVector.x += vectors[i].x;
            masterVector.y += vectors[i].y;
        }
        return masterVector;
    }
    public static Vector2 sub(Vector2... vectors)
    {
        Vector2 masterVector = new Vector2();
        for(int i = 0; i < vectors.length; i++)
        {
            masterVector.x -= vectors[i].x;
            masterVector.y -= vectors[i].y;
        }
        return masterVector;
    }
    public static Vector2 div(Vector2... vectors)
    {
        Vector2 masterVector = new Vector2();
        for(int i = 0; i < vectors.length; i++)
        {
            masterVector.x /= vectors[i].x;
            masterVector.y /= vectors[i].y;
        }
        return masterVector;
    }
    public static Vector2 multi(Vector2... vectors)
    {
        Vector2 masterVector = new Vector2();
        for(int i = 0; i < vectors.length; i++)
        {
            masterVector.x *= vectors[i].x;
            masterVector.y *= vectors[i].y;
        }
        return masterVector;
    }
    public static Vector2 avg(Vector2... vectors)
    {
        Vector2 masterVector = new Vector2();
        for(int i = 0; i < vectors.length; i++)
        {
            masterVector.x += vectors[i].x;
            masterVector.y += vectors[i].y;
        }
        masterVector.x /= vectors.length;
        masterVector.y /= vectors.length;
        return masterVector;
    }
    public static Vector2 add(Vector2 vec, double add)
    {
        Vector2 masterVector = new Vector2();

        masterVector.x += add;
        masterVector.y += add;

        return masterVector;
    }
    public static Vector2 sub(Vector2 vec, double sub)
    {
        Vector2 masterVector = new Vector2();

        masterVector.x -= sub;
        masterVector.y -= sub;

        return masterVector;
    }
    public static Vector2 div(Vector2 vec, double div)
    {
        Vector2 masterVector = new Vector2();

        masterVector.x /= div;
        masterVector.y /= div;

        return masterVector;
    }
    public static Vector2 multi(Vector2 vec, double multi)
    {
        Vector2 masterVector = new Vector2();

        masterVector.x *= multi;
        masterVector.y *= multi;

        return masterVector;
    }

    public void add(Vector2 vectors)
    {
        x += vectors.x;
        y += vectors.y;
    }
    public void sub(Vector2 vectors)
    {
        x -= vectors.x;
        y -= vectors.y;

    }
    public void div(Vector2 vectors)
    {
        x /= vectors.x;
        y /= vectors.y;
    }
    public void multi(Vector2 vectors)
    {
        x *= vectors.x;
        y *= vectors.y;
    }
    public void avg(Vector2 vectors)
    {
        double xX = 0;
        double yY = 0;
        xX = x + vectors.x;
        yY = y + vectors.y;
        x = xX / 2;
        y = yY / 2;
    }
    public void add(double add)
    {
        x += add;
        y += add;
    }
    public void sub(double sub)
    {
        x -= sub;
        y -= sub;
    }
    public void div(double div)
    {
        x /= div;
        y /= div;
    }
    public void multi(double multi)
    {
        x *= multi;
        y *= multi;
    }

    public String toString()
    {
        return new String("{" + x + "," + y + "}");
    }
    public Vector3 toVector3()
    {
        return new Vector3(new Vector2(x,y));
    }
    public Vector4 toVector4()
    {
        return new Vector4(new Vector2(x,y));
    }

}
