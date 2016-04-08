package garden.xmlWriterTools;


import garden.plants.Bush;
import garden.plants.Plant;
import garden.plants.Tree;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "plants")
public class PlantCatalog {
    @XmlElement(name = "tree")
    private List<Tree> treeList = new ArrayList<>();
    @XmlElement(name = "bush")
    private List<Bush> bushList = new ArrayList<>();


    public void add(List<Plant> plants) {
        for (Plant plant : plants) {
            if (plant instanceof Tree) {
                treeList.add((Tree) plant);
            }
            if (plant instanceof Bush) {
                bushList.add((Bush) plant);
            }
        }
    }

    public void clear() {
        treeList.clear();
        bushList.clear();
    }

    public int calculateTotalHeight() {
        int totalHeight = 0;
        for (Tree tree : treeList) {
            totalHeight += tree.getHeight();
        }
        for (Bush bush : bushList) {
            totalHeight += bush.getHeight();
        }
        return totalHeight;
    }

    public int calculateTotalQuantity() {
        return treeList.size() + bushList.size();
    }
}
