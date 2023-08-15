package DZ1.ModelElements;

import java.util.List;

public class Scene {
    public int Id;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> Cameras;

    public Scene(int id, List<PoligonalModel> model, List<Flash> flashes, List<Camera> cameras) throws Exception {

        Id = id;
        if (model.size() > 0) {
            Models = model;
        } else {
            throw new Exception("Должна передаваться как минимум одна модель");
        }
        Flashes = flashes;
        Cameras = cameras;

    }

    public Object method1(Object i) {
        return i;
    }

    public Object method2(Object i, Object y) {
        return i;
    }

}
