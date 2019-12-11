package interfacAbstract.baitap.comparable;

import interfacAbstract.thuchanh.comparator.Circle;

public class CircleComparable extends Circle implements Comparable<CircleComparable>{
    public CircleComparable(){
    }
    public CircleComparable(double radius){
        super(radius);
    }
    public CircleComparable(double radius, String color, boolean filled){
        super(radius, color, filled);
    }


    @Override
    public int compareTo(CircleComparable o) {
            if (getRadius() > o.getRadius()) return 1;
            else if (getRadius() < o.getRadius()) return -1;
            else return 0;
        }
    }

