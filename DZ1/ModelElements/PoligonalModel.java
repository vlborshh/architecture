package DZ1.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Poligon> Poligons;

    public List<Texture> Textures;

    public PoligonalModel(List<Texture> Textures) {
        this.Textures = Textures;
        Poligons = new ArrayList<>();
    }
}
