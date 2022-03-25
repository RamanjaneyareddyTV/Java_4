package Fridayevening;
// Source: https://bit.ly/2PjMfds
import java.util.*;

public class main_4
{   
    public static void main (String[] args) throws java.lang.Exception
    {
        ArrayList<Interval> x = new ArrayList<>();

        x.add(new Interval(1, 3));
        x.add(new Interval(2, 6));
        x.add(new Interval(8, 10));
        x.add(new Interval(15, 18));
        x.add(new Interval(17, 20));

        x = merge(x);

        for(Interval i : x)
        {
            System.out.println(i.getStart() + " " + i.getEnd());
        }
    }

    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {

        if(intervals.size() == 0 || intervals.size() == 1)
            return intervals;

        Collections.sort(intervals, new IntervalComparator());

        Interval first = intervals.get(0);
        int start = first.getStart();
        int end = first.getEnd();

        ArrayList<Interval> result = new ArrayList<Interval>();

        for (int i = 1; i < intervals.size(); i++) {
            Interval current = intervals.get(i);
            if (current.getStart() <= end) {
                end = Math.max(current.getEnd(), end);
            } else {
                result.add(new Interval(start, end));
                start = current.getStart();
                end = current.getEnd();
            }
        }

        result.add(new Interval(start, end));
        return result;
    }
}

class Interval 
{
    private int start;
    private int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) 
    {
        start = s;
        end = e;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}

class IntervalComparator implements Comparator<Interval>
{
    public int compare(Interval i1, Interval i2)
    {
        return i1.getStart() - i2.getStart();
    }
}

