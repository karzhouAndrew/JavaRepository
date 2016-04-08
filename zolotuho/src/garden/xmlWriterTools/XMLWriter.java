package garden.xmlWriterTools;


import garden.plants.Plant;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

public class XMLWriter {

    public void write(List<Plant> plants, String path) {
        PlantCatalog plantCatalog = new PlantCatalog();
        plantCatalog.add(plants);
        try {
            JAXBContext context = JAXBContext.newInstance(plantCatalog.getClass());
            Marshaller marshaller = context.createMarshaller();
            try {
                marshaller.marshal(plantCatalog, new FileOutputStream(path));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public void write(PlantCatalog plantCatalog, String path) {
        try {
            JAXBContext context = JAXBContext.newInstance(plantCatalog.getClass());
            Marshaller marshaller = context.createMarshaller();
            try {
                marshaller.marshal(plantCatalog, new FileOutputStream(path));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
