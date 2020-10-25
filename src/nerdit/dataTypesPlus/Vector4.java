package nerdit.dataTypesPlus;

public class Vector4 {

    public double x;
    public double y;
    public double z;
    public double w;

    public Vector4(double... values)
    {
        if(values.length == 1)
        {
            x = values[0];
            y = 0;
            z = 0;
            w = 0;
        }
        if(values.length == 2)
        {
            x = values[0];
            y = values[1];
            z = 0;
            w = 0;
        }
        if(values.length == 3)
        {
            x = values[0];
            y = values[1];
            z = values[2];
            w = 0;
        }
        if(values.length == 4)
        {
            x = values[0];
            y = values[1];
            z = values[2];
            w = values[3];
        }
        else
        {
            x = 0;
            y = 0;
            z = 0;
            w = 0;
        }
    }
    public Vector4(Vector2 vec)
    {
        x = vec.x;
        y = vec.y;
        z = 0;
        w = 0;
    }
    public Vector4(Vector3 vec)
    {
        x = vec.x;
        y = vec.y;
        z = vec.z;
        w = 0;
    }
    public Vector4(Vector4 vec)
    {
        x = vec.x;
        y = vec.y;
        z = vec.z;
        w = vec.w;
    }

    public static Vector4 add(Vector4... vectors)
    {
        Vector4 masterVector = new Vector4();
        for(int i = 0; i < vectors.length; i++)
        {
            masterVector.x += vectors[i].x;
            masterVector.y += vectors[i].y;
            masterVector.z += vectors[i].z;
            masterVector.w += vectors[i].w;
        }
        return masterVector;
    }
    public static Vector4 sub(Vector4... vectors)
    {
        Vector4 masterVector = new Vector4();
        for(int i = 0; i < vectors.length; i++)
        {
            masterVector.x -= vectors[i].x;
            masterVector.y -= vectors[i].y;
            masterVector.z -= vectors[i].z;
            masterVector.w -= vectors[i].w;
        }
        return masterVector;
    }
    public static Vector4 div(Vector4... vectors)
    {
        Vector4 masterVector = new Vector4();
        for(int i = 0; i < vectors.length; i++)
        {
            masterVector.x /= vectors[i].x;
            masterVector.y /= vectors[i].y;
            masterVector.z /= vectors[i].z;
            masterVector.w /= vectors[i].w;
        }
        return masterVector;
    }
    public static Vector4 multi(Vector4... vectors)
    {
        Vector4 masterVector = new Vector4();
        for(int i = 0; i < vectors.length; i++)
        {
            masterVector.x *= vectors[i].x;
            masterVector.y *= vectors[i].y;
            masterVector.z *= vectors[i].z;
            masterVector.w *= vectors[i].w;
        }
        return masterVector;
    }
    public static Vector4 avg(Vector4... vectors)
    {
        Vector4 masterVector = new Vector4();
        for(int i = 0; i < vectors.length; i++)
        {
            masterVector.x += vectors[i].x;
            masterVector.y += vectors[i].y;
            masterVector.z += vectors[i].z;
            masterVector.w += vectors[i].w;
        }
        masterVector.x /= vectors.length;
        masterVector.y /= vectors.length;
        masterVector.z /= vectors.length;
        masterVector.w /= vectors.length;
        return masterVector;
    }
    public static Vector4 add(Vector4 vec, double add)
    {
        Vector4 masterVector = new Vector4();

        masterVector.x += add;
        masterVector.y += add;
        masterVector.z += add;
        masterVector.w += add;

        return masterVector;
    }
    public static Vector4 sub(Vector4 vec, double sub)
    {
        Vector4 masterVector = new Vector4();

        masterVector.x -= sub;
        masterVector.y -= sub;
        masterVector.z -= sub;
        masterVector.w -= sub;

        return masterVector;
    }
    public static Vector4 div(Vector4 vec, double div)
    {
        Vector4 masterVector = new Vector4();

        masterVector.x /= div;
        masterVector.y /= div;
        masterVector.z /= div;
        masterVector.w /= div;

        return masterVector;
    }
    public static Vector4 multi(Vector4 vec, double multi)
    {
        Vector4 masterVector = new Vector4();

        masterVector.x *= multi;
        masterVector.y *= multi;
        masterVector.z *= multi;
        masterVector.w *= multi;

        return masterVector;
    }

    public void add(Vector4 vectors)
    {
        x += vectors.x;
        y += vectors.y;
        z += vectors.z;
        w += vectors.w;
    }
    public void sub(Vector4 vectors)
    {
        x -= vectors.x;
        y -= vectors.y;
        z -= vectors.z;
        w -= vectors.w;

    }
    public void div(Vector4 vectors)
    {
        x /= vectors.x;
        y /= vectors.y;
        z /= vectors.z;
        w /= vectors.w;
    }
    public void multi(Vector4 vectors)
    {
        x *= vectors.x;
        y *= vectors.y;
        z *= vectors.z;
        w *= vectors.w;
    }
    public void avg(Vector4 vectors)
    {
        double xX = 0;
        double yY = 0;
        double zZ = 0;
        double wW = 0;
        xX = x + vectors.x;
        yY = y + vectors.y;
        zZ = z + vectors.z;
        wW = z + vectors.w;
        x = xX / 2;
        y = yY / 2;
        z = zZ / 2;
        w = wW / 2;
    }
    public void add(double add)
    {
        x += add;
        y += add;
        z += add;
        w += add;
    }
    public void sub(double sub)
    {
        x -= sub;
        y -= sub;
        z -= sub;
        w -= sub;
    }
    public void div(double div)
    {
        x /= div;
        y /= div;
        z /= div;
        w /= div;
    }
    public void multi(double multi)
    {
        x *= multi;
        y *= multi;
        z *= multi;
        w *= multi;
    }

    public String toString()
    {
        return new String("{" + x + "," + y + "," + z + "}");
    }

    public Vector2 toVector2()
    {
        return new Vector2(x,y);
    }
    public Vector3 toVector3()
    {
        return new Vector3(x,y,z);
    }

}
