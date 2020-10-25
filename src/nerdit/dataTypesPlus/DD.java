package nerdit.dataTypesPlus;


import java.util.ArrayList;
import java.util.List;


public class DD<T1,T2> {

    public List<T1> key = new ArrayList<T1>();
    public List<T2> value = new ArrayList<T2>();





    public int length()
    {
        return key.size();
    }

    public void add(T1 k, T2 v)
    {
        key.add(k);
        value.add(v);
    }

    public void Remove(T1 k)
    {

        int index = key.indexOf(k);
        key.remove(index);
        value.remove(index);

    }
    public void RemoveAt(int i)
    {
        if(i < length())
        {
            key.remove(i);
            value.remove(i);
        }
    }

    public T2 get(T1 k)
    {
        int index = key.indexOf(k);

        return value.get(index);
    }

}
