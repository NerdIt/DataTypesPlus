package nerdit.dataTypesPlus;

public class Vector3 {

    public double x;
    public double y;
    public double z;

    public Vector3(double... values)
    {
        if(values.length == 1)
        {
            x = values[0];
            y = 0;
            z = 0;
        }
        if(values.length == 2)
        {
            x = values[0];
            y = values[1];
            z = 0;
        }
        if(values.length == 3)
        {
            x = values[0];
            y = values[1];
            z = values[2];
        }
        else
        {
            x = 0;
            y = 0;
            x = 0;
        }
    }
    public Vector3(Vector2 vec)
    {
        x = vec.x;
        y = vec.y;
        z = 0;
    }
    public Vector3(Vector4 vec)
    {
        x = vec.x;
        y = vec.y;
        z = vec.z;
    }
    public Vector3(Vector3 vec)
    {
        x = vec.x;
        y = vec.y;
        z = vec.z;
    }

    public static Vector3 add(Vector3... vectors)
    {
        Vector3 masterVector = new Vector3();
        for(int i = 0; i < vectors.length; i++)
        {
            masterVector.x += vectors[i].x;
            masterVector.y += vectors[i].y;
            masterVector.z += vectors[i].z;
        }
        return masterVector;
    }
    public static Vector3 sub(Vector3... vectors)
    {
        Vector3 masterVector = new Vector3();
        for(int i = 0; i < vectors.length; i++)
        {
            masterVector.x -= vectors[i].x;
            masterVector.y -= vectors[i].y;
            masterVector.z -= vectors[i].z;
        }
        return masterVector;
    }
    public static Vector3 div(Vector3... vectors)
    {
        Vector3 masterVector = new Vector3();
        for(int i = 0; i < vectors.length; i++)
        {
            masterVector.x /= vectors[i].x;
            masterVector.y /= vectors[i].y;
            masterVector.z /= vectors[i].z;
        }
        return masterVector;
    }
    public static Vector3 multi(Vector3... vectors)
    {
        Vector3 masterVector = new Vector3();
        for(int i = 0; i < vectors.length; i++)
        {
            masterVector.x *= vectors[i].x;
            masterVector.y *= vectors[i].y;
            masterVector.z *= vectors[i].z;
        }
        return masterVector;
    }
    public static Vector3 avg(Vector3... vectors)
    {
        Vector3 masterVector = new Vector3();
        for(int i = 0; i < vectors.length; i++)
        {
            masterVector.x += vectors[i].x;
            masterVector.y += vectors[i].y;
            masterVector.z += vectors[i].z;
        }
        masterVector.x /= vectors.length;
        masterVector.y /= vectors.length;
        masterVector.z /= vectors.length;
        return masterVector;
    }
    public static Vector3 add(Vector3 vec, double add)
    {
        Vector3 masterVector = new Vector3();

        masterVector.x += add;
        masterVector.y += add;
        masterVector.z += add;

        return masterVector;
    }
    public static Vector3 sub(Vector3 vec, double sub)
    {
        Vector3 masterVector = new Vector3();

        masterVector.x -= sub;
        masterVector.y -= sub;
        masterVector.z -= sub;

        return masterVector;
    }
    public static Vector3 div(Vector3 vec, double div)
    {
        Vector3 masterVector = new Vector3();

        masterVector.x /= div;
        masterVector.y /= div;
        masterVector.z /= div;

        return masterVector;
    }
    public static Vector3 multi(Vector3 vec, double multi)
    {
        Vector3 masterVector = new Vector3();

        masterVector.x *= multi;
        masterVector.y *= multi;
        masterVector.z *= multi;

        return masterVector;
    }

    public void add(Vector3 vectors)
    {
        x += vectors.x;
        y += vectors.y;
        z += vectors.z;
    }
    public void sub(Vector3 vectors)
    {
        x -= vectors.x;
        y -= vectors.y;
        z -= vectors.z;

    }
    public void div(Vector3 vectors)
    {
        x /= vectors.x;
        y /= vectors.y;
        z /= vectors.z;
    }
    public void multi(Vector3 vectors)
    {
        x *= vectors.x;
        y *= vectors.y;
        z *= vectors.z;
    }
    public void avg(Vector3 vectors)
    {
        double xX = 0;
        double yY = 0;
        double zZ = 0;
        xX = x + vectors.x;
        yY = y + vectors.y;
        zZ = z + vectors.z;
        x = xX / 2;
        y = yY / 2;
        z = zZ / 2;
    }
    public void add(double add)
    {
        x += add;
        y += add;
        z += add;
    }
    public void sub(double sub)
    {
        x -= sub;
        y -= sub;
        z -= sub;
    }
    public void div(double div)
    {
        x /= div;
        y /= div;
        z /= div;
    }
    public void multi(double multi)
    {
        x *= multi;
        y *= multi;
        z *= multi;
    }

    public String toString()
    {
        return new String("{" + x + "," + y + "," + z + "}");
    }

    public Vector2 toVector2()
    {
        return new Vector2(x,y);
    }
    public Vector4 toVector4()
    {
        return new Vector4(x,y,z);
    }

}
