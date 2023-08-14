package DZ1.InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import DZ1.ModelElements.Camera;
import DZ1.ModelElements.Flash;
import DZ1.ModelElements.PoligonalModel;
import DZ1.ModelElements.Scene;

public class ModelStore {
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List<IModelChangedObserver> changeObserver;

    public ModelStore(IModelChangedObserver changeObserver) {

        this.Models = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Cameras = new ArrayList<>();

        this.changeObserver = changeObserver;

        Models.add(new PoligonalModel(null));
        Scenes.add(new Scene());
        Flashes.add(new Flash());
        Cameras.add(new Camera());

    }

    public Scene GetScene(int i_scene) {
        return Scenes.get(i_scene);
    }

    @Override
    public void NotifyChange(IModelChanger sender) {

    }

}
