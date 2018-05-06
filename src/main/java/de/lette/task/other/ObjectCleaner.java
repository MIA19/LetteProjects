package de.lette.task.other;

public class ObjectCleaner
{
    private static int count;

    public static void main(String[] args)
    {
        int i = 0;
        ObjectCleaner t = new ObjectCleaner();
        System.out.println(t.toString());
        /*while (true)
        {
            i++;
            new ObjectCleaner();
            if(i == 10000)
            {
                System.out.println(count);
                i = 0;
            }
        }*/
    }

    public ObjectCleaner()
    {
        count++;
    }

    @Override
    protected void finalize() throws Throwable
    {
        count--;
        super.finalize();
    }
}
