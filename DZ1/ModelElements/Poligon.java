package DZ1.ModelElements;

import java.util.ArrayList;
import java.util.List;
import DZ1.Stuff.Point3D;

public class Poligon {
    public List<Point3D> points = new ArrayList<>();

    public Poligon(List<Point3D> points) {
        this.points = points;
    }
}