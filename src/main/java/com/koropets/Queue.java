package com.koropets;

class QueueBegin
{
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public QueueBegin(int s)
    {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = 0;
        nItems = 0;
    }

    public void insert(long j)
    {
        if(rear == maxSize)
            rear = 0;
        queArray[rear++] = j;
        nItems++;
        System.out.print(j+" ");

    }

    public long remove()
    {
        long temp = queArray[front++];
        if(front == maxSize)
            front = 0;
        nItems--;
        System.out.print(temp+" ");
        return temp;

    }

    public boolean isEmpty()
    {
        return (nItems==0);
    }

}
class Queue
{
    public static void main(String[] args)
    {
        QueueBegin theQueueBegin = new QueueBegin(5);
        System.out.println("Вставка 4 элементов");
        theQueueBegin.insert(10);
        theQueueBegin.insert(20);
        theQueueBegin.insert(30);
        theQueueBegin.insert(40);
        System.out.println();

        System.out.println("Извлечение 3 элементов");
        theQueueBegin.remove();
        theQueueBegin.remove();
        theQueueBegin.remove();
        System.out.println();

        System.out.println("Вставка 4 элементов");
        theQueueBegin.insert(50);
        theQueueBegin.insert(60);
        theQueueBegin.insert(70);
        theQueueBegin.insert(80);
        System.out.println();

       System.out.println("Результат");
        while( !theQueueBegin.isEmpty() )
        {
            long n = theQueueBegin.remove();
            System.out.print("");
        }
        System.out.println("");
    }
}
