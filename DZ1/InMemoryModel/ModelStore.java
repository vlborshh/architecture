package DZ1.InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import DZ1.ModelElements.Camera;
import DZ1.ModelElements.Flash;
import DZ1.ModelElements.PoligonalModel;
import DZ1.ModelElements.Scene;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List<IModelChangedObserver> changerObserver;

    public ModelStore(IModelChangedObserver changerObserver) throws Exception {

        this.Models = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Cameras = new ArrayList<>();

        this.changerObserver = changerObserver;

        Models.add(new PoligonalModel(null));

        Flashes.add(new Flash());
        Cameras.add(new Camera());
        Scenes.add(new Scene(0, Models, Flashes, Cameras));
    }

    public Scene getScenes(int id) {
        for (int i = 0; i < Scenes.size(); i++) {
            if (Scenes.get(i).Id == id) {
                return Scenes.get(i);
            }
        }
    }

    @Override
    public void NotifyChange(IModelChanger sender) {

    }

}
