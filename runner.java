public class runner
{
    public static void main(String []agrs)
    {
        QueueUsingStack q = new QueueUsingStack();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.show();

        System.out.println("\n"+q.dequeue());
        System.out.println(q.dequeue()+"\n");
        q.show();
       
    }
}